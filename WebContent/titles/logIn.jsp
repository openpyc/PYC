<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-tiles" prefix="titles" %>

<html:form action="/logIn" method="post" enctype="multipart/form-data">
    <p></p>
    <table border="0" cellpadding="5" cellspacing="0">
        <tr>
            <td align="left">
                User Name:<br />
                <html:text name="logInForm" property="strUserName"></html:text>
            </td>
            <td align="left">
                Password:<br />
                <html:password name="logInForm" property="strPassword"></html:password>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <html:submit value="LogIn"></html:submit>
            </td>
        </tr>
        <tr>
        	<td colspan="2">
        		<logic:present name="logInErrorMessage" scope="request">
        			<bean:write name="logInErrorMessage" filter="false" />
        		</logic:present>
        	</td>
        </tr>
    </table>
</html:form>