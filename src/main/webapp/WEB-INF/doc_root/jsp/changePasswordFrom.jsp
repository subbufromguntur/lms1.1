<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html class="no-js" lang="en"> <!--<![endif]-->
<head>
    <meta charset="utf-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

    <meta name="description" content="slick and responsive Admin Template build with modern techniques like HTML5 and CSS3 to be used for backend solutions of any size.">
    
    <!-- Mobile viewport optimized: h5bp.com/viewport -->
    <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0;">
    <!-- iPhone: Don't render numbers as call links -->
    <meta name="format-detection" content="telephone=no">

</head>

<body class=login>
	<section id="login" class="container_12 clearfix">

		<form:form commandName="lmsUserCredentails" action="userNamePasswordChanged" method="POST" class="box validate" id="id_login_form">
			<div class="header">
				<h2><span class="icon icon-lock"></span>Login</h2>
			</div>

			<div class="content">

				<!-- Login messages -->
				<div class="login-messages">
					<div class="message welcome">Welcome back!</div>
					<div class="message failure">Invalid credentials.</div>
				</div>

				<!-- The form -->
				<div class="form-box">

					<div class="row">
						<label for="login_name">
							<strong>Username</strong>
							<small>Or email address</small>
						</label>
						<div>
							<form:input id="id_username" class="required"  tabindex="1" placeholder="Enter Username" size="40" path="userName"/>	
							<form:errors path="userName" cssClass="errorClass"/> 
						</div>
					</div>

					<div class="row">
						<label for="login_pw">
							<strong>Old Password</strong>
						</label>
						<div>
							<form:input class="required"  tabindex="2" type="password" path="password" id="id_password" size="42" placeholder="Enter Password"/> 
							<form:errors path="password" cssClass="errorClass"/>
						</div>
					</div>
					<div class="row">
						<label for="login_pw">
							<strong>New Password</strong>
						</label>
						<div>
							<form:input class="required"  tabindex="2" type="password" path="changedPassword" id="id_changedpassword" size="42" placeholder="Enter Password"/> 
							<form:errors path="password" cssClass="errorClass"/>
						</div>
					</div>
				</div><!-- End of .form-box -->

			</div><!-- End of .content -->

			<div class="actions">
				<div class="right">
					<input tabindex="3" type="submit" value="Sign In" name="login_btn" id="login1122"/>
				</div>
			</div><!-- End of .actions -->

		</form:form><!-- End of form -->
			<form:errors path="indicator" cssClass="sucessClass"/></b>
				
				<div id="id_errorDiv">${errorMessage}<br/></div>
	</section>
	
</body>
</html>
