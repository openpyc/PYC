package cl.open.openproject.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;



import java.util.Iterator;
import java.util.List;
 
public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	static {
		try {
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
 
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	public static List HibernateExecuteList(String strQuery)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List result = null;
		try {
			transaction = session.beginTransaction();
			result = session.createQuery(strQuery).list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public static Object HibernateReturnFirstMatch(String strQuery)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List result = null;
		Object obj = null;
		try {
			transaction = session.beginTransaction();
			result = session.createQuery(strQuery).list();
			for (Iterator iterator = result.iterator(); iterator.hasNext();)
			{
				obj = (Object) iterator.next();
				break;
			}
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return obj;
	}
	
//	public static Object HibernateReturnFirstMatchCriteria(String strQuery)
//	{
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction transaction = null;
//		List result = null;
		Object obj = null;
//		try {
//			transaction = session.beginTransaction();
//			User us = new User();
//			Criteria criteria = session.createCriteria();
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
		

//	             criteria.add( Expression.eq( "id", id ) );
//
//	             List results = criteria.list();
//
//	             return ( FacturaDTO )results.get( 0 );
//		return obj;
//	}
}