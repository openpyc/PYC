package cl.open.pyc.CardDesignTecnology.form;

import org.apache.struts.action.ActionForm;

public class ListTemplateForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cardTemplatedID;
	private String Applet_html;
	private String cardTypeID;
	private String cardTemplatesOrientation; 
	
	

	public String getCardTemplatesOrientation() {
		return cardTemplatesOrientation;
	}

	public void setCardTemplatesOrientation(String cardTemplatesOrientation) {
		this.cardTemplatesOrientation = cardTemplatesOrientation;
	}

	public String getCardTypeID() {
		return cardTypeID;
	}

	public void setCardTypeID(String cardTypeID) {
		this.cardTypeID = cardTypeID;
	}

	public String getApplet_html() {
		return Applet_html;
	}

	public void setApplet_html(String appletHtml) {
		Applet_html = appletHtml;
	}

	public String getCardTemplatedID() {
		return cardTemplatedID;
	}

	public void setCardTemplatedID(String cardTemplatedID) {
		this.cardTemplatedID = cardTemplatedID;
	}

	

}
