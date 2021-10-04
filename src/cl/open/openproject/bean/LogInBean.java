package cl.open.openproject.bean;

import java.util.Date;

public class LogInBean {

	private String strUserName;
	private String strUserPassword;
	private Date datLastLogIn;
	private boolean blnIsLogIn;
	private String strLogMessage;
	private Integer intUserId;
	private Integer intRolId;
	private String strRolDescription;
	
	
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
	 * @return the strUserPassword
	 */
	public String getStrUserPassword() {
		return strUserPassword;
	}
	/**
	 * @param strUserPassword the strUserPassword to set
	 */
	public void setStrUserPassword(String strUserPassword) {
		this.strUserPassword = strUserPassword;
	}
	/**
	 * @return the datLasLogIn
	 */
	public Date getDatLastLogIn() {
		return datLastLogIn;
	}
	/**
	 * @param datLasLogIn the datLasLogIn to set
	 */
	public void setDatLastLogIn(Date datLastLogIn) {
		this.datLastLogIn = datLastLogIn;
	}
	/**
	 * @return the blnIsLogIn
	 */
	public boolean isBlnIsLogIn() {
		return blnIsLogIn;
	}
	/**
	 * @param blnIsLogIn the blnIsLogIn to set
	 */
	public void setBlnIsLogIn(boolean blnIsLogIn) {
		this.blnIsLogIn = blnIsLogIn;
	}
	/**
	 * @return the strLogMessage
	 */
	public String getStrLogMessage() {
		return strLogMessage;
	}
	/**
	 * @param strLogMessage the strLogMessage to set
	 */
	public void setStrLogMessage(String strLogMessage) {
		this.strLogMessage = strLogMessage;
	}
	/**
	 * @return the intUserId
	 */
	public Integer getIntUserId() {
		return intUserId;
	}
	/**
	 * @param intUserId the intUserId to set
	 */
	public void setIntUserId(Integer intUserId) {
		this.intUserId = intUserId;
	}
	/**
	 * @return the intRolId
	 */
	public Integer getIntRolId() {
		return intRolId;
	}
	/**
	 * @param intRolId the intRolId to set
	 */
	public void setIntRolId(Integer intRolId) {
		this.intRolId = intRolId;
	}
	/**
	 * @return the strRolDescription
	 */
	public String getStrRolDescription() {
		return strRolDescription;
	}
	/**
	 * @param strRolDescription the strRolDescription to set
	 */
	public void setStrRolDescription(String strRolDescription) {
		this.strRolDescription = strRolDescription;
	}
}
