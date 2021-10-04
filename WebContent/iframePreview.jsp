<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-tiles" prefix="titles" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html:html>
<head>
	<meta http-equiv="expires" content="now"/>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="Cache-Control" content="no-cache"/>
	<title>Iframe Page</title>
	 
	<script type="text/javascript">		

	</script>
	
</head>
<body>
	<table border="0" align="center">
		<tr>
			<td align="center"><img width='<%=request.getParameter("width")%>' height='<%=request.getParameter("height")%>' src='../templatePreview.do?method=returnTemplate&cardTemplatesId=<%=request.getParameter("cardTemplatesId")%>&type=front&rnd=<%= (int) (Math.random() * 10) %>'></img></td>				
		</tr>		
	</table>
</body>
</html:html>