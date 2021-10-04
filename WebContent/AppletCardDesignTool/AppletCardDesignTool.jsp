<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="/tags/struts-bean" prefix="bean"%>
<%@ taglib uri="/tags/struts-html" prefix="html"%>
<%@ taglib uri="/tags/struts-logic" prefix="logic"%>
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Cp1252"/>
<title>Create a new Templated</title>
<link href="sistema.css" rel="stylesheet" type="text/css" />
<style type="text/css">
/* Layout */
@import "javascript/dropdown.css";
@import "javascript/dropdown.vertical.css";
/* Theme */
@import "javascript/default.css";
</style>
</head>
<body>
<html:form method="POST" action="/AppletCardDesignTecnology/CardDesignTechnology">
<div id="system_content">
    <h1>Card Design</h1>
     <div id="data">
       <fieldset>  

                 <div class="izq">
                 <label>Company Name:</label><label><bean:write name="companyBean"  property="companyName" scope="session"/></label>
                 <label>Customer Name:</label><label><bean:write name="customerBean"  property="customerName" scope="session"/></label>
                 <label>Name Template:</label><label><bean:write   name="name" scope="session"/></label>
                
                 </div>
                 <p></p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				
				<bean:write name="html_applet" filter="false"  />
				
	           <div class="botones">
               <html:submit property="find"  value="Template Technology"> </html:submit>
	           </div>
	           </fieldset>	
       </div>
	 </div>
	<!-- acádebe estar el ID del nuevop valor -->  
  <!--  html:hidden property="cardTemplatedID" value=""/-->
 <!-- html:hidden property="sw_source" value="AppletCardDesignToolNO"/-->

		
	</html:form>		
</body>
</html:html>
