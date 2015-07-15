<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html class="no-js" lang="en"> <!--<![endif]-->
<head>
 <script type="text/javascript">
function getRoleDependencies(){
		var listOfClientTypes = null;
		$('#id_manage_client').empty();//.append('<option label="--Select--" value="-1"></option>');
		listOfClientTypes = {"permissionManageClient":[<c:forEach items="${roles}" var='os'>{"${os.roleName}":[<c:forEach items="${os.clientTypes}" var="br" varStatus="i">{"${i.index}":"${br.typeOfClient}+${br.typeOfClient}"},</c:forEach>]},</c:forEach>]};
		for(i in listOfClientTypes.permissionManageClient){
			var value = listOfClientTypes.permissionManageClient[i];
			for(j in value){
				
				var va=value[j];
				if($("#id_role_name").val()==j){
				for(k in va){
					for(l in va[k]){

					var values = va[k][l].split("+");
					var option = document.createElement("option");
					option.text = values[1];
					option.value = values[0];
					var select = document.getElementById("id_manage_client");
					select.appendChild(option);
					}
				}			
			}
		}
			
	}
	//$('.addall').click(); 
	
	var listOfRoleTypes = null;
	$('#id_manage_role').empty();//.append('<option label="--Select--" value="-1"></option>');
	listOfClientTypes = {"permissionManageRoles":[<c:forEach items="${roles}" var='os'>{"${os.roleName}":[<c:forEach items="${os.roleTypes}" var="br" varStatus="i">{"${i.index}":"${br.typeOfRoles}+${br.typeOfRoles}"},</c:forEach>]},</c:forEach>]};
	for(i in listOfClientTypes.permissionManageRoles){
		var value = listOfClientTypes.permissionManageRoles[i];
		for(j in value){
			
			var va=value[j];
			if($("#id_role_name").val()==j){
			for(k in va){
				for(l in va[k]){

				var values = va[k][l].split("+");
				var option = document.createElement("option");
				option.text = values[1];
				option.value = values[0];
				var select = document.getElementById("id_manage_role");
				select.appendChild(option);
				}
			}			
		}
	}
	}
		
	var listOfUserTypes = null;
	$('#id_manage_users').empty();//.append('<option label="--Select--" value="-1"></option>');
	listOfUserTypes = {"permissionManageUsers":[<c:forEach items="${roles}" var='os'>{"${os.roleName}":[<c:forEach items="${os.userTypes}" var="br" varStatus="i">{"${i.index}":"${br.typeOfUsers}+${br.typeOfUsers}"},</c:forEach>]},</c:forEach>]};
	for(i in listOfUserTypes.permissionManageUsers){
		var value = listOfUserTypes.permissionManageUsers[i];
		for(j in value){
			
			var va=value[j];
			if($("#id_role_name").val()==j){
			for(k in va){
				for(l in va[k]){

				var values = va[k][l].split("+");
				var option = document.createElement("option");
				option.text = values[1];
				option.value = values[0];
				var select = document.getElementById("id_manage_users");
				select.appendChild(option);
				}
			}			
		}
	}
		
}
	
	var listOfProgramTypes = null;
	$('#id_manage_program').empty();//.append('<option label="--Select--" value="-1"></option>');
	listOfProgramTypes = {"permissionManageUsers":[<c:forEach items="${roles}" var='os'>{"${os.roleName}":[<c:forEach items="${os.programTypes}" var="br" varStatus="i">{"${i.index}":"${br.programType}+${br.programType}"},</c:forEach>]},</c:forEach>]};
	for(i in listOfProgramTypes.permissionManageUsers){
		var value = listOfProgramTypes.permissionManageUsers[i];
		for(j in value){
			
			var va=value[j];
			if($("#id_role_name").val()==j){
			for(k in va){
				for(l in va[k]){

				var values = va[k][l].split("+");
				var option = document.createElement("option");
				option.text = values[1];
				option.value = values[0];
				var select = document.getElementById("id_manage_program");
				select.appendChild(option);
				}
			}			
		}
	}
		
}
	
	var listOfAccountTypes = null;
	$('#id_manage_account').empty();//.append('<option label="--Select--" value="-1"></option>');
	listOfAccountTypes = {"permissionManageUsers":[<c:forEach items="${roles}" var='os'>{"${os.roleName}":[<c:forEach items="${os.accountTypes}" var="br" varStatus="i">{"${i.index}":"${br.accountType}+${br.accountType}"},</c:forEach>]},</c:forEach>]};
	for(i in listOfAccountTypes.permissionManageUsers){
		var value = listOfAccountTypes.permissionManageUsers[i];
		for(j in value){
			
			var va=value[j];
			if($("#id_role_name").val()==j){
			for(k in va){
				for(l in va[k]){

				var values = va[k][l].split("+");
				var option = document.createElement("option");
				option.text = values[1];
				option.value = values[0];
				var select = document.getElementById("id_manage_account");
				select.appendChild(option);
				}
			}			
		}
	}
		
}

	var listOfBatchTypes = null;
	$('#id_batch_process').empty();//.append('<option label="--Select--" value="-1"></option>');
	listOfBatchTypes = {"permissionManageUsers":[<c:forEach items="${roles}" var='os'>{"${os.roleName}":[<c:forEach items="${os.batchTypes}" var="br" varStatus="i">{"${i.index}":"${br.batchType}+${br.batchType}"},</c:forEach>]},</c:forEach>]};
	for(i in listOfBatchTypes.permissionManageUsers){
		var value = listOfBatchTypes.permissionManageUsers[i];
		for(j in value){
			
			var va=value[j];
			if($("#id_role_name").val()==j){
			for(k in va){
				for(l in va[k]){

				var values = va[k][l].split("+");
				var option = document.createElement("option");
				option.text = values[1];
				option.value = values[0];
				var select = document.getElementById("id_batch_process");
				select.appendChild(option);
				}
			}			
		}
	}
		
}
$('.addall').click(); 
		
	
}
</script>

    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

    <meta name="description" content="slick and responsive Admin Template build with modern techniques like HTML5 and CSS3 to be used for backend solutions of any size.">
    
    <!-- Mobile viewport optimized: h5bp.com/viewport -->
    <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0;">
    <!-- iPhone: Don't render numbers as call links -->
    <meta name="format-detection" content="telephone=no">
	<script lang="javascript">
    	function subbu(){
    		$('.id_manageRoles_addRoleM').css("color", "red");
    		$('.with_sub')[1].click();
    	}
    </script>
</head>
<body onload="subbu()">

    <!-- The container of the sidebar and content box -->
    <div role="main" id="main" class="container_12 clearfix">
        
		<jsp:include page="/WEB-INF/jsp/template/toolbar.jsp"></jsp:include>
		<jsp:include page="/WEB-INF/jsp/template/sidebar.jsp"></jsp:include>

        <!-- Here goes the content. -->
        <section id="content" class="container_12 clearfix" data-sort=true>
﻿			<h1 class="grid_12">Add Role (Maker)</h1>
			<div id="faq_1">
					<p class="grid_12">
						Add a new role which suits the user or department for managing their activities. A role will be associated with a group of permissions. e.g. of role are L1 user, L1 admin, program manager, bank admin etc. Every client/partner will need to create the roles and their associated permissions which best suits them.
					</p>
			</div>
			<form action="submitRolesRequest" method="post" class="grid_12">
				<fieldset>
					<legend>Role Details</legend>
					
					<div class="row">
						<label for="f1_placeholder">
							<strong>Role Name</strong>
						</label>
						<div>
							<select id="id_role_name" name="roleName" onchange="getRoleDependencies()">
								<option value=-1>-----Select-----</option>
								<c:forEach items="${roles}" var="results">
									<option id="${results.roleName}" value="${results.roleName}">${results.roleName}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					
					<div class="row">
						<label>
							<strong>Role Description</strong>
							<small></small>
						</label>
						<div>
							<textarea rows=5 name="role_desc" id="id_role_desc"></textarea>
						</div>
					</div>
					
					<div class="row">
						<label>
							<strong>Permissions - Manage Client</strong>
						</label>
						<div>
							<select multiple class="dualselects" data-size="small" id="id_manage_client" name="manage_client">
							</select>
						</div>
					</div>
					
					<div class="row">
						<label>
							<strong>Permissions - Manage Roles</strong>
						</label>
						<div>
							<select multiple class="dualselects" data-size=small id="id_manage_role" name="manage_role" >
							</select>
						</div>
					</div>
					
					<div class="row">
						<label>
							<strong>Permissions - Manage Users</strong>
						</label>
						<div>
							<select multiple class="dualselects" data-size=small id="id_manage_users" name="manage_users" >
							</select>
						</div>
					</div>
					
					<div class="row">
						<label>
							<strong>Permissions - Manage Program</strong>
						</label>
						<div>
							<select multiple class="dualselects" data-size=small id="id_manage_program" name="manage_program">
							</select>
						</div>
					</div>
					
					<div class="row">
						<label>
							<strong>Permissions - Manage Account</strong>
						</label>
						<div>
							<select multiple class="dualselects" data-size=small id="id_manage_account" name="manage_account">
							</select>
						</div>
					</div>
					
					<div class="row">
						<label>
							<strong>Permissions - Batch Process</strong>
						</label>
						<div>
							<select multiple class="dualselects" data-size=small id="id_batch_process" name="batch_process">
							</select>
						</div>
					</div>
					
					<div class="actions">
						<div class="left">
							<input type="reset" value="Cancel" />
						</div>
					
						<div class="right">
							<input type="submit" value="Submit" name=submit id="id_submit_roles"/>
						</div>
					</div><!-- End of .actions -->
				</fieldset><!-- End of fieldset -->
				
			</form><!-- End of form -->

        </section><!-- End of #content -->

    </div><!-- End of #main -->

    <!-- The footer -->
    <footer class="container_12">
        <ul class="grid_6">
            <li><a href="#">About</a></li>
            <li><a href="#">Jobs</a></li>
            <li><a href="#">@StammTec.de</a></li>
        </ul>

        <span class="grid_6">
            Copyright &copy; 2012 YourCompany
        </span>
    </footer><!-- End of footer -->

    <!-- Spawn $$.loaded -->
    <script>
        $$.loaded();
    </script>
</body>
