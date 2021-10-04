package cl.open.openproject.dao;

import cl.open.openproject.util.HibernateUtil;

public class CompanyDAO {
	
	public Object FindCompany(Integer userID)
	{
		String strQueryFrom = "from Company com, Customer cus, User usr ";
		String strQueryWhere = "Where usr.UserID = "+userID+" "+ 
								"and usr.CustomerID = cus.customerId "+ 
								"and com.companyId = cus.companyId";

		return HibernateUtil.HibernateReturnFirstMatch(strQueryFrom + strQueryWhere);
	}
}
