package cl.open.openproject.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import cl.open.openproject.bean.LogInBean;
import cl.open.openproject.bo.LogInBO;
import cl.open.openproject.form.LogInForm;


public class LogInAction extends Action {

	public ActionForward execute( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response )
    {
		String result ="success";
		HttpSession session = request.getSession(true);
		ActionMessages messages = new ActionMessages();
		
		if(session.getAttribute("logInBean") == null){
			LogInForm frmLogIn = (LogInForm)form;
			LogInBean objLogInBean = new LogInBean();
			LogInBO objLogInBO = new LogInBO();
			
			objLogInBean = objLogInBO.LogInUser(frmLogIn.getStrUserName(), frmLogIn.getStrPassword());
			
			if (objLogInBean.isBlnIsLogIn()){
				session.setAttribute("logInBean", objLogInBean);
				request.removeAttribute("logInErrorMessage");
			}
			else{
				request.setAttribute("logInErrorMessage", objLogInBean.getStrLogMessage());
				messages.add("see_err1",new ActionMessage("menu.create_account.label"));
				result ="error";
			}

			frmLogIn.setStrPassword("");
			frmLogIn.setStrUserName("");
		} else {
			result ="home";
		}
		
		if (!messages.isEmpty())
		    saveMessages(request,messages);
    	return mapping.findForward(result);
    }
}
