$(document).ready(function() {
	 $("#id_submit_user").click(function() {
		
		 if(validateUserValues()){
			 showProgressBar();
		}else{
			return false;
		}
     });
	 
	 function validateUserValues(){
		 var client = $("#id_client").val();
		 var roles = $("#id_roles").val();
		 var userName = $("#id_userName").val();
		 var firstname = $("#id_firstname").val();
		 var lastname = $("#id_lastname").val();
		 var phoneNo1 = $("#id_phoneNo1").val();
		 var emailId = $("#id_emailId").val();
		 var mackerComments = $("#id_mackerComments").val();
		 
		 var validValues = true;
		 
		 if(client == -1){
			 alertify.alert("Please Select Client");
			 return false;
		 }else if(roles == -1){
			 alertify.alert("Please Select Role");
			 return false;
		 }else if(userName == ""){
			 validValues = false;
			 setErrorMessage("#id_userName");
		 }else if(firstname == ""){
			 validValues = false;
			 setErrorMessage("#id_firstname");
		 }else if(lastname == ""){
			 validValues = false;
			 setErrorMessage("#id_lastname");
		 }else if(phoneNo1 == ""){
			 validValues = false;
			 setErrorMessage("#id_phoneNo1");
		 }else if(emailId == ""){
			 validValues = false;
			 setErrorMessage("#id_emailId");
		 }else if(mackerComments == ""){
			 validValues = false;
			 setErrorMessage("#id_mackerComments");
		 }
	 }
	 
	 function setErrorMessage(id){
		if (id != null) {
			$(id).css("border", "2px solid #ea0000");
			$(id).focus();
			alertify.success("Please Enter "+id.replace("#id_", ""));
		}
	}
	 
});