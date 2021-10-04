<%@ page contentType="text/html; charset=Cp1252" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html:html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=Cp1252"/>
		<title>List Template</title>
	</head>
	<body>
	<!-- Listar solo los que son del CustomerID (distinto a 1), solo eso puede modificar-->
	

	
	<div id="system_content">  
		<h1>Template Technology</h1>
	       <div id="data">
	         
	            <table  border="0">
	            <tr>
				<td>
				<label>Company Name</label>
				</td>
				<td>
				<label style="width:178px">
				
				<logic:present name="companyBean" scope="session">
				<bean:write name="companyBean"  property="companyName" scope="session"/>
				</logic:present>									
				</label>
				</td>
				</tr>
				<tr>
				<td>
				<label>Customer Name</label>
				</td>
				<td>
				<label style="width:178px">
				<logic:present name="companyBean" scope="session">
				<bean:write name="customerBean"  property="customerName" scope="session"/>
				</logic:present>
				</label>
				</td>
				</tr>
				
	            
               </table>
             	
           </div>
	</div>
<p></p>
    
        <logic:present name="html_applet" scope="request">
        <bean:write name="html_applet" filter="false"  />
        </logic:present>      


</body>
</html:html>

