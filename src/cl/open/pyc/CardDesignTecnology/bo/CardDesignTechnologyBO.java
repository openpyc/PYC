package cl.open.pyc.CardDesignTecnology.bo;

import cl.open.openproject.interfaces.ApplicationMessage;
import cl.open.pyc.CardDesignTecnology.bean.CardDesignTechnologyBean;

public class CardDesignTechnologyBO implements ApplicationMessage {

	public String CreateCardDesignTechnology(String strcardTemplateID)
	{
		CardDesignTechnologyBean cardDesignTechnologybean = new CardDesignTechnologyBean();
		String strhtmlTechnology =  "<Applet width='650' height='400'>" + 
		                            "<param name='type' value='application/x-java-applet;version=1.5'>"+
		                            "<param name='code' value ='cl.open.openproject.applet.carddesigntecnology.CardDesignTecnologyApplet'>"+
		                            "<param name='archive'	value='AppletCardDesignTecnology.jar,axis-wsdl4j-1.2.jar,axis.jar,commons-discovery-0.4.jar,commons-logging-1.0.4.jar,dom4j.jar,jaws.jar,jboss-jaxrpc.jar,jboss-saaj.jar'>"+
		                            "<param name='CardTemplatedID' value="+strcardTemplateID +">"+
		                            "</Applet>";
		
		cardDesignTechnologybean.setApplet_html(strhtmlTechnology);
		return strhtmlTechnology;
		
		
		
	}
	
	
}
