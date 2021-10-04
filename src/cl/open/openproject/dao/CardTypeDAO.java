package cl.open.openproject.dao;

import java.util.List;

import cl.open.openproject.pojo.Cardtype;
import cl.open.openproject.util.HibernateUtil;



public class CardTypeDAO {
	
	@SuppressWarnings("unchecked")
	public List<Cardtype> FindCardTypes(Integer RolID,Integer RolID2)
	{
		String strQueryFind;
		if (RolID == 3) // ROL Administrador ID
		 strQueryFind = "select cardtype from Cardtype as cardtype";
		else
		 strQueryFind = "select cardtype from Cardtype as cardtype WHERE RolID = " + RolID;
		return HibernateUtil.HibernateExecuteList(strQueryFind);
	}
	
	@SuppressWarnings("unchecked")
	public List<Cardtype> FindCardTypes(Integer CardTemplatesId)
	{
		String strQueryFind = "select cardtype from Cardtype as cardtype where CardTypeID = "+CardTemplatesId;
		return HibernateUtil.HibernateExecuteList(strQueryFind);
	}
}
