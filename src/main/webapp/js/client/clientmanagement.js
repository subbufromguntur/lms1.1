$(document)
		.ready(
				function() {
					$$.ready(function() {
						$("#dialog_add_client").dialog({
							autoOpen : false,
							modal : true,
							width : 400,
							open : function() {
								$(this).parent().css('overflow', 'visible');
								$$.utils.forms.resize()
							}
						}).find('button.submit').click(function() {
							var $el = $(this).parents('.ui-dialog-content');
							if ($el.validate().form()) {
								$el.find('form')[0].reset();
								$el.dialog('close');
							}
						}).end().find('button.cancel').click(function() {
							var $el = $(this).parents('.ui-dialog-content');
							$el.find('form')[0].reset();
							$el.dialog('close');
						});

						$(".open-add-client-dialog").click(function() {
							$("#dialog_add_client").dialog("open");
							return false;
						});
					});
					$("#id_logout").click(function() {
						alert('logout');
					});
					$('#id_popup_cancel').click(function() {
						var $el = $(this).parents('.ui-dialog-content');
						$el.find('form')[0].reset();
						$el.dialog('close');
					});

					$('#id_country').change(function() {
						var optionCountry = $('#id_country').val();
						$.ajax({
							url : 'getCountryValues',
							type : "POST",
							data : {
								stateIndicator : optionCountry
							},
							success : function(response) {
								$('#id_sates').empty(); // remove all child
														// nodes
								var newOption = $(response);
								$('#id_sates').append(newOption);
								$('#id_sates').trigger("chosen:updated");
							},
							error : function() {
								alert('error');
							}
						});
					});

					$('#id_sates').change(function() {
						var optionState = $('#id_sates').val();
						$.ajax({
							url : 'getCities',
							type : "POST",
							data : {
								citiIndicator : optionState
							},
							success : function(response) {
								$('#id_cities').empty(); // remove all child
															// nodes
								var newOption = $(response);
								$('#id_cities').append(newOption);
								$('#id_cities').trigger("chosen:updated");
							},
							error : function() {
								alert('error');
							}
						});
					});

					$('#id_gl_account').click(function() {
						$('#dialog_add_client').show();
					});

					$('#id_popup_glscreen')
							.click(
									function() {

										if (validateGlAccountValues()) {
											var clientName = $("#id_clientName")
													.val();
											var phone1 = $("#id_phone1").val();
											var phone2 = $("#id_phone2").val();
											var addressLine1 = $(
													"#id_addressLine1").val();
											var addressLine2 = $(
													"#id_addressLine2").val();
											var cities = $("#id_cities").val();
											var parent = $("#id_parent").val();
											var type = $("#id_type").val();
											var category = $("#id_category")
													.val();
											var timeZone = $("#id_timeZone")
													.val();
											var country = $("#id_country")
													.val();
											var sates = $("#id_sates").val();

											var index = $("#id_browserSetSize")
													.val();
											var clientSet = "<input type='hidden' value='"
													+ clientName
													+ "' name='clientName'>"
													+ "<input type='hidden' value='"
													+ phone1
													+ "' name='organizationConfigurationDetailsBean.phone1'>"
													+ "<input type='hidden' value='"
													+ phone2
													+ "' name='organizationConfigurationDetailsBean.phone2'>"
													+ "<input type='hidden' value='"
													+ addressLine1
													+ "' name='organizationConfigurationDetailsBean.addressLine1'>"
													+ "<input type='hidden' value='"
													+ addressLine2
													+ "' name='organizationConfigurationDetailsBean.addressLine2'>"
													+ "<input type='hidden' value='"
													+ country
													+ "' name='organizationConfigurationDetailsBean.country'>"
													+ "<input type='hidden' value='"
													+ sates
													+ "' name='organizationConfigurationDetailsBean.state'>"
													+ "<input type='hidden' value='"
													+ cities
													+ "' name='organizationConfigurationDetailsBean.city'>"
													+ "<input type='hidden' value='"
													+ $("#description").val()
													+ "' name='description'>"
													+ "<input type='hidden' value='"
													+ type
													+ "' name='type'>"
													+ "<input type='hidden' value='"
													+ category
													+ "' name='category'>"
													+ "<input type='hidden' value='"
													+ timeZone
													+ "' name='timeZone'>"
													+ "<input type='hidden' value='"
													+ parent
													+ "' name='parent'>"
													+ "<input type='hidden' name='organizationGlAccountBean["
													+ index
													+ "].accountNumber' value='"
													+ $("#id_accountNumber1")
															.val()
													+ "'>"
													+ "<input type='hidden' name='organizationGlAccountBean["
													+ index
													+ "].accountId' value='"
													+ $("#id_accountId1")
															.val()
													+ "'>"
													+ "<input type='hidden' name='organizationGlAccountBean["
													+ index
													+ "].accountType' value='"
													+ $("#id_accountType1")
															.val() + "'>";

											$("#id_gl_account_form").append(
													clientSet);
											$("#id_gl_account_form").submit();
										}

									});

					$('#id_submit_client').click(function() {
						if (validateClientValues()) {
							showProgressBar();
						} else {
							return false;
						}
					});
					$('#id_add_gl_account').click(function() {
						if (validateClientAddGlAccountValues()) {
							showProgressBar();
						} else {
							return false;
						}
					});
					
					function validateClientAddGlAccountValues() {

						var clientName = $("#id_clientName").val();
						var phone1 = $("#id_phone1").val();
						var phone2 = $("#id_phone2").val();
						var addressLine1 = $("#id_addressLine1").val();
						var addressLine2 = $("#id_addressLine2").val();
						var cities = $("#id_cities").val();
						var parent = $("#id_parent").val();
						var type = $("#id_type").val();
						var category = $("#id_category").val();
						var timeZone = $("#id_timeZone").val();
						var country = $("#id_country").val();
						var sates = $("#id_sates").val();
						
						var validValues = true;
						if (clientName == "") {
							validValues = false;
							setErrorMessage("#id_clientName");
						} else if (parent == -1) {
							// reset();
							alertify.alert("Please Select Parent");
							diablePoupup();
							return false;
						} else if (type == -1) {
							alertify.alert("Please Select Type");
							diablePoupup();
							return false;
						} else if (category == -1) {
							// reset();
							alertify.alert("Please Select category");
							diablePoupup();
							return false;
						} else if (phone1 == "") {
							validValues = false;
							setErrorMessage("#id_phone1");
						} else if (phone2 == "") {
							validValues = false;
							setErrorMessage("#id_phone2");
						} else if (addressLine1 == "") {
							validValues = false;
							setErrorMessage("#id_addressLine1");
						} else if (addressLine2 == "") {
							validValues = false;
							setErrorMessage("#id_addressLine2");
						} else if (timeZone == -1) {
							// reset();
							alertify.alert("Please Select TimeZone");
							diablePoupup();
							return false;
						} else if (country == -1) {
							// reset();
							alertify.alert("Please Select Country");
							diablePoupup();
							return false;
						} else if (sates == -1) {
							// reset();
							alertify.alert("Please Select Sate");
							diablePoupup();
							return false;
						} else if (cities == -1) {
							// reset();
							alertify.alert("Please Select City");
							diablePoupup();
							return false;
						} 
						if(!validValues){
							diablePoupup();
						}
						return validValues;
					}

					function validateClientValues() {

						var clientName = $("#id_clientName").val();
						var phone1 = $("#id_phone1").val();
						var phone2 = $("#id_phone2").val();
						var addressLine1 = $("#id_addressLine1").val();
						var addressLine2 = $("#id_addressLine2").val();
						var cities = $("#id_cities").val();
						var parent = $("#id_parent").val();
						var type = $("#id_type").val();
						var category = $("#id_category").val();
						var timeZone = $("#id_timeZone").val();
						var country = $("#id_country").val();
						var sates = $("#id_sates").val();
						var validValues = true;
						if (clientName == "") {
							validValues = false;
							setErrorMessage("#id_clientName");
						} else if (parent == -1) {
							// reset();
							alertify.alert("Please Select Parent");
							return false;
						} else if (type == -1) {
							alertify.alert("Please Select Type");
							return false;
						} else if (category == -1) {
							// reset();
							alertify.alert("Please Select Category");
							return false;
						} else if (phone1 == "") {
							validValues = false;
							setErrorMessage("#id_phone1");
						} else if (phone2 == "") {
							validValues = false;
							setErrorMessage("#id_phone2");
						} else if (addressLine1 == "") {
							validValues = false;
							setErrorMessage("#id_addressLine1");
						} else if (addressLine2 == "") {
							validValues = false;
							setErrorMessage("#id_addressLine2");
						} else if (timeZone == -1) {
							// reset();
							alertify.alert("Please Select TimeZone");
							return false;
						} else if (country == -1) {
							// reset();
							alertify.alert("Please Select Country");
							return false;
						} else if (sates == -1) {
							// reset();
							alertify.alert("Please Select Sate");
							return false;
						} else if (cities == -1) {
							// reset();
							alertify.alert("Please Select City");
							return false;
						}else if(typeof $("#id_accountNumber").val()  === "undefined" 
							 || $("#id_accountNumber").val() == ""){
					 		alertify.alert("Please Enter GL Account Details");
					 		 return false;
					 	 }
						return validValues;
					}

					function validateGlAccountValues() {
						var accountType = $("#id_accountType1").val();
						var accountName = $("#id_accountName1").val();
						var accountNumber = $("#id_accountNumber1").val();
						var validValues = true;
						if (accountType == -1) {
							alertify.alert("Please Select Account Type");
							return false;
						} else if (accountName == "") {
							validValues = false;
							setErrorMessage("#id_accountName1");
						} else if (accountNumber == "") {
							validValues = false;
							setErrorMessage("#id_accountNumber1");
						}
						return validValues;
					}
					function setErrorMessage(id) {

						if (id != null) {
							$(id).css("border", "2px solid #ea0000");
							$(id).focus();
							alertify.success("Please Enter "
									+ id.replace("#id_", ""));
						}
					}

					function clearErrorMessage(id) {
						if (id != null) {
							$(id).removeClass('errInputBox');
							$(id).removeClass("errInputBox");
						}
					}
					function diablePoupup(){
						var $el = $(this).parents('.ui-dialog-content');
						$el.find('form')[0].reset();
						$el.dialog('close');
						return false;
					}
					
				});
