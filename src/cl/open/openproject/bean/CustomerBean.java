package cl.open.openproject.bean;

import java.util.Date;

@SuppressWarnings("serial")
public class CustomerBean implements java.io.Serializable {
	private Long customerId;
	private Integer companyId;
	private Integer stateCountryId;
	private String customerName;
	private Integer parameterIdcustomerQuestionForgot1;
	private String customerAnswerForgot1;
	private Integer parameterIdcustomerQuestionForgot2;
	private String customerAnswerForgot2;
	private Integer idState;
	private Date customerDateCreation;

	public CustomerBean() {
	}

	public CustomerBean(Integer companyId, Integer stateCountryId) {
		this.companyId = companyId;
		this.stateCountryId = stateCountryId;
	}

	public CustomerBean(Integer companyId, Integer stateCountryId,
			String customerName, Integer parameterIdcustomerQuestionForgot1,
			String customerAnswerForgot1,
			Integer parameterIdcustomerQuestionForgot2,
			String customerAnswerForgot2, Integer idState,
			Date customerDateCreation) {
		this.companyId = companyId;
		this.stateCountryId = stateCountryId;
		this.customerName = customerName;
		this.parameterIdcustomerQuestionForgot1 = parameterIdcustomerQuestionForgot1;
		this.customerAnswerForgot1 = customerAnswerForgot1;
		this.parameterIdcustomerQuestionForgot2 = parameterIdcustomerQuestionForgot2;
		this.customerAnswerForgot2 = customerAnswerForgot2;
		this.idState = idState;
		this.customerDateCreation = customerDateCreation;
	}

	public Long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getStateCountryId() {
		return this.stateCountryId;
	}

	public void setStateCountryId(Integer stateCountryId) {
		this.stateCountryId = stateCountryId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getParameterIdcustomerQuestionForgot1() {
		return this.parameterIdcustomerQuestionForgot1;
	}

	public void setParameterIdcustomerQuestionForgot1(
			Integer parameterIdcustomerQuestionForgot1) {
		this.parameterIdcustomerQuestionForgot1 = parameterIdcustomerQuestionForgot1;
	}

	public String getCustomerAnswerForgot1() {
		return this.customerAnswerForgot1;
	}

	public void setCustomerAnswerForgot1(String customerAnswerForgot1) {
		this.customerAnswerForgot1 = customerAnswerForgot1;
	}

	public Integer getParameterIdcustomerQuestionForgot2() {
		return this.parameterIdcustomerQuestionForgot2;
	}

	public void setParameterIdcustomerQuestionForgot2(
			Integer parameterIdcustomerQuestionForgot2) {
		this.parameterIdcustomerQuestionForgot2 = parameterIdcustomerQuestionForgot2;
	}

	public String getCustomerAnswerForgot2() {
		return this.customerAnswerForgot2;
	}

	public void setCustomerAnswerForgot2(String customerAnswerForgot2) {
		this.customerAnswerForgot2 = customerAnswerForgot2;
	}

	public Integer getIdState() {
		return this.idState;
	}

	public void setIdState(Integer idState) {
		this.idState = idState;
	}

	public Date getCustomerDateCreation() {
		return this.customerDateCreation;
	}

	public void setCustomerDateCreation(Date customerDateCreation) {
		this.customerDateCreation = customerDateCreation;
	}

}
