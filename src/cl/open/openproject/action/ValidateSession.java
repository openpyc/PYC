package cl.open.openproject.action;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import cl.open.openproject.bean.LogInBean;

public class ValidateSession extends DispatchAction {
	public ActionForward validateSession(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		HttpSession session = request.getSession(true);
		//response.setContentType("text/xml"); 	
		response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	String xml = "";
		if (session.getAttribute("logInBean") != null){
			String forward = request.getParameter("action");
			LogInBean objLogInBean = (LogInBean)session.getAttribute("logInBean");
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			XMLEncoder xmlEncoder = new XMLEncoder(baos);
			xmlEncoder.writeObject(objLogInBean);
			xmlEncoder.close();
			xml = baos.toString();
			//window.location =  "http://" + document.domain + ":" + window.location.port + "/WorkOrder/callsession.do?XML=" +req.responseText+ "&forward="+forward;
			//response.sendRedirect("/WorkOrder/callsession.do?XML=" + xml + "&forward="+forward);
			//response.sendRedirect("/WorkOrder/callsession.do?XML=" + xml + "&forward=wOsList");
//			System.out.println(xml);
		}
		else
		{
			xml = "<java>Error</java>";			
		}
        //String outLine = xml;
//		String forward = request.getParameter("forward");
//		String contextforward = request.getParameter("contextforward");
//		String ipname= request.getParameter("ipname");
//		if (ipname ==null)
//			ipname = request.getLocalAddr();
		
    // //   String outLine = "<meta http-equiv='refresh' content='0; url=" +contextforward + xml + "&forward="+forward + "'/>";
   //     String outLine = "<meta http-equiv='refresh' content='0; url='http://localhost:8080/WorkOrder/callsession.do?forward=wOsList'/>";
    //    out.print(outLine);
		String forward = request.getParameter("forward");
		String contextforward = request.getParameter("contextforward");
		String ipname= request.getParameter("ipname");
		if (ipname ==null)
			ipname = request.getLocalAddr();
		
		ActionForward actionForward = new ActionForward();
	//	actionForward.setPath("http://"+ ipname + ":" + request.getLocalPort() +contextforward + xml + "&forward="+forward);
	//	actionForward.setPath("../WorkOrder/callsession.do?forward="+forward+"&XML="+ xml);
		actionForward.setPath(contextforward+"forward="+forward+"&XML="+ xml);
		actionForward.setRedirect(true);
        return actionForward;
        
    //   return mapping.findForward("NONE");
    }

}
