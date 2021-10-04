<%@ page contentType="text/html; charset=Cp1252" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Cp1252"/>
<title>Template List</title>
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
			var orientation = document.getElementById('orientation');
					
			//Process each of the elements
			cardTemplatesId.options.length = 0;
			cardTemplatesId.options[0] = new Option('Select Template', '');

			orientation.options.length = 0;

			if(textToSplit != ''){
				for ( var i=0; i<returnElements.length ; i++ ){
					valueLabelPair = returnElements[i].split(";");
					cardTemplatesId.options[i + 1] = new Option(valueLabelPair[0], valueLabelPair[1]);
					orientation.options[i] = new Option(valueLabelPair[2], valueLabelPair[1]);				
				}
			}
			cardTemplatesId.disabled = false;
		}
	}
}

function getTemplate(comboItem){

	var selectedTemplateId = comboItem.options[comboItem.selectedIndex].value;
	if (selectedTemplateId != '') {

		var width  = 650;
		var height = 300;
		
		var cardTemplatesOrientation = document.getElementById('orientation').options[comboItem.selectedIndex - 1].text;
//var cardTemplatesOrientation='V';
		if (cardTemplatesOrientation == 'H'){			
			//Horizontal
			width  = 650;
			height = 300; 
		} else if (cardTemplatesOrientation == 'V'){
			//Vertical			
			width  = 500;
			height = 400;		
		}
		
		document.getElementById('iframe').src = './iframePreview.jsp?cardTemplatesId='+selectedTemplateId+'&width='+width+'&height='+height;
		document.getElementById('iframe').height= height + 25;		
	}
}

</script>
</head>

<body>
<html:form method="POST" action="/AppletCardDesignTool/Template" onsubmit="return validateListTemplateCardDesignForm(this)" styleClass="formulario">
 <div id="system_content">
    <h1>Card Design</h1>
	   <div id="data">
	   <!-- Begin Validator Javascript Function-->
       <html:javascript formName="listTemplateCardDesignForm"/>
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
				<html:select name="listTemplateCardDesignForm" property="cardTypeId" styleId="cardTypeId" onchange="return getTemplates(this.options[this.selectedIndex].value);">
				<html:option value="">Select Type Of Cards</html:option>
				<html:options  collection="cardTypes" property="cardTypeId" labelProperty="cardTypeDescription"/>
				</html:select>
				<label>Template</label>
				<html:select name="listTemplateCardDesignForm" property="cardTemplatedID" styleId="cardTemplatesId" onchange="javascript:getTemplate(this);" >
				<html:option value="">Select Template</html:option>
			
				</html:select>
				<html:select style="display:none" name="listTemplateCardDesignForm" property="cardTemplatesOrientation" styleId="orientation"></html:select>
				</div>
            
            
            <!--DWLayoutTable-->
            <h3>Template preview <span>(previsualize the template)</span></h3>
            <div id="framed">
					<iframe src="" id="iframe" name="iframe" width="100%" height="0px" scrolling="auto" frameborder="0">
						This page require's frame support.
					</iframe>
			</div>
             
             
             
             <div class="botones">
             <html:submit property="find"  value="Use The Template" ></html:submit>
             </div>
             
         </fieldset>	
       </div>
	 </div>
	 
</html:form>
</body>
</html:html>
