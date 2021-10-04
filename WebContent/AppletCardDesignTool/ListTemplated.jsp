<%@ page contentType="text/html; charset=Cp1252" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Cp1252"/>
<title>Template List</title>
</head>

<body>
<p> </p>

<html:form method="POST" action="/AppletCardDesignTool/Template">
 <div id="system_content">
    <h1>Card Design</h1>
	   <div id="data">
	      <fieldset>  
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
				<tr>
				<td>
				<label>Types Of Cards</label>
				</td>
				<td>
				<html:select name="listTemplateCardDesignForm" property="cardTypeId" >
				<html:option value="">Select Type of Cards</html:option>
				<html:options  collection="cardTypes" property="cardTypeId" labelProperty="cardTypeDescription"/>
				</html:select>
				</td>
				</tr>
				<tr>
				<td>
				<label>Card Template</label>
				</td>
				<td>
				<html:select name="listTemplateCardDesignForm" property="cardTemplatedID" >
				<html:option value="">Select Template</html:option>
				<html:options  collection="cardTemplates" property="cardTemplatesId" labelProperty="cardTemplatesName"/>
				</html:select>
				</td>
				</tr>
            </table>
            <table width="643" border="1">
            <!--DWLayoutTable-->
                <tr> 
                <td width="633" height="262" align="center">&nbsp; Preview</td>
                </tr>
            </table>
            <br>
            New Name for the template : <input  name="textinput" type="text">&nbsp;  <html:submit property="find"  value="Use The Template" ></html:submit>
         </fieldset>	
       </div>
	 </div>
</html:form>
</body>
</html:html>
