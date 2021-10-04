package cl.open.pyc.CardDesign.action;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import cl.open.openproject.dao.CardTemplatesDAO;
import cl.open.openproject.interfaces.ApplicationMessage;



public class CardTemplatesAction extends DispatchAction implements ApplicationMessage{

	@SuppressWarnings("unchecked")
	public ActionForward returnTemplate(ActionMapping mapping, ActionForm  form, HttpServletRequest request, HttpServletResponse response)throws Exception {
		Long cardTemplateId = new Long(request.getParameter("cardTemplatesId"));		
		CardTemplatesDAO ifd = new CardTemplatesDAO();
		List list = ifd.selectTemplatePreview(cardTemplateId);	
		
		if(list!=null && list.size()!=0){			
			byte[] image = (byte[]) list.get(0);

				if (image != null) {					
					//Flush the buffer
					response.flushBuffer();
					
					// Set content type 
					response.setContentType("image/jpeg");					
					
					response.setDateHeader ("Expires", 0);
					response.setHeader ("Pragma", "no-cache");
					if (request.getProtocol().equals ("HTTP/1.1")) {
						response.setHeader ("Cache-Control", "no-cache");
					}

					// Open the file and output streams 
					ByteArrayInputStream in = new ByteArrayInputStream(image);
					OutputStream out = response.getOutputStream();

					// Copy the contents of the file to the output stream
					byte[] buf = new byte[1024]; 
					int count = 0; 
					while ((count = in.read(buf)) >= 0) { 
						out.write(buf, 0, count); 
					}

					in.close(); 
					out.close();
			}
		}
		return null;
	}
	
}
