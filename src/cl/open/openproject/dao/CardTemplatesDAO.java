package cl.open.openproject.dao;


import java.util.List;

import cl.open.openproject.pojo.Cardtemplates;
import cl.open.openproject.util.HibernateUtil;


public class CardTemplatesDAO {
	
	@SuppressWarnings("unchecked")
	public List<Cardtemplates> FindTemplatesall(Integer userID){
		String strQueryFind =/* "select ca from Cardtemplates ca, Customer cu, User us " +
				"where ca.customerId = cu.customerId " +
				"and us.CustomerID = cu.customerId " +
				"or us.CustomerID = "+ 1 + "and us.UserID = "+userID +
				" union " + */
		" select ca from Cardtemplates ca" +
		" where ca.customerId = 1";
		
		return HibernateUtil.HibernateExecuteList(strQueryFind);
	}
	
	@SuppressWarnings("unchecked")
	public List<Cardtemplates> FindTemplatesByCardType(Integer cardTypeId,Integer user){
		String strQueryFind = "select ct from User us, Cardtemplates ct where "+
		                      "us.UserID="+user+" and ct.customerId = us.CustomerID"+ " and ct.cardTypeId = " + cardTypeId +
							  " union " +
							  " select ct from Cardtemplates ct where "+
							  " ct.customerId = 1 "+ " and ct.cardTypeId = " + cardTypeId;
		
		return HibernateUtil.HibernateExecuteList(strQueryFind);
	}
	
	@SuppressWarnings("unchecked")
	public List<Cardtemplates> FindTemplatesUser(Integer userID){
		String strQueryFind = "select ca from Cardtemplates ca, Customer cu, User us " +
				"where ca.customerId = cu.customerId " +
				"and us.CustomerID = cu.customerId " +
				"and us.UserID = "+userID;
		return HibernateUtil.HibernateExecuteList(strQueryFind);
	}
	
	@SuppressWarnings("unchecked")
	public List<Cardtemplates> FindCardTemplatesbyID(String strCardTemplatedId)
	{
		String strQueryFind = "select ca.cardTemplatesPreview from Cardtemplates ca where ca.cardTemplatesId = '"+ strCardTemplatedId +"'";
		return HibernateUtil.HibernateExecuteList(strQueryFind);
	}
	
	@SuppressWarnings("unchecked")
	public List selectTemplatePreview(Long cardTemplatesId){    	
		String strQueryFind = "select ca.cardTemplatesPreview from Cardtemplates ca where ca.cardTemplatesId = "+cardTemplatesId;
		return HibernateUtil.HibernateExecuteList(strQueryFind);    	
    }
	
}
