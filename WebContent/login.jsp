<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/tags/struts-bean" prefix="bean"%>
<%@ taglib uri="/tags/struts-html" prefix="html"%>
<%@ taglib uri="/tags/struts-logic" prefix="logic"%>

<html:html>
<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<title>Print your Card</title>
<link type="text/css" rel="stylesheet" href="estilo_pyc.css">

<!--[if lte IE 7]>
<script type="text/javascript" src="javascript/jquery.js"></script>
<script type="text/javascript" src="javascript/jquery.helper.js"></script>
<![endif]-->
</head>
<body>
    <logic:notPresent name="logInBean" scope="session">
		<div id="textos">
			<div class="seccion"><img src="img/titulos/access.jpg" alt="" /></div>
			<p>Here you can create your account in order to start to use the system! <br />
			If you have problem please contact our support!</p>
			<br />
			<br />
			<html:form action="/logIn" method="post" enctype="multipart/form-data" target="_parent" styleClass="formulario">
				<input type="hidden" name="modo" value="send" />
				<label>Username</label>
				<html:text name="logInForm" property="strUserName" styleClass="campos2"></html:text>
				<label>Password</label>
				<html:password name="logInForm" property="strPassword" styleClass="campos2"></html:password>
				<html:submit value="LogIn"></html:submit>
				<h1 style="color: #ff0000; font-size: 150%">
				<logic:present name="logInErrorMessage" scope="request">
					<bean:write name="logInErrorMessage" filter="false" />
				</logic:present>
				</h1>
				<a href="/pycUserAccount/forgotPass.do" class="forgot">Forgot your password? &nbsp;|</a><a href="/pycUserAccount/createUser.do" class="create">Create an account</a>
			</html:form>
		</div>	
	</logic:notPresent>
	<logic:present name="logInBean" scope="session">
	<div id="textos"> 
	 <h1>Welcome!!!</h1>
	 </div>
	</logic:present>
</body>
</html:html>