<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-tiles" prefix="titles" %>

<table border="0" cellpadding="5" cellspacing="0">
	<tr>
		<td>
			[My Account]
		</td>
		<td>
			<html:link action="/index">[Main Menu]</html:link>
		</td>
		<logic:present name="logInBean" scope="session">
        <td>
        	<html:link action="/logOut">[Log Out]</html:link>
        </td>
        </logic:present>
	</tr>
</table>
<br />