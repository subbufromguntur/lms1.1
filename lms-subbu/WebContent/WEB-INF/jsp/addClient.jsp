﻿<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html class="no-js" lang="en"> <!--<![endif]-->
<head>
    <meta charset="utf-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

    <title>LMS Admin Panel: Add Client</title>
    <meta name="description" content="slick and responsive Admin Template build with modern techniques like HTML5 and CSS3 to be used for backend solutions of any size.">
    
    <!-- Mobile viewport optimized: h5bp.com/viewport -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <!-- iPhone: Don't render numbers as call links -->
    <meta name="format-detection" content="telephone=no">

    <link rel="shortcut icon" href="favicon.ico" />
    <script lang="javascript">
    	function initialization(){
    		$('.id_manageClient_addClientM').css("color", "red");
    		$('.with_sub')[0].click();
    	}
    	
    </script>
</head>

<body onload="initialization ()">
		<!-- The container of the sidebar and content box -->
		
    	<div role="main" id="main" class="container_12 clearfix">
     
		<jsp:include page="/WEB-INF/jsp/template/toolbar.jsp"/>
		<jsp:include page="/WEB-INF/jsp/template/sidebar.jsp"/>
        <section id="content" class="container_13 clearfix" data-sort="true">
        <div class="successMessage" align="center">${message}</div>
			<h1 >Add Client (Maker)</h1>
			<div id="faq_1">
				<p class="grid_12">
					Add a new client or a partner to the Loyalty Management System (LMS) ecosystem. Programs and offers can be linked to a client/partner.
				</p>
			</div>
			<form:form commandName="clientBean" action="submitClient" method="POST" id="id_client_form" class="grid_12 validate">
				<fieldset>
					<legend>Profile Details</legend>
					
					<div class="row">
						<label for="f1_placeholder">
							<strong>Client Name</strong>
						</label>
						<div>
							<form:input class="required" id="id_clientName" type="text"placeholder="Enter a client name!" name="clientName" path="clientName"/>
						</div>
					</div>
					
					<div class="row">
						<label for="f2_select1">
							<strong>Parent</strong>
							<small></small>
						</label>
						<div>
							<form:select class="search" path="parent" name="parent" id="id_parent" data-placeholder="Choose a Parent" >  
								<option value="-1">-----Select-----</option>
								<c:forEach items="${clientPreConfiguredDataList}" var="parentObj">
								    <option value="${parentObj.parent}"<c:if test="${parent eq parentObj.parent}"> selected="selected"</c:if>>${parentObj.parent}</option>
								</c:forEach>
							</form:select>
						</div>
					</div>
					
					<div class="row">
						<label for="f2_select2">
							<strong>Type</strong>
							<small></small>
						</label>
						<div>
							<form:select path="type" name="type" id="id_type" class="search required" data-placeholder="Choose a Type" >  
								<option value=-1>-----Select-----</option>
								<c:forEach items="${clientPreConfiguredDataList}" var="typeObj">
								    <option value="${typeObj.type}"<c:if test="${type eq typeObj.type}"> selected="selected"</c:if>>${typeObj.type}</option>
								</c:forEach>
							</form:select>
						</div>
					</div>
					
					<div class="row">
						<label for="f2_select2">
							<strong>Category</strong>
							<small></small>
						</label>
						<div>
							<form:select path="category" name="category" id="id_category" class="search required" data-placeholder="Choose a Category" >  
								<option value=-1>-----Select-----</option>
								<c:forEach items="${clientPreConfiguredDataList}" var="categoryObj">
								    <option value="${categoryObj.category}"<c:if test="${category eq categoryObj.category}"> selected="selected"</c:if>>${categoryObj.category}</option>
								</c:forEach>
							</form:select>
						</div>
					</div>
					
					  <div class="row">
						<label for="f8_mi_phone">
							<strong>Phone 1</strong>
							<small>(999) 999-9999</small>
						</label>
						<div>
							<form:input class="maskPhone" name="phone1" id="id_phone1" type="text" path="clientConfigurationDetailsBean.phone1"/>
						</div>
					</div>
					
					<div class="row">
						<label for="f8_mi_phone">
							<strong>Phone 2</strong>
							<small>(999) 999-9999</small>
						</label>
						<div>
							<form:input class="maskPhone" name="phone2" id="id_phone2" type="text"  path="clientConfigurationDetailsBean.phone2"/>
						</div>
					</div>
					
					<div class="row">
						<label for="f1_placeholder">
							<strong>Address Line 1</strong>
						</label>
						<div>
							<form:input type="text" placeholder="Enter address line 1!" name="addressLine1" id="id_addressLine1" path="clientConfigurationDetailsBean.addressLine1"/>
						</div>
					</div>
					
					<div class="row">
						<label for="f1_placeholder">
							<strong>Address Line 2</strong>
						</label>
						<div>
							<form:input type="text" placeholder="Enter address line 2!" name="addressLine2" id="id_addressLine2"  path="clientConfigurationDetailsBean.addressLine2"/>
						</div>
					</div>
					
					<div class="row">
						<label for="f2_select1">
							<strong>Time Zone</strong>
							<small></small>
						</label>
						<div>
							<form:select path="timeZone" name="timeZone" id="id_timeZone" class="search" data-placeholder="Choose a Country" >  
								<option value=-1>-----Select-----</option>
								<c:forEach items="${timeZone}" var="timeZoneObj">
								    <option value="${timeZoneObj}">${timeZoneObj}</option>
								</c:forEach>
							</form:select>
						</div>
					</div>
					
					<div class="row">
						<label for="f2_select1">
							<strong>Country</strong>
							<small></small>
						</label>
						<div>
							<form:select path="clientConfigurationDetailsBean.country" name="country" id="id_country" class="search" data-placeholder="Choose a Country" >  
								<option value=-1>-----Select-----</option>
								<c:forEach items="${countryList}" var="value">
								    <option value="${value.countryName},${value.id}" <c:if test="${selectedCountryValue eq value.countryName}"> selected="selected"</c:if>>${value.countryName}</option>
								</c:forEach>
							</form:select>
						</div>
					</div>
					
					<div class="row">
						<label for="f2_select1">
							<strong>State</strong>
							<small></small>
						</label>
						<div>
							<form:select path="clientConfigurationDetailsBean.state" name="states" id="id_sates" class="satateClass" data-placeholder="Choose a State">
							</form:select>
						</div>
					</div>
					
					<div class="row">
						<label for="f1_placeholder">
							<strong>City</strong>
						</label>
						<div>
							<form:select name="city" path="clientConfigurationDetailsBean.city" id="id_cities" class="search" data-placeholder="Choose a State">
							</form:select>
						</div>
					</div>
					
					<div class="row">
						<label for="f1_textarea_grow">
							<strong>Description</strong>
							<small></small>
						</label>
						<div>
							<form:textarea rows="5" name="description" id="id_description" path="description" />
						</div>
					</div>
					
					<div class="actions">
						<div class="left">
							<input type="reset" value="Cancel" />
						</div>
					
						<div class="right">
							<a href="javascript:void(0);" class="button grey open-add-client-dialog">Add GL Account</a>
							<input type="submit" value="Submit" name=submit id="id_submit_client"/>
						</div>
					</div><!-- End of .actions -->
				</fieldset><!-- End of fieldset -->
				<c:if test="${clientBean.clientGlAccountBean!=null }">
					<input type='hidden' id="id_browserSetSize"	value="${fn:length(clientBean.clientGlAccountBean)}">
				</c:if>
				<c:if test="${clientBean.clientGlAccountBean==null }">
					<input type='hidden' id="id_browserSetSize" value="0">
				</c:if>
				<c:forEach var="clientGlAccountBean" items="${clientBean.clientGlAccountBean}" varStatus="status">
				<form:hidden path="clientGlAccountBean[${status.index}].accountNumber" name="accountName" id="id_accountName" value="${clientGlAccountBean.accountNumber}"/>
				<form:hidden path="clientGlAccountBean[${status.index}].accountId" name="accountId" id="id_accountNumber" value="${clientGlAccountBean.accountId}"/>
				<form:hidden path="clientGlAccountBean[${status.index}].accountType" name="accountType" id="id_accountType" value="${clientGlAccountBean.accountType}"/> 
				</c:forEach>
				
			</form:form>><!-- End of form -->

        </section><!-- End of #content -->

    </div><!-- End of #main -->



    <!-- Spawn $$.loaded -->
    <script>
        $$.loaded();
    </script>
</body>
</html>