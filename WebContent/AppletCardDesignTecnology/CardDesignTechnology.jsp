<%@ page contentType="text/html; charset=Cp1252" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html:html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=Cp1252"/>
		<title>List Template</title>
		<link href="sistema.css" rel="stylesheet" type="text/css" />
<style type="text/css">
/* Layout */
@import "javascript/dropdown.css";
@import "javascript/dropdown.vertical.css";
/* Theme */
@import "javascript/default.css";
</style>
<script type="text/javascript">
function getTemplates(selectedTemplate){

	var cardTemplatesId = document.getElementById('cardTemplatesId');
	
	if(selectedTemplate == ''){
		cardTemplatesId.options.length = 0;
		cardTemplatesId.options[0] = new Option('Select Template', '');
		return;
	}

	cardTemplatesId.disabled = true;
	
	url=window.location.protocol +"//"+ document.domain + ':' + window.location.port + "/PYC/template.do?method=selectedTypeCard&cardTypeId="+selectedTemplate;	
	url = url.replace("NewWo.do","");
	
	//Do the Ajax call
	if (window.XMLHttpRequest){ // Non-IE browsers
		req = new XMLHttpRequest();
		//A call-back function is define so the browser knows which function to call after the server gives a reponse back
		req.onreadystatechange = populateTemplateBox;
		req.open("GET", url, true); //was get
		req.send(null);
	}

	else if (window.ActiveXObject) { // IE
		req = new ActiveXObject("Microsoft.XMLHTTP");
		if (req) {
			req.onreadystatechange = populateTemplateBox;
			req.open("GET", url, true);
			req.send(null);
		}
	}
}

function populateTemplateBox(){	
	if (req.readyState == 4) { // Complete		
		if (req.status == 200) { // OK response
			textToSplit = req.responseText;
			
			//Split the document
			returnElements = textToSplit.split("||");

			var cardTemplatesId = document.getElementById('cardTemplatesId');
			
					
			//Process each of the elements
			cardTemplatesId.options.length = 0;
			cardTemplatesId.options[0] = new Option('Select Template', '');

			

			if(textToSplit != ''){
				for ( var i=0; i<returnElements.length ; i++ ){
					valueLabelPair = returnElements[i].split(";");
					cardTemplatesId.options[i + 1] = new Option(valueLabelPair[0], valueLabelPair[1]);
					
				}
			}
			cardTemplatesId.disabled = false;
		}
	}
}
</script>
	</head>
	<body>
	
	
<html:form method="POST" action="/AppletCardDesignTecnology/Template" onsubmit="return validateListTemplateForm(this)" styleClass="formulario">
	<div id="system_content">  
		<h1>Template Technology</h1>
	       <div id="data">
	        <!-- Begin Validator Javascript Function-->
       <html:javascript formName="listTemplateForm"/>
       <!-- End of Validator Javascript Function-->
	          <fieldset>
	            
	            <div class="izq">
                 <label>Company Name:</label><label><bean:write name="companyBean"  property="companyName" scope="session"/></label>
                 <label>Customer Name:</label><label><bean:write name="customerBean"  property="customerName" scope="session"/></label>
                 </div>
                 
                 <p></p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				
				<div class="izq">
				<label>Type Of Cards</label>
				 <html:select name="listTemplateForm" property="cardTypeID" styleId="cardTypeId" onchange="return getTemplates(this.options[this.selectedIndex].value);" >
			     <html:option value="">Select Type Of Cards</html:option>
			     <html:options collection="cardTypes" property="cardTypeId" labelProperty="cardTypeDescription"/>
				 </html:select>
			
				<label>Template</label>
				<html:select name="listTemplateForm" property="cardTemplatedID" styleId="cardTemplatesId">
				<html:option value="">Select Template</html:option>
				
				</html:select>
				</div>
				
				<div class="botones">
                  <html:submit property="find" value="View" ></html:submit>
                  </div>
               
             </fieldset>	
           </div>
	</div>

    
        <logic:present name="html_applet" scope="request">
        <bean:write name="html_applet" filter="false"  />
        </logic:present>      

</html:form>
</body>
</html:html>

