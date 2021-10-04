<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-tiles" prefix="titles" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Print your Card</title>
<link href="estilo_pyc.css" rel="stylesheet" type="text/css" />

<style type="text/css">
/* Layout */
@import "javascript/dropdown.css";
@import "javascript/dropdown.vertical.css";
/* Theme */
@import "javascript/default.css";
</style>
<!--[if lte IE 7]>
<script type="text/javascript" src="javascript/jquery.js"></script>
<script type="text/javascript" src="javascript/jquery.helper.js"></script>
<![endif]-->
</head>

<body>
<div id="header">
<ul id="menu_hd">
	<logic:present name="logInBean" scope="session">
		<li class="no_borde"><a href="logOut.do" target="_parent">LogOut</a></li>
	</logic:present>
	<logic:notPresent name="logInBean" scope="session">
		<li class="no_borde"><a href="appweb.html" target="_parent">LogIn</a></li>
	</logic:notPresent>
	<li><a href="http://www.innovaingenieria.cl">InnovaIngenieria</a></li>
	<li><a href="http://www.cjingenieria.cl">CJIngenieria</a></li>
	<li><a href="#">Canal</a></li>
	<li><a href="#">BLOG</a></li>
</ul>
</div>


<div id="contenedor">

<div id="contenido">
<div id="menu">
<ul id="nav" class="dropdown dropdown-horizontal">
	<li class="dir"><a href="index.jsp">home</a></li>
	<li class="dir"><a href="appweb.html">Application</a></li>
	<li class="dir"><a href="support.jsp">support</a>
	<!--	<ul>
			<li><a href="support.php">Pharetra arcu sed</a></li>
			<li><a href="support.php">Litora torquent</a></li>
            <li><a href="support.php">Nullam volutpat tincidunt</a></li>
			<li><a href="support.php">Quisque suscipit viverra</a></li>
            <li><a href="support.php">Duis pharetra arcu</a></li>
            <li><a href="support.php">Praesent tortor magna</a></li>
            <li><a href="support.php">Class aptent taciti</a></li>
			</ul>
	--></li>
	<li class="dir"><a href="partners.jsp">partner program</a></li>
	<li class="dir"><a href="contact.jsp">contact</a></li>
</ul>
</div><!--FIN MENU -->




<div id="info">

<div id="textos">

<div class="seccion"><img src="img/titulos/access.jpg" alt="" /></div>
<p>Here you can create your account in order to start to use the system! <br />
If you have problem please contact our support!</p>
<br/><br/><br/><br/>
<html:form action="/logIn" method="post" enctype="multipart/form-data" styleClass="formulario">
<input type="hidden" name="modo" value="send" />
<label>Username</label><html:text name="logInForm" property="strUserName" styleClass="campos2"></html:text>
<label>Password</label><html:password name="logInForm" property="strPassword" styleClass="campos2"></html:password>
<html:submit value="LogIn"></html:submit>
        		<h1 style="color:#ff0000;font-size:150%">
        		<logic:present name="logInErrorMessage" scope="request">
        			<bean:write name="logInErrorMessage" filter="false"  />
        		</logic:present></h3>
                
				<logic:messagesPresent message="true" name="see_err">
						<script>javascript:alert('<html:messages id="see_msg" message="true"><bean:write name="see_msg" /></html:messages>')</script>
				</logic:messagesPresent>

        		<a href="" class="forgot">Forgot your password? &nbsp;|</a><a href="" class="create">Create an account</a>
        		
</html:form>
</div>
</div>
<div class="dw_textos"></div>


<div style="float:left">
<div id="pie">Nunc iaculis blandit odio, eu hendrerit diam viverra id. Nam blandit libero quis urna ornare adipiscing. <a href="mailto:contact@pyc.com">contact@pyc.com</a></div>
<!--FIN PIE -->
</div>
</div><!--FIN CONTENIDO -->
</div><!--FIN CONTENEDOR -->


</body>
</html>