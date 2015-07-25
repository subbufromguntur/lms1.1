$(document).ready(function(){
	
     $('.id_manageRoles_addRoleM').click(function(){
    	 showProgressBar("#id_client_form");
    	  var form = "<form id='id_rolesResultForm' action='manageRolesAddRoleM' method='POST'>" +
	 			"</form>";
		    $("body").append(form);
		    $("#id_rolesResultForm").submit();
		    	  
		  });
      
      $('.id_manageClient_addClientM').click(function(){
    	  showProgressBar("#id_client_form");
    	  var form = "<form id='id_resultForm' action='manageClientAddClientM' method='GET'>" +
    	  "<input name='parent' value='"+$("#id_parent").val()+"'>" +
    	  "<input name='type' value='"+$("#id_type").val()+"'>" +
    	  "<input name='category' value='"+$("#id_category").val()+"'>" +
	 	  "</form>";
		  $("body").append(form);
		  $("#id_resultForm").submit();
		    	  
      });
      
      $('.id_manageUser_addUserM').click(function(){
     	 showProgressBar("#id_client_form");
     	  var form = "<form id='id_userResultForm' action='manageUserAddUserM' method='GET'>" +
 	 			"</form>";
 		    $("body").append(form);
 		    $("#id_userResultForm").submit();
 		    	  
 		  
   	  });
      
      
      
      /*id_manageUser_addUserM
      id_manageProgram_addProgramM
      id_manageAccount_adjustPointsM
      id_batchProcess_uploadCustEnrolementFile*/
     
});