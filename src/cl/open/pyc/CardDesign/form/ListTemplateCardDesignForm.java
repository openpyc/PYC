package cl.open.pyc.CardDesign.form;

import org.apache.struts.action.ActionForm;

@SuppressWarnings("serial")
public class ListTemplateCardDesignForm  extends ActionForm{

	private String cardTemplatedID;
	private String Applet_html;
	private String CustomerID;
	private String CardTemplatesName;
	private String inputTemplateField;
	private String cardTypeId;
	private String cardTemplatesOrientation; 
	
	
	public String getCardTemplatesOrientation() {
		return cardTemplatesOrientation;
	}
	public void setCardTemplatesOrientation(String cardTemplatesOrientation) {
		this.cardTemplatesOrientation = cardTemplatesOrientation;
	}
	public String getCardTypeId() {
		return cardTypeId;
	}
	public void setCardTypeId(String cardTypeId) {
		this.cardTypeId = cardTypeId;
	}
	
	
	
	public String getCardTemplatedID() {
		return cardTemplatedID;
	}
	public void setCardTemplatedID(String cardTemplatedID) {
		this.cardTemplatedID = cardTemplatedID;
	}
	public String getApplet_html() {
		return Applet_html;
	}
	public void setApplet_html(String appletHtml) {
		Applet_html = appletHtml;
	}
	public String getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	public String getCardTemplatesName() {
		return CardTemplatesName;
	}
	public void setCardTemplatesName(String cardTemplatesName) {
		CardTemplatesName = cardTemplatesName;
	}
	public String getInputTemplateField() {
		return inputTemplateField;
	}
	public void setInputTemplateField(String inputTemplateField) {
		this.inputTemplateField = inputTemplateField;
	}
	
	
}
