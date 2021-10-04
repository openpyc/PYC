package cl.open.openproject.menu.action;


import java.util.Locale;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cl.open.openproject.bean.LogInBean;
import cl.open.openproject.interfaces.ApplicationMessage;
import cl.open.openproject.menu.bo.MenuBO;

public class MenuAction extends Action implements ApplicationMessage {

	@SuppressWarnings("static-access")
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(true);
		String respuesta = "menu";
        this.applicationMessage.setLocaleResourceBundle(this.getLocale(request));        
        Locale locale = this.getLocale(request);
        String lang = locale.getLanguage();
        
		boolean blnIsLogIn = false;
		Integer intRolId = 1;
		
		if (session.getAttribute("logInBean") != null){
			LogInBean objLogInBean = (LogInBean)session.getAttribute("logInBean");
			intRolId = objLogInBean.getIntRolId();
			blnIsLogIn = true;
			respuesta ="success";
		}
		
        //ok create the menu witout access
		request.setAttribute("menu", new MenuBO().CreateMenu(blnIsLogIn,intRolId,lang));
		return mapping.findForward(respuesta);
	}
}
