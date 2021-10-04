package cl.open.pyc.CardDesign.bo;

import cl.open.openproject.interfaces.ApplicationMessage;
import cl.open.pyc.CardDesign.bean.CardDesignBean;

public class CardDesignBO implements ApplicationMessage{
	public String CreateCardDesign(String strcardTemplateID, String strCustomerID)
	{   //insert applet
		CardDesignBean cardDesignbean = new CardDesignBean();
		String strhtml =  "<Applet width='930' height='540'>" + 
		                            "<param name='type' value='application/x-java-applet;version=1.5'>"+
		                            "<param name='code' value ='cl.open.openproject.applet.carddesigntool.CardDesignToolApplet'>"+
		                            "<param name='archive'	value='AppletCardDesignTool.jar,axis-wsdl4j-1.2.jar,axis.jar,commons-discovery-0.4.jar,commons-logging-1.0.4.jar,dom4j.jar,jaws.jar,jboss-jaxrpc.jar,jboss-saaj.jar'>"+
		                            "<param name='CardTemplatedID' value="+strcardTemplateID +">"+
		                            "<param name='CustomerID'  value="+ strCustomerID + ">"+
		                            "</Applet>";
		System.out.println(strhtml);
		cardDesignbean.setApplet_html(strhtml);
		return strhtml;
		
		
		
	}
	
}
