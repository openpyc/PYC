package cl.open.pyc.CardDesignTecnology.action;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cl.open.openproject.interfaces.ApplicationMessage;
import cl.open.pyc.CardDesignTecnology.bo.CardDesignTechnologyBO;


public class TemplateAction extends Action implements ApplicationMessage {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		    String respuesta = "success";
		    String cardTemplatedID =(String)request.getParameter("cardTemplatedID");
		   
		    request.setAttribute("html_applet", new CardDesignTechnologyBO().CreateCardDesignTechnology(cardTemplatedID));
		  
		    return mapping.findForward(respuesta);
	}
}
