package cl.open.openproject.menu.bo;

import java.util.Iterator;
import java.util.List;

import cl.open.openproject.interfaces.ApplicationMessage;
import cl.open.openproject.menu.bean.ResourceBean;
import cl.open.openproject.menu.dao.MenuDAO;
import cl.open.openproject.menu.pojo.Resource;


public class MenuBO implements ApplicationMessage{

	@SuppressWarnings("unchecked")
	public ResourceBean CreateMenu(boolean blnIsLogIn, Integer intRolId, String lang)
	{
		MenuDAO menuDao = new MenuDAO();
		ResourceBean resourceBean = new ResourceBean();
		
		List resources = menuDao.GetAllParents(blnIsLogIn,intRolId);
		String strHtmlMenu = "<div id='columna_menu'><div id='wrap'><ul id='menu2'>";
		int intMenuNumber = 1;
		for (Iterator iterator = resources.iterator(); iterator.hasNext();)
		{
			Object[] obj = (Object[])iterator.next();
			Resource resouce = (Resource)obj[0];
			
			String strItemInit = "";
			if (resouce.getResourceLevel() == 1) {
				strItemInit = "<div class='titulos_menu'>";
			}
			String strItemLinkEnd = "";
			if (resouce.getResourceLinkURL() != null){
				strItemInit = strItemInit + "<a href='" + resouce.getResourceLinkURL() + "' TARGET='central'>";
				strItemLinkEnd = "</a>";
			}
			String strItemEnd ="";
			if (resouce.getResourceLevel() == 1) {
				strItemEnd = "</div>";
			}
			// HRA
			String key = resouce.getResourceLabel();
			// use key to look for resource (text or image) on properties file
			String resource = applicationMessage.getString(key);
			if (isImage(resource)) {
				// Is image
				resource = "<img src=\""+applicationMessage.getString("images.folder")+"/"+lang+"/"+resource+"\">";
			}
			// HRA
			strHtmlMenu = strHtmlMenu + strItemInit + resource + strItemLinkEnd + strItemEnd;
			strHtmlMenu = strHtmlMenu + this.MenuFindChilds(resouce.getResourceID(),String.valueOf(intMenuNumber), blnIsLogIn, intRolId, lang)/* + "</td></tr>"*/;
			intMenuNumber++;
			
		}
		String strItemEnd = "</ul></div></div>";
		strHtmlMenu = strHtmlMenu + strItemEnd;
		System.out.println(strHtmlMenu);
		resourceBean.setResource_html(strHtmlMenu);
		return resourceBean;
	}
	
	@SuppressWarnings("unchecked")
	public String MenuFindChilds(Integer resource_parent_id, String strParentNumber, boolean blnIsLogIn, Integer intRolId, String lang){
		MenuDAO menuDao = new MenuDAO();

		int intMenuNumber = 1;
		//String strHtmlCode = "<ul style='list-style:none;'>";
		String init = "";
		String end = "";
		String strHtmlCode = /*""*/"";
		List resources = menuDao.MenuFindChilds(resource_parent_id, blnIsLogIn, intRolId);
		if (resources.size() == 0){
			return "";
		}
		else{
			for (Iterator iterator = resources.iterator(); iterator.hasNext();)
			{
				Object[] obj = (Object[])iterator.next();
				Resource resouce = (Resource)obj[0];
				int level = resouce.getResourceLevel();

				String strItemEnd = "</li>";
				// HRA
				String key = resouce.getResourceLabel();
				// use key to look for resource (text or image) on properties file
				String resource = applicationMessage.getString(key);
				if (isImage(resource)) {
					// Is image
					resource = "<img src=\""+applicationMessage.getString("images.folder")+"/"+lang+"/"+resource+"\">";				}
				// HRA				

				if ((level == 3) || (level == 4)){
					init="<ul style='list-style:none;'>";
					end="</ul>";
				} 

				String strItemInit = "<li>";
				String strItemLinkEnd = "";
				String son = this.MenuFindChilds(resouce.getResourceID(),strParentNumber + "." + String.valueOf(intMenuNumber), blnIsLogIn, intRolId, lang);

				if (level == 2) {
					strItemInit = "<li class='p1 down'>";
				} else if (level == 4) {
					strItemInit = "<li>";
				}				

				if (son.equals("")){					
					if ((level == 3) || (level == 4)) {
						//strItemInit = "<li><a href='#'>";
						strItemInit = "<li>";
						/*if (resouce.getResourceLinkURL() == null){
							strItemInit = strItemInit+"<a href='#'>";
						}*/						
					} 			
				} else {
					if (level == 3) {
						strItemInit = "<li class='p2 down'>";
					}
				}

				if (resouce.getResourceLinkURL() != null){
					strItemInit = strItemInit + "<a href='" + resouce.getResourceLinkURL() + "' TARGET='central'>";
					strItemLinkEnd = "</a>";
				} else if (son.equals("") && ((level == 3) || (level == 4))){
					strItemInit = strItemInit+"<a href='#'>";
					strItemLinkEnd = "</a>";
				}	

				strHtmlCode = strHtmlCode + strItemInit + resource + strItemLinkEnd;
				strHtmlCode = strHtmlCode + son + strItemEnd;
				intMenuNumber++;
			}
			//strHtmlCode = strHtmlCode + "</ul>";
		}
		return init + strHtmlCode +end;
	}
	
	public boolean isImage(String src){
		String ext = applicationMessage.getString("images.extensions");
		String [] temp = null;
		temp = ext.split(" ");
		
		for (int i = 0; i < temp.length; i++) {
			if (src.endsWith(temp[i])){
				return true;
			}
		}		
		return false;		
	}
}
