package cl.open.openproject.menu.form;

import org.apache.struts.action.ActionForm;

public class MenuForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private String resource_html;
	
	private String resource_id;

	/**
	 * @return the resource_id
	 */
	public String getResource_id() {
		return resource_id;
	}

	/**
	 * @param resourceId the resource_id to set
	 */
	public void setResource_id(String resourceId) {
		resource_id = resourceId;
	}

	/**
	 * @return the resource_html
	 */
	public String getResource_html() {
		return resource_html;
	}

	/**
	 * @param resourceHtml the resource_html to set
	 */
	public void setResource_html(String resourceHtml) {
		resource_html = resourceHtml;
	}
}
