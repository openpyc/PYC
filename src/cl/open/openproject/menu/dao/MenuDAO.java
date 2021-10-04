package cl.open.openproject.menu.dao;

import java.util.List;

import cl.open.openproject.util.HibernateUtil;

public class MenuDAO {

	@SuppressWarnings("unchecked")
	public List GetAllParents(boolean blnIsLogIn, Integer intRolId)
	{
		String strQueryFindParent = "from " +
				"Resource rs, " +
				"Resource_has_rol rl_rs " +
				"Where " +
				"rs.ResourceParentID is null and " +
				(blnIsLogIn == true ? "rl_rs.RolID = " + intRolId.toString() + " and ": "") +
				//(blnIsLogIn == true ? "rl_rs.resource_id = rs.resource_id and ": "") +
				//"rl_rs.rol_id = " + intRolId.toString() + " and " + 
				"rs.ResourceID = rl_rs.ResourceID and " +
				"rs.ResourceStatus = 1 " +
				" and rl_rs.RolID ="+intRolId+
				"order by rs.ResourceOrderMenu";
		
//		String strQueryFindParent = "from Resource " +
//				"where resource_parent_id is null " +
//				"and resource_status = 1 " +
//				(blnIsLogIn == true ? "": "and resource_login_flg = 0 ") + 
//				"order by resource_order_menu";
		//System.out.println(strQueryFindParent);
		return HibernateUtil.HibernateExecuteList(strQueryFindParent);
	}
	
	@SuppressWarnings("unchecked")
	public List MenuFindChilds(Integer resource_parent_id, boolean blnIsLogIn, Integer intRolId)
	{
		String strQueryFrom = "from Resource rs, Resource_has_rol rl_rs ";
		String strQueryWhere = "where rs.ResourceParentID = " + resource_parent_id.toString() + " and " +
				(blnIsLogIn == true ? "": "rs.ResourceLoginFlg = 0 and ") +
				(blnIsLogIn == true ? "rl_rs.RolID = " + intRolId.toString() + " and ": "") +
				"rl_rs.ResourceID = rs.ResourceID and " +
				"rs.ResourceStatus = 1 ";
		String strQueryOrder = "order by rs.ResourceOrderMenu ";
		//System.out.println(strQueryFrom + strQueryWhere + strQueryOrder);
		return HibernateUtil.HibernateExecuteList(strQueryFrom + strQueryWhere + strQueryOrder);
	}
	
	public List<Object> findname(String cardtemplate)
	{
		String strQuery="from Cardtemplates cat where cat.cardTemplatesId =" +cardtemplate;
		
		return HibernateUtil.HibernateExecuteList(strQuery);
	}
}
