<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Print your Card</title>
<link href="sistema.css" rel="stylesheet" type="text/css" />
<script src="jquery-1.2.6.min.js" type="text/javascript"></script>
<style type="text/css">
/* ============================================================================ 
This copyright notice must be kept untouched in the stylesheet at all times.
The original version of this stylesheet and the associated (x)html is available 
at http://www.stunicholls.com/menu/jquery-menutree.html Copyright (c) 2005-2008 
Stu Nicholls. All rights reserved. This stylesheet and the associated (x)html 
may be modified in any way to fit your requirements.
=============================================================================== */

.padding 	{ height:300px;}
#wrap 		{ width:230px; z-index:100; float:left; position:relative }
#menu2 		{ position:absolute; left:0; top:0; float:left; position:absolute;}
#menu2 a 		{ text-decoration:none !important;}
#menu2, #menu2 ul{ padding:0; margin:0; list-style:none; font-family:arial, sans-serif; font-weight:bold; background:#d1e4ec;}
#menu2 li a 	{ padding-left:20px; white-space:nowrap; }
#menu2 li ul li a { padding-left:0; text-decoration:none;}
#menu2 ul 	{ padding-left:0;}
#menu2 ul li	{ padding:5px 0; background:#d1e4ec;  }
#menu2 li a 	{ color: #013f5e; text-decoration:none; font-size:11px; cursor:pointer; } /*sin submenu*/
#menu2 li a > hover { color:#FF0000; } /*sin submenu*/
#menu2 li 	{ font-size:11px; line-height:25px; color: #013f5e; cursor:pointer; margin-bottom:1px; width:230px;
			  background:#90c0e8 url(img/vineta_sistema.jpg) no-repeat 10px 8px;} /*Con submenu*/
#menu2 li:hover{ color:#fff !important; background:#4174b4 url(img/vineta_sistema2.jpg) no-repeat 8px 12px;}
#menu2 li.down { text-indent:20px;}

ul#menu2 > li.down > ul li { background:none; width:auto !important; line-height:10px; padding-left:0 0 0 10px;}

#menu2 li.down > ul li.down  { color:#013f5e; background:url(img/mas.jpg) no-repeat 19px 7px; padding:5px 0 3px 10px; }
#menu2 li.down > ul li.down:hover  { color:#013f5e !important; }
ul#menu2 > li.down > ul { margin:0 0 10px 0; //margin:0;}

#menu2 li.down > ul li.down > ul { color:#FF0000; padding:0;} 


#menu2 li > ul li a{ color:#5b6c75; background:url(img/menos.jpg) no-repeat 0 7px; padding:0 0 0 10px !important;}
#menu2 li > ul li a:hover { color:#013f5e;}
#menu2 li a:hover {text-decoration:underline;}
#menu2 > li:hover > a { color:#fff;} 
.titulos_menu { width:230px; height:40px; display:block; border:none !important; overflow:hidden; display:inline-block !important; }
.titulos_menu img { display:inline-block; border:none !important; float:left;}
.titulos_menu a > img{ border:none !important;}
img a, a img		{ border: none;}
</style>


<script type="text/javascript">
/* ================================================================ 
This copyright notice must be untouched at all times.
Copyright (c) 2008 Stu Nicholls - stunicholls.com - all rights reserved.
=================================================================== */
$(document).ready(function() {

$("#menu2 ul").hide();
$("#menu2 li:has(ul)").each(function() {
$(this).children().slideUp(400);
});

$("li.p1:has(ul)").click(function(event){
if (this == event.target) {
var current = this;
$("#menu2 li:has(ul)").each(function() {
if (this != current) $(this).children().slideUp(400);
});
$("ul:first", $(this)).slideToggle(400);
}
});

$("li.p2:has(ul)").click(function(event){
if (this == event.target) {
var current = this;
$("li.p2:has(ul)").each(function() {
if (this != current) $(this).children().slideUp(400);
});
$("li.p3:has(ul)").each(function() {
if (this != current) $(this).children().slideUp(400);
});
$("ul:first", $(this)).slideToggle(400);
}
});

$("li.p3:has(ul)").click(function(event){
if (this == event.target) {
var current = this;
$("li.p3:has(ul)").each(function() {
if (this != current) $(this).children().slideUp(400);
});
$("ul:first", $(this)).slideToggle(400);
}
});

});
</script>

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
<div id="header_sistema">
<div id="header">
<ul id="menu_hd">
	<li class="no_borde"><a href="#">Logout</a></li>
	<li><a href="http://www.innovaingenieria.cl">InnovaIngenieria</a></li>
	<li><a href="http://www.cjingenieria.cl">CJIngenieria</a></li>
	<li><a href="#">Canal</a></li>
	<li><a href="#">BLOG</a></li>
</ul>
</div>

</div>
<div id="menu_sistema">
<ul id="nav" class="dropdown dropdown-horizontal">
	<li class="dir"><a href="index.jsp">home</a></li>
	<li class="dir"><a href="print.jsp">print your card</a></li>
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


<div id="columna_menu">
<div id="wrap">
<ul id="menu2">
<div class="titulos_menu"><img src="img/titulos/menu_login.jpg" alt="" /></div>
<li class="p1 down">Request new order
	<ul style="display: none;">
		<li class="p2 down">Local printing   
			<ul style="display: none;">
			<li><a href="#">Print</a></li>
			</ul>
		</li>
	</ul>
</li>
<li class="p1 down">Complete order   
	<ul style="display: none;">
		<li class="p2 down">Local printing   
			<ul style="display: none;">
			<li><a href="#">Print</a></li>
			</ul>
		</li>
	</ul>
</li>
<li class="p1 down">Reprint (one or many cards)  
	<ul style="display: none;">
	<li><a href="#">Global Setting</a></li>
	</ul>
</li>
<li><a href="#">Webshop</a></li>
<li class="p1 down">Payment account
	<ul style="display: none;">
		<li><a href="#">Balance</a></li>
        <li class="p2 down">Refill  
		<ul style="display: none;">
			<li><a href="#">Payment each time</a></li>
            <li><a href="#">Store creditcard and info</a></li>
            <li><a href="#">Payment history</a></li>
		</ul>
		</li>
	</ul>
</li>

<li class="p1 down">Card design tool
	<ul style="display: none;">
		<li><a href="#">Set logo</a></li>
        <li class="p2 down">Set magstripe info  
			<ul style="display: none;">
			<li><a href="#">Tracks 1,2,3: fixed, variable, fixed</a></li>
			</ul>
		</li>
   		<li><a href="#">Set mifare info</a></li>
   		<li><a href="#">Visual design tool</a></li>
        <li><a href="#">Set backside print text</a></li>
	</ul>
</li>

<li class="p1 down">Card and request history  
	<ul style="display: none;">
		<li><a href="#">Search card</a></li>
        <li class="p2 down">Search order     
			<ul style="display: none;">
			<li><a href="#">Reprint billing info </a></li>
			</ul>
		</li>
	</ul>
</li>

<div class="titulos_menu"><img src="img/titulos/menu_user.jpg" alt="" /></div>

<li><a href="#">Create Account</a></li>
<li><a href="#">Forgot Password</a></li>

<a href=""><div class="titulos_menu"><img src="img/titulos/menu_pdf.jpg" alt="" /></div></a>
<div class="titulos_menu"><img src="img/titulos/menu_download.jpg" alt="" /></div>
<li><a href="#">Install printer </a></li>
<li class="p1 down">Install Enrolment  
	<ul style="display: none;">
		<li><a href="#">Plugin / EOS / Webcam </a></li>
	</ul>
</li>

</ul>
</div>
</div><!--FIN COLUMNA MENU -->

<!--*******************************************************************
***********************************************************************
***********************************************************************
CONTENIDO -->


<div id="system_content">
<h1>Card Detail Multicard: Type 4</h1>
<h2>If you click on “search” you will see all existing orders.  Otherwise, enter search terms.</h2>

<div id="data">

<fieldset>
<legend class="card_information">Card Information</legend>
<div class="izq">
<label>Order Number</label><input name="nombre" type="text" size="25" maxlength="60" class="campo1"/>
<label>First Name</label><input name="mail" type="text" size="25" maxlength="60" class="campo1"/>
<label>Personal Number</label><input name="telefono" type="text" size="25" maxlength="60" class="campo1"/>
<label>Gender</label>
<div class="opc_radio"><input name="gender" type="radio" value="" /> Female</div>
<div class="opc_radio" style="border-bottom:1px solid #ccc;"><input name="gender" type="radio" value=""/> Male</div>
<label>Generation date</label><input name="asunto" type="text" size="25" maxlength="60" class="campo2 last"/>
<a href=""><img src="img/iconos/calendar.jpg" alt="" border="0" style="margin:6px 0 0 4px"/></a>
</div><!-- FIN CAJA IZQ-->

<div class="der">
<label>Status</label><input name="telefono" type="text" size="25" maxlength="60" class="campo1"/>
<label>Last Name</label><input name="mail" type="text" size="25" maxlength="60" class="campo1"/>
<label>Nationality</label>
<select name="opc">
<option>Select</option>
<option>Certificate request chipment</option>
<option>Certificate ok</option>
<option>Certificate error</option>
</select>
<label>User ID</label><input name="asunto" type="text" size="25" maxlength="60" class="campo1"/>
<label>Card Position</label>
<div class="opc_radio"><input name="gender" type="radio" value="" /> Vertical</div>
<div class="opc_radio" style="border-bottom:1px solid #ccc;"><input name="gender" type="radio" value=""/> Horizontal</div>
</div><!-- FIN CAJA DER-->

<div class="titulo fill_out">Fill out the information below</div>
<div class="izq">
<label>Request Number</label><input name="nombre" type="text" size="25" maxlength="60" class="campo1"/>
<label>First Name</label><input name="mail" type="text" size="25" maxlength="60" class="campo1"/>
<label>Organization Number</label>
<input name="telefono" type="text" size="25" maxlength="60" class="campo1 last"/>
</div><!-- FIN CAJA IZQ-->
<div class="der">
<label>Status</label><input name="telefono" type="text" size="25" maxlength="60" class="campo1"/>
<label>Last Name</label><input name="mail" type="text" size="25" maxlength="60" class="campo1"/>
<label>Nationality</label><input name="mail" type="text" size="25" maxlength="60" class="campo1 last"/>
</div><!-- FIN CAJA DER-->
<h3>Standard back of the cards <span>(change if you want tex you company address)</span></h3>
<label>Order Number</label><input name="nombre" type="text" size="25" maxlength="60" class="campo3"/>
<label>Order Number</label><input name="nombre" type="text" size="25" maxlength="60" class="campo3"/>
<label>Order Number</label><input name="nombre" type="text" size="25" maxlength="60" class="campo3 last"/>


<h3>EID / Certificate Data</h3>
<div class="box_varios">
<label>Status</label>
<input name="telefono" type="text" size="25" maxlength="10" class="campo4"/>
<input name="telefono" type="text" size="25" maxlength="10" class="campo4"/>
<input name="telefono" type="text" size="25" maxlength="10" class="campo4"/>
</div>
<div class="box_varios">
<label>Status</label>
<input name="telefono" type="text" size="25" maxlength="10" class="campo4"/>
<input name="telefono" type="text" size="25" maxlength="10" class="campo4"/>
<input name="telefono" type="text" size="25" maxlength="10" class="campo4"/>
<input name="telefono" type="text" size="25" maxlength="10" class="campo4"/>
<input name="telefono" type="text" size="25" maxlength="10" class="campo4"/>
<input name="telefono" type="text" size="25" maxlength="10" class="campo4"/>
</div>
<div class="box_varios">
<label>Status</label>
<select name="opc" style="margi">
<option>Select</option>
<option>Certificate request chipment</option>
<option>Certificate ok</option>
<option>Certificate error</option>
</select>
</div>
<div class="botones">
<a href=""><img src="img/botones_sistema/update.gif" alt="" /></a>
<a href=""><img src="img/botones_sistema/back.gif" alt="" /></a>
</div>


</fieldset>
</div>


<div id="data">
<fieldset>

<div class="titulo search">Search Alternative</div>
<div class="izq">
<label>Request Number</label><input name="nombre" type="text" size="25" maxlength="60" class="campo1"/>
<label>First Name</label><input name="mail" type="text" size="25" maxlength="60" class="campo1"/>
<label>Organization Number</label>
<input name="telefono" type="text" size="25" maxlength="60" class="campo1 last"/>
</div><!-- FIN CAJA IZQ-->
<div class="der">
<label>Status</label><input name="telefono" type="text" size="25" maxlength="60" class="campo1"/>
<label>Last Name</label><input name="mail" type="text" size="25" maxlength="60" class="campo1"/>
<label>Nationality</label><input name="mail" type="text" size="25" maxlength="60" class="campo1 last"/>
</div><!-- FIN CAJA DER-->
<div class="botones">
<a href=""><img src="img/botones_sistema/update.gif" alt="" /></a>
<a href=""><img src="img/botones_sistema/back.gif" alt="" /></a>
</div>

<div class="titulo results">Results</div>
<table width="100%" border="0" class="tabla" cellspacing="1" cellpadding="1">
  <tr>
    <th width="17%">Order Number</th>
    <th width="14%">Date </th>
    <th width="24%">Status</th>
    <th width="36%">Card Type</th>
     <th width="9%"><div align="center">Print</div></th>
    </tr>
  <tr>
    <td>000100010111010</td>
    <td>25/12/2010</td>
    <td>Request in process</td>
    <td>Card Type 5</td>
    <td align="center" valign="middle"><input type="checkbox" name="checkbox" id="checkbox" /></td>
    </tr>
  <tr class="color">
    <td>000100010111010</td>
    <td>25/12/2010</td>
    <td>Request in process</td>
    <td>Card Type 5</td>
	<td align="center" valign="middle"><input type="checkbox" name="checkbox" id="checkbox" /></td>
    </tr>
  <tr>
    <td>000100010111010</td>
    <td>25/12/2010</td>
    <td>Request in process</td>
    <td>Card Type 5</td>
    <td align="center" valign="middle"><input type="checkbox" name="checkbox" id="checkbox" /></td>
    </tr>
  <tr class="color">
    <td>000100010111010</td>
    <td>25/12/2010</td>
    <td>Request in process</td>
    <td>Card Type 5</td>
    <td align="center" valign="middle"><input type="checkbox" name="checkbox" id="checkbox" /></td>
    </tr>
  <tr>
    <td>000100010111010</td>
    <td>25/12/2010</td>
    <td>Request in process</td>
    <td>Card Type 5</td>
   <td align="center" valign="middle"><input type="checkbox" name="checkbox" id="checkbox" /></td>
    </tr>
</table>


</fieldset>
</div>


</div><!--FIN SYSTEM CONTENT-->


</body>
</html>
