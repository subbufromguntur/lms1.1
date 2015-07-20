
<%@ page language="java" contentType="text/html"%>
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
    		$('.id_manageUser_addUserM').css("color", "red");
    		$('.with_sub')[2].click();
    	}
    	
    </script>
</head>

<body class="grid_12" onload="initialization ()">
<a href="#" id="alert"></a><br>
		<!-- The container of the sidebar and content box -->
		
    	<div role="main" id="main" class="container_12 clearfix">
     
		<jsp:include page="/WEB-INF/doc_root/jsp/template/toolbar.jsp"/>
		<jsp:include page="/WEB-INF/doc_root/jsp/template/sidebar.jsp"/>
        <section id="content" class="container_13 clearfix" data-sort="true">
        <%-- <div class="successMessage" align="center">${message}</div> --%>
			<h1 >Add User (Maker)</h1>
			<div id="faq_1">
					<p class="grid_12">
						Add a new user for a client or a partner. Please choose a role which best suits the user. Once the user is created the password will be mailed to the email id of the user entered below.
					</p>
			</div>
			<form:form commandName="lmsUserCredentails" action="submitUser" method="POST" id="id_user_form">
				<fieldset>
					<legend>User Details</legend>
					
					<div class="row">
						<label for="f2_select1">
							<strong>Client</strong>
							<small></small>
						</label>
						<div>
							<form:select class="search required" path="clientId" name="client" id="id_client" data-placeholder="Choose a Parent" >  
								<option value="-1">-----Select-----</option>
								<c:forEach items="${client}" var="clientObj">
								    <option value="${clientObj.id}">${clientObj.clientName}</option>
								</c:forEach>
							</form:select>
						</div>
					</div>
					
					<div class="row">
						<label for="f2_select1">
							<strong>Role</strong>
							<small></small>
						</label>
						<div>
							<form:select class="search required" path="lmsUserPermission.userGroupId" name="roles" id="id_roles" data-placeholder="Choose a Parent" >  
								<option value="-1">-----Select-----</option>
								<c:forEach items="${roles}" var="rolesObject">
								    <option value="${rolesObject.groupId}">${rolesObject.name}</option>
								</c:forEach>
							</form:select>
						</div>
					</div>
					
					<div class="row">
						<label for="f1_placeholder">
							<strong>User Name</strong>
						</label>
						<div>
							<form:input type="text" class="required" path="userName" placeholder="Enter a user name!" name="userName" id="id_userName" />
							<form:input type="hidden" path="password"/>
						</div>
					</div>
					
					<div class="row">
						<label for="f1_placeholder">
							<strong>First Name</strong>
						</label>
						<div>
							<form:input type="text" class="required" path="lmsUserProfile.firstname" placeholder="Enter a first name!" name="firstname" id="id_firstname" />
						</div>
					</div>
					
					<div class="row">
						<label for="f1_placeholder">
							<strong>Last Name</strong>
						</label>
						<div>
							<form:input type="text" class="required" path="lmsUserProfile.lastname" placeholder="Enter a last name!" name="lastname" id="id_lastname" />
						</div>
					</div>
					
					<div class="row">
						<label for="f8_mi_phone">
							<strong>Phone 1</strong>
							<small>(999) 999-9999</small>
						</label>
						<div>
							<form:input class="maskPhone required" path="lmsUserProfile.phoneNo1" name="phoneNo1" id="id_phoneNo1" type="text" />
						</div>
					</div>
					
					<div class="row">
						<label for="f8_mi_phone">
							<strong>Phone 2</strong>
							<small>(999) 999-9999</small>
						</label>
						<div>
							<form:input class="maskPhone required" path="lmsUserProfile.phoneNo2" name="phoneNo2" id="id_phoneNo2" type="text" />
						</div>
					</div>
					
					<div class="row">
						<label for="f1_placeholder">
							<strong>Email Id</strong>
						</label>
						<div>
							<form:input type="text" class="required" path="lmsUserProfile.emailId" placeholder="Enter an email id!" name="emailId" id="id_emailId" />
						</div>
					</div>
					
					<div class="row">
						<label for="f1_placeholder">
							<strong>Address Line 1</strong>
						</label>
						<div>
							<form:input type="text" class="required" path="lmsUserProfile.future1" placeholder="Enter address line 1!" name="future1" id="id_future1" />
						</div>
					</div>
					
					<div class="row">
						<label for="f1_placeholder">
							<strong>Address Line 2</strong>
						</label>
						<div>
							<form:input type="text" class="required" path="lmsUserProfile.future2" placeholder="Enter address line 2!" name="future2" id="id_future2" />
						</div>
					</div>
					
					<div class="row">
						<label for="f1_textarea_grow">
							<strong>Comments</strong>
							<small></small>
						</label>
						<div>
							<form:textarea rows="5"  class="required" path="mackerComments" name="mackerComments" id="id_mackerComments"/>
						</div>
					</div>
					
					<div class="actions">
						<div class="left">
							<input type="reset" value="Cancel" />
						</div>
					
						<div class="right">
							<input type="submit" value="Submit" name="submit" id="id_submit_user"/>
						</div>
					</div><!-- End of .actions -->
				</fieldset><!-- End of fieldset -->
				
			</form:form><!-- End of form -->

        </section><!-- End of #content -->

    </div><!-- End of #main -->
 <!-- Spawn $$.loaded -->
    <script>
        $$.loaded();
    </script>
</body>
</html>