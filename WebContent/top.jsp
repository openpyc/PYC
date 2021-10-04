<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-tiles" prefix="titles" %>
<!-- add code csj-->
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
#wrap 		{ width:250px; z-index:100; float:left;position:relative; }
#menu2 		{ position:absolute; left:0; top:0; }
#menu2 a 		{ text-decoration:none !important;}
#menu2, #menu2 ul{ padding:0; margin:0; list-style:none; font-family:arial, sans-serif; font-weight:bold; background:#d1e4ec;}
#menu2 li a 	{ padding-left:20px; white-space:nowrap; }
#menu2 li ul li a { padding-left:0; text-decoration:none;}
#menu2 ul 	{ padding-left:20px;}
#menu2 ul li	{ padding:5px 0; background:#d1e4ec;  }
#menu2 li a 	{ color: #013f5e; text-decoration:none; font-size:11px; cursor:pointer; } /*sin submenu*/
#menu2 li a > hover { color:#FF0000; } /*sin submenu*/
#menu2 li 	{ font-size:11px; line-height:25px; color: #013f5e; cursor:pointer; margin-bottom:1px; width:250px;
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
<!-- end add code-->

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="header_sistema">
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

</div>

<div id="menu_sistema">
<ul class="dropdown dropdown-horizontal" id="nav">
	<li class="dir"><a href="index.jsp" TARGET="_parent">home</a></li>
	<!--li class="dir"><a href="print.jsp" TARGET="_parent">print your card</a></li-->
	<li class="dir"><a href="appweb.html" TARGET="_parent">Application</a></li>	
	<li class="dir"><a href="support.jsp" TARGET="_parent">support</a></li>
	<li class="dir"><a href="partners.jsp" TARGET="_parent">partner program</a></li>
	<li class="dir"><a href="contact.jsp" TARGET="_parent">contact</a></li>
</ul>
</div>
</body>
</html>