package cl.open.openproject.bo;


import java.util.Hashtable;

import cl.open.openproject.bean.CompanyBean;
import cl.open.openproject.bean.CustomerBean;
import cl.open.openproject.dao.CompanyDAO;
import cl.open.openproject.interfaces.ApplicationMessage;
import cl.open.openproject.pojo.Company;
import cl.open.openproject.pojo.Customer;





public class SessiondataBO implements ApplicationMessage {
	

	public static Hashtable<Object, Object> SearchCompany(Integer userID) {

		Hashtable<Object, Object> result = new Hashtable<Object, Object>();
		
		CompanyDAO companyDao = new CompanyDAO();

		CompanyBean companyBean = new CompanyBean();
		CustomerBean customerBean = new CustomerBean();
		
		Object[] obj = (Object[]) companyDao.FindCompany(userID);

			if (obj != null) {
				Company objCompany = (Company) obj[0];
				Customer objCustomer = (Customer) obj[1];
				
			    companyBean.setCompanyAutomaticAmount(objCompany.getCompanyAutomaticAmount());
				companyBean.setCompanyAvailableBalance(objCompany.getCompanyAvailableBalance());
				companyBean.setCompanyFlagOffer(objCompany.getCompanyFlagOffer());
				companyBean.setCompanyId(objCompany.getCompanyId());
				companyBean.setCompanyName(objCompany.getCompanyName());
				companyBean.setCompanyPaymentAddress1(objCompany.getCompanyPaymentAddress1());
				companyBean.setIdCreditCard(objCompany.getIdCreditCard());
				companyBean.setStateCountryId(objCompany.getStateCountryId());
				result.put("companyBean", companyBean);

				customerBean.setCompanyId(objCustomer.getCompanyId());
				customerBean.setCustomerAnswerForgot1(objCustomer.getCustomerAnswerForgot1());
				customerBean.setCustomerAnswerForgot2(objCustomer.getCustomerAnswerForgot2());
				customerBean.setCustomerDateCreation(objCustomer.getCustomerDateCreation());
				customerBean.setCustomerId(objCustomer.getCustomerId());
				customerBean.setCustomerName(objCustomer.getCustomerName());
				customerBean.setIdState(objCustomer.getIdState());
				customerBean.setParameterIdcustomerQuestionForgot1(objCustomer.getParameterIdcustomerQuestionForgot1());
				customerBean.setParameterIdcustomerQuestionForgot2(objCustomer.getParameterIdcustomerQuestionForgot2());
				result.put("customerBean", customerBean);

			
			}
		
		
		return result;
	}
	
	
}
