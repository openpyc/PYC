package cl.open.pyc.CardDesign.action;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cl.open.openproject.bean.CardtemplatesBean;
import cl.open.openproject.bean.CardtypeBean;
import cl.open.openproject.bean.CompanyBean;
import cl.open.openproject.bean.CustomerBean;
import cl.open.openproject.bean.LogInBean;
import cl.open.openproject.bo.CardTemplatesBO;
import cl.open.openproject.bo.CardTypeBO;
import cl.open.openproject.bo.SessiondataBO;
import cl.open.openproject.interfaces.ApplicationMessage;


public class ListTemplatesCardDesign  extends Action implements ApplicationMessage{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession(true);
		String respuesta = "error";
		
		if (session.getAttribute("logInBean") != null)
		  {
			LogInBean objLogInBean = (LogInBean)session.getAttribute("logInBean");
			
			CompanyBean objCompanyBean = new CompanyBean();
			CustomerBean objCustomerBean = new CustomerBean();
			//get data login
			Hashtable<Object, Object> ht = SessiondataBO.SearchCompany(objLogInBean.getIntUserId());
			objCompanyBean	= (CompanyBean)	ht.get("companyBean");
			objCustomerBean = (CustomerBean)ht.get("customerBean");
			
			session.setAttribute("companyBean", objCompanyBean);
			session.setAttribute("customerBean", objCustomerBean);
			//get collection card types
			CardTypeBO objCardTypeBO = new CardTypeBO();
	        List<CardtypeBean> cardTypes = new ArrayList<CardtypeBean>();
	        cardTypes = objCardTypeBO.SearchCardTypes(objLogInBean.getIntRolId());
	        request.setAttribute("cardTypes", cardTypes);
	      //get collection card templates
	        CardTemplatesBO objCardTemplatesBO = new CardTemplatesBO();
	    	List<CardtemplatesBean> cardTemplates = new ArrayList<CardtemplatesBean>();
	    	cardTemplates = objCardTemplatesBO.SearchCardTemplates(objLogInBean.getIntUserId());
	    	request.setAttribute("cardTemplates", cardTemplates);
			
			respuesta ="success";
		  }
		else
		    respuesta ="error";
		
		
		return mapping.findForward(respuesta);
		
	}
}
