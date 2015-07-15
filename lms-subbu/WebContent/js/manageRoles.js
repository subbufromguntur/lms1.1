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
			
			 $("#id_client_form").append(glAccountSet);
			 
			
		});
		
		$('#id_submit_client').click(function(){
			if(validateClientValues()){
			}else{
				return false;
			}
		});
}); 

function validateClientValues() {
	 var clientName = $('#id_clientName').val();
	 var parent = $('#id_type').val();
	 
 	 var validValues = true;
 	
 	 if($('#id_accountName').val() == '' 
 		 || $('#id_accountNumber').val() == ''
 			 || $('#id_accountType').val() == ''){
 		 alert('Please Enter GL Account details');
 		 return false;
 	 }
	 if(parent == -1){
		 validValues = false;
		 $('#id_type').append("border", "2px solid #ea0000");
		  $('#id_type').trigger("chosen:updated");
		 //setErrorMessage("#id_type"); 
	 }
	 if(clientName = ''){
		 validValues = false;
		 setErrorMessage("#id_clientName");
	 }
	 return validValues;
}

function setErrorMessage(id){
	if (id != null) {
		$(id).css("border", "2px solid #ea0000");
		//$(id).addClass("errInputBox");
	}
}

function clearErrorMessage(id) {
	if (id != null) {
		$(id).removeClass('errInputBox');
		$(id).removeClass("errInputBox");
	}
}