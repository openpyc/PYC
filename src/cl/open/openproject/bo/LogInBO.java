package cl.open.openproject.bo;

import java.util.Date;

import cl.open.openproject.bean.LogInBean;
import cl.open.openproject.dao.LogInDAO;
import cl.open.openproject.pojo.Rol;
import cl.open.openproject.pojo.User;


public class LogInBO {

	public LogInBean LogInUser(String strUserName, String strUserPassword){
		LogInDAO objLogInDao = new LogInDAO();
		LogInBean objLogInBean = new LogInBean();
		if(strUserName.isEmpty() || strUserPassword.isEmpty()){
			objLogInBean.setBlnIsLogIn(false);
			objLogInBean.setStrLogMessage("User and Password are requiered.");
			return objLogInBean;
		}
		else{
			Object[] obj = (Object[])objLogInDao.LogInUser(strUserName, strUserPassword);
			if (obj != null){
				User objUser = (User)obj[0];
				Rol objRol = (Rol)obj[2];
				
				objLogInBean.setDatLastLogIn(new Date());
				objLogInBean.setStrUserName(objUser.getUserName());
				objLogInBean.setStrUserPassword(objUser.getUserPassword());
				objLogInBean.setBlnIsLogIn(true);
				objLogInBean.setIntRolId(objRol.getRolID());
				objLogInBean.setIntUserId(objUser.getUserID());
				objLogInBean.setStrRolDescription(objRol.getRolDescription());
				return objLogInBean;
			}
			else{
				objLogInBean.setBlnIsLogIn(false);
				objLogInBean.setStrLogMessage("Wrong Password, try again.");
				return objLogInBean;
			}
		}
			
		
	}
}
