package cl.open.openproject.form;

import org.apache.struts.action.ActionForm;

@SuppressWarnings("serial")
public class LogInForm extends ActionForm {

	private String strUserName;
	private String strPassword;
	/**
	 * @return the strUserName
	 */
	public String getStrUserName() {
		return strUserName;
	}
	/**
	 * @param strUserName the strUserName to set
	 */
	public void setStrUserName(String strUserName) {
		this.strUserName = strUserName;
	}
	/**
	 * @return the strPassword
	 */
	public String getStrPassword() {
		return strPassword;
	}
	/**
	 * @param strPassword the strPassword to set
	 */
	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}
	
}
