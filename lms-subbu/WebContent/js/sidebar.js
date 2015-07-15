$(document).ready(function(){
	
     $('.id_manageRoles_addRoleM').click(function(){
    	  var form = "<form id='id_rolesResultForm' action='manageRolesAddRoleM' method='POST'>" +
	 			"</form>";
		    $("body").append(form);
		    $("#id_rolesResultForm").submit();
		    	  
		  });
      
      $('.id_manageClient_addClientM').click(function(){
    	  var form = "<form id='id_resultForm' action='manageClientAddClientM' method='POST'>" +
    	  "<input name='parent' value='"+$("#id_parent").val()+"'>" +
    	  "<input name='type' value='"+$("#id_type").val()+"'>" +
    	  "<input name='category' value='"+$("#id_category").val()+"'>" +
	 	  "</form>";
		  $("body").append(form);
		  $("#id_resultForm").submit();
		    	  
      });
      
      $('.id_manageUser_addUserM').click(function(){
    	  var url = "manageUserAddUserM";
    	  $.ajax({
	    		url: url,
	    		type: "POST",
	    		success: function (response) {
	    			$('.id_manageUser_addUserM').css("color", "red");
	    	    }
	    	 });
    	  
   	  });
      
      
      
      /*id_manageUser_addUserM
      id_manageProgram_addProgramM
      id_manageAccount_adjustPointsM
      id_batchProcess_uploadCustEnrolementFile*/
     
});