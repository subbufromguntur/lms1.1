$(document).ready(function() {

	$$.ready(function() {
        $( "#dialog_add_client" ).dialog({
            autoOpen: false,
            modal: true,
            width: 400,
            open: function(){ $(this).parent().css('overflow', 'visible'); $$.utils.forms.resize() }
        }).find('button.submit').click(function(){
            var $el = $(this).parents('.ui-dialog-content');
            if ($el.validate().form()) {
                $el.find('form')[0].reset();
                $el.dialog('close');
            }
        }).end().find('button.cancel').click(function(){
            var $el = $(this).parents('.ui-dialog-content');
            $el.find('form')[0].reset();
            $el.dialog('close');;
        });

        $( ".open-add-client-dialog" ).click(function() {
            $( "#dialog_add_client" ).dialog( "open" );
            return false;
        });
    });
	
	
		$('#id_country').change(function(){
			   var optionCountry = $('#id_country').val();
			$.ajax({
				url : 'getCountryValues',
				type : "POST",
				data : {
					stateIndicator : optionCountry
				},
				success : function(response) {
					  $('#id_sates').empty(); //remove all child nodes
					  var newOption = $(response);
					  $('#id_sates').append(newOption);
					  $('#id_sates').trigger("chosen:updated");
				},
			    error: function () {
			    	alert('error');
			    } 
			});
       });
		

		$('#id_sates').change(function(){
			 var optionState = $('#id_sates').val();
				$.ajax({
					url : 'getCities',
					type : "POST",
					data : {
						citiIndicator : optionState
					},
					success : function(response) {
						  $('#id_cities').empty(); //remove all child nodes
						  var newOption = $(response);
						  $('#id_cities').append(newOption);
						  $('#id_cities').trigger("chosen:updated");
					},
				    error: function () {
				    	alert('error');
				    } 
				});
	       });
		
		$('#id_gl_account').click(function(){
			$('#dialog_add_client').show();
		});
		
		
		$('#id_popup_glscreen').click(function(){
			var index = $("#id_browserSetSize").val();
			var glAccountSet = "<input type='hidden' name='clientGlAccountBean["+index+"].accountNumber' value='"+$("#id_accountNumber1").val()+"'>"+
				"<input type='hidden' name='clientGlAccountBean["+index+"].accountId' value='"+$("#id_accountName1").val()+"'>"+
				"<input type='hidden' name='clientGlAccountBean["+index+"].accountType' value='"+$("#id_accountType1").val()+"'>";
			$("#id_accountNumber_temp").val($("#id_accountNumber1").val());
			$("#id_accountName_temp").val($("#id_accountNumber1").val());
			$("#id_accountType_temp").val($("#id_accountNumber1").val());
			
			 $("#id_client_form").append(glAccountSet);
			 
			
		});
		
		$('#id_submit_client').click(function(){
			if(validateClientValues()){
				 showProgressBar();
			}else{
				return false;
			}
		});
		
		function validateClientValues() {
			 var clientName = $("#id_clientName").val();
			 var phone1 = $("#id_phone1").val();
			 var phone2 = $("#id_phone2").val();
			 var addressLine1 = $("#id_addressLine1").val();
			 var addressLine2 = $("#id_addressLine2").val();
			 var cities = $("#id_cities").val();
			 
			var validValues = true;
			 if(clientName == ""){
				 validValues = false;
				 setErrorMessage("#id_clientName");
			 }else if(phone1 == ""){
				 validValues = false;
				 setErrorMessage("#id_phone1");
			 }else if(phone2 == ""){
				 validValues = false;
				 setErrorMessage("#id_phone2");
			 }else if(addressLine1 == ""){
				 validValues = false;
				 setErrorMessage("#id_addressLine1");
			 }else if(addressLine2 == ""){
				 validValues = false;
				 setErrorMessage("#id_addressLine2");
			 }/*else if(cities == -1){
				 validValues = false;
				 setErrorMessage("#id_cities");
			 }*/
			 else if($("#id_accountNumber_temp").val() == ""
		 		 || $("#id_accountName_temp").val() == ""
		 			 || $("#id_accountType_temp").val() == ""){
		 		 alert("Please Enter GL Account details");
		 		 return false;
		 	 }
			 
			 return validValues;
		}

		function setErrorMessage(id){
			
			if (id != null) {
				$(id).css("border", "2px solid #ea0000");
				$(id).focus();
				//$(id).addClass("errInputBox");
			}
		}

		function clearErrorMessage(id) {
			if (id != null) {
				$(id).removeClass('errInputBox');
				$(id).removeClass("errInputBox");
			}
		}
}); 

