package cl.open.pyc.CardDesign.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import cl.open.openproject.bean.LogInBean;
import cl.open.openproject.bo.CardTemplatesBO;

public class ListTemplateAction extends DispatchAction {

	public ActionForward selectedTypeCard(ActionMapping mapping, ActionForm  form, HttpServletRequest request, HttpServletResponse response)throws Exception {
		CardTemplatesBO cardTemplatesBO = new CardTemplatesBO();
		Integer cardTypeId = Integer.parseInt((String) request.getParameter("cardTypeId"));
		HttpSession session = request.getSession(true);
		//get data user
		LogInBean objLogInBean = (LogInBean)session.getAttribute("logInBean");
    	response.setContentType("text/xml"); 	
    	PrintWriter out = response.getWriter();
    	//get card template by card type and user
        String outLine = cardTemplatesBO.FindTemplates(cardTypeId,objLogInBean.getIntUserId());
        out.print(outLine);
		return null;
    }
}
