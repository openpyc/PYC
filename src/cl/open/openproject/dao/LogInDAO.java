package cl.open.openproject.dao;


import cl.open.openproject.util.HibernateUtil;

public class LogInDAO {

	public Object LogInUser(String strUserName, String strUserPassword){
		
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction transaction = null;
//		List result = null;
//		Object obj = null;
//		try {
//			transaction = session.beginTransaction();
//			User us = new User();
//			Criteria objCriteria = session.createCriteria(User.class);
//			objCriteria.add(Expression.eq( "user_name", strUserName ) );
//			
//			for (Iterator iterator = result.iterator(); iterator.hasNext();)
//			{
//				obj = (Object) iterator.next();
//				break;
//			}
//			transaction.commit();
//		} catch (HibernateException e) {
//			transaction.rollback();
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
		
		String strQueryFindParent = "from " +
				"User usr, " +
				"User_has_rol usrRol, " +
				"Rol rl " +
				"Where " +
				"usr.UserPassword = '" + strUserPassword + "' and " +
				"usr.UserName = '" + strUserName + "' and " +
				"usr.UserID = usrRol.UserID and " +
				"usrRol.RolID = rl.RolID";
//		String  = "from User " +
//				"where user_name = '" + strUserName + "' and " +
//				"user_password = '" + strUserPassword + "'";
		//System.out.println(strQueryFindParent);
		return HibernateUtil.HibernateReturnFirstMatch(strQueryFindParent);
	}
}
