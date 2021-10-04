package cl.open.pyc.CardDesign.action;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cl.open.openproject.bean.CustomerBean;
import cl.open.openproject.interfaces.ApplicationMessage;
import cl.open.openproject.menu.dao.MenuDAO;
import cl.open.openproject.pojo.Cardtemplates;
import cl.open.pyc.CardDesign.bo.CardDesignBO;
import cl.open.pyc.CardDesign.form.ListTemplateCardDesignForm;


public class TemplatesCardDesign  extends Action implements ApplicationMessage{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		     
		    MenuDAO menudao = new MenuDAO();
		    HttpSession session = request.getSession(true);
		    String respuesta ="success";
		    CustomerBean objCustomerBean = new CustomerBean();
		    ListTemplateCardDesignForm formct =(ListTemplateCardDesignForm)form;
		    String cardtemplate=formct.getCardTemplatedID();
		    List<Object> listcard= menudao.findname(cardtemplate);
		    Cardtemplates cardtemplates =(Cardtemplates) listcard.get(0);
		    session.setAttribute("name", cardtemplates.getCardTemplatesName());
		    
		    objCustomerBean = (CustomerBean) session.getAttribute("customerBean");
		    String customer =  objCustomerBean.getCustomerId().toString();
		    String cardTemplatedID = (String)request.getParameter("cardTemplatedID");
		    
		    request.setAttribute("html_applet", new CardDesignBO().CreateCardDesign(cardTemplatedID, customer));
		  
		    return mapping.findForward(respuesta);
		   
		   
	}
}
