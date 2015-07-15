<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>

	<h2>
			<label>Change Credentials</label>
	</h2>
	
	<div id="innerContainerDiv" >
	<br>
	<form:form commandName="loginBean" action="userNamePasswordChanged"  method="POST">
		
		<label>User name<span class="errorClass"> *</span> :</label> <form:input id="id_testName" placeholder="Enter Username"
			size="50" path="userName"/>	
			<form:errors path="userName" cssClass="errorClass"/>  

			<br/> <br/><br/>
		
		
			<label>Old Password<span class="errorClass"> *</span> :</label> 
				<form:input type="password" path="password" id="id_testUrl" size="48" placeholder="Enter Password"/> 
				<form:errors path="password" cssClass="errorClass"/>
					<br/> <br/><br/>
			<label>New Password<span class="errorClass"> *</span> :</label> 
				<form:input type="password" path="changedPassword" id="id_testUrl" size="48" placeholder="Enter Password"/> 
				<form:errors path="changedPassword" cssClass="errorClass"/>
				
				
				<br/> <br/><br/>
				<center><input id="runScreenShot" type="submit" 
					name="Submit" value="Submit" class="button" />
			<div class="divider"></div>
			
			<form:errors path="indicator" cssClass="sucessClass"/>
			<div id="id_errorDiv">${errorMessage}<br/></div>
			</center>
			<form:input type="hidden" path="loginId" name="loginId" id="loginId" value="${loginId}" />
	</form:form>
</div>


