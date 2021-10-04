<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="/tags/struts-bean" prefix="bean" %> 
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
	<head>

	<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<title>Use Smart Phone</title>
<link href="estilo_pyc.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="javascript/jquery-1.3.1.min.js"></script>

<style type="text/css">
/* Layout */
@import "javascript/dropdown.css";
@import "javascript/dropdown.vertical.css";
/* Theme */
@import "javascript/default.css";
</style>

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
</div><!--FIN HEADER -->


<div id="contenedor_idx">

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

<div class="box">

<div id="slider">
<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0" width="400" height="270">
<param name="movie" value="slide.swf" />
<param name="quality" value="high" />
<embed src="slide.swf" quality="high" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" width="400" height="270"></embed>
</object>
</div>

<div class="testimonio">
  <blockquote>My business is mobile so I needed a completely mobile terminal.<br />
    I am very happy with the service and support I receive from Print Your Card Solutions. Its all so easy!!</blockquote>
  <p><strong>&#8212; Steven Harrison</strong><br />
    Project Manager MSC Company</p>
</div><!-- FIN testimonio --> 

<div class="caja" style="margin:0 10px 0 0;">
<img src="img/pestana_login.jpg" alt="" />
<div class="caja_up"></div>
<div class="caja_txt">
<html:form method="POST" action="/logIn.do" styleClass="login" target="_parent">
<label>Username</label><input name="strUserName" type="text" size="25" maxlength="60" class="campos2" />
<label>Password</label><input name="strPassword" type="password" size="25" maxlength="60" class="campos2"/>
<button class="enter"></button>
<a href="/pycUserAccount/forgotPass.do" class="forgot">Forgot your password? &nbsp;|</a><a href="/pycUserAccount/createUser.do" class="create">Create an account</a>
</html:form>
</div>
<div class="caja_dw"></div>
</div>

<div class="caja">
<img src="img/pestana_video.jpg" alt="" />
<div class="caja_up"></div>
<div class="caja_txt">
<ul>
<li><a href="#">Design and order card.</a></li>
<li><a href="#">Print a card on local printer.</a></li>
<li><a href="#">Login on computer and usage in passage system.</a></li>
</ul>
</div>
<div class="caja_dw"></div>
</div>


</div><!-- FIN BOX --> 

<div class="box2"><div class="box2_img"><img src="img/free.jpg" alt=""/></div>
<h1>Design your cards</h1><p>And print on your printer FREE!!!</p></div>

<div class="box2"><div class="box2_img"><img src="img/cards.jpg" alt=""/></div>
<h1>Use the cards</h1><p>For show who you and your employees are, passage systems and for login on your computer!</p></div>

<div class="box2"><div class="box2_img"><img src="img/print.jpg" alt=""/></div>
<h1>We print for you</h1>
<p>You design the cards. Full support encoding of magstripe, mifare and contact chip. From 5 per card!</p>
</div>

<div class="box2"><div class="box2_img"><img src="img/support.jpg" alt=""/></div>
<h1>Datacard SP series</h1><p>Full support encoding of magstripe, mifare and contact chip. <br />
  From  per card!</p>
</div>
<div class="box2"><div class="box2_img"><img src="img/windows.jpg" alt=""/></div>
<h1>Printer support</h1>
<p>visual cards can be printed from any  Windows supported printer.</p>
</div>
<div class="box2"><div class="box2_img"><img src="img/car.jpg" alt=""/></div>
<h1>No start fees for order ! </h1>
<p>Only fee per card and mail!</p>
</div>
 <div id="pie_idx">Nunc iaculis blandit odio, eu hendrerit diam viverra id. Nam blandit libero quis urna ornare adipiscing. <a href="mailto:contact@pyc.com">contact@pyc.com</a>
</div>
</div><!--FIN CONTENIDO -->
</div><!--FIN CONTENEDOR -->
</body>
</html:html>

