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

<div class="seccion"><img src="img/titulos/support.jpg" alt="" /></div>

<div style="width:370px; float:left;">
<div class="img_txt"><img src="img/img_support.jpg" alt="" /></div>

<div class="tutorials">
<div class="see"></div>
<div class="videos">
&raquo; <a href="">How to design and print a card.</a><br />
&raquo; <a href="">How to print on any printer.</a><br />
&raquo; <a href="">How to use a Datacard SP55 or Sp75 with the system.</a><br />
</div> 
</div>

</div>

<ul class="lista">
<li>If you need support please contact us!</li>
</ul>

<ul class="datos">
<li><img src="img/telefono.gif" alt="" /><strong>Phone number:</strong> +46 8 111111111</li>
<li><img src="img/skype.gif" alt="" /><strong>Skype:</strong> print_your_card support</li>
<li><img src="img/mail.gif" alt="" /><strong>Email:</strong> support@discnorth.se</li>
</ul>



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
