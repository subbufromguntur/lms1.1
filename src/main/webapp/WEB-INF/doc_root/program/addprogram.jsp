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
    		
    		$('.id_manageProgram_addProgramM').css("color", "red");
    		$('.with_sub')[3].click();
    		
    	  $('#id_sates').empty(); //remove all child nodes
  		  var newOptionState = "'<option value='${selectedStateValue}'>"+"${selectedStateValue}"+"</option>"; 
  		   $('#id_sates').append(newOptionState);
  		  $('#id_sates').trigger("chosen:updated");
  		  
  		
  		  $('#id_cities').empty(); //remove all child nodes
  		  var newOption = "'<option value='${selectedCitiValue}'>"+"${selectedCitiValue}"+"</option>";
  		  $('#id_cities').append(newOption);
  		  $('#id_cities').trigger("chosen:updated"); 
  		  
	  		 /*  if('${selectedCountryValue}' != ""){
		  		  $('#id_country').empty(); //remove all child nodes
		  		  var newOption = "'<option value='${selectedCountryValue}'>"+"${selectedCountryValue}"+"</option>";
		  		  $('#id_country').append(newOption);
		  		  $('#id_country').trigger("chosen:updated"); 
	    	 } */
    	}
    	
    	 
    	
    </script>
    <style>
		.alertify-log-custom {
			background: blue;
		}
	</style>
</head>

<body onload="initialization()">
 <!-- The container of the sidebar and content box -->
    <div role="main" id="main" class="container_12 clearfix">
        
		<jsp:include page="/WEB-INF/doc_root/template/toolbar.jsp"></jsp:include>
		<jsp:include page="/WEB-INF/doc_root/template/sidebar.jsp"></jsp:include>
<section id="content" class="container_12 clearfix" data-sort=true>
			<h1 class="grid_12">Add Program (Maker)</h1>
			<div id="faq_1">
					<p class="grid_12">
						Add a new program for a client/partner. Product Tiers and offers can be added under a program. As part of the program configuration the program manager need to complete the profile, partners who participate in the program, setup GL accounts , fees and notifications.
					</p>
			</div>
			<div class="grid_12">
				<form class="box wizard manual validate" id="wiz">
				
					<div class="header">
						<h2><img src="img/icons/packs/fugue/16x16/ui-tab--arrow.png" class="icon">Program Details</h2>
					</div>
					
					<div class="content">
						<ul class="steps">
							<li><a class="current" href="#wiz_profile">Profile</a></li>
							<li><a href="#wiz_partner">Partners</a></li>
							<li><a href="#wiz_glaccount">GL Account</a></li>
							<li><a href="#wiz_fees">Fees</a></li>
							<li><a href="#wiz_notifications">Notifications</a></li>
							<li><a href="#wiz_finish">Finish</a></li>
						</ul>
						<fieldset id="wiz_profile">
							<div class="row">
								<label for="f2_select1">
									<strong>Client</strong>
									<small></small>
								</label>
								<div>
									<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose a Client">
										<option value=""></option>
										<option value="Emirates (HO)">Emirates (HO)</option>
										<option value="Landmark (HO)">Landmark (HO)</option>
									</select>
								</div>
							</div>
							
							<div class="row">
								<label for="f1_placeholder">
									<strong>Program Name</strong>
								</label>
								<div>
									<input type="text" placeholder="Enter a program name!" name="f1_placeholder" id="f1_placeholder" />
								</div>
							</div>
							
							<div class="row">
								<label for="f1_placeholder">
									<strong>Base value</strong>
								</label>
								<div>
									<input type="text" placeholder="Enter a base value for a point!" name="f1_placeholder" id="f1_placeholder" />
								</div>
							</div>
							
									
							<div class="row">
								<label for="f2_select2">
									<strong>Currency</strong>
									<small></small>
								</label>
								<div>
									<select name=f2_select2 id=f2_select2 data-placeholder="Choose program currency">
										<option value=""></option>
										<option value="INR">INR</option> 
										<option value="AED">AED</option>
										<option value="USD">USD</option>
									</select>
								</div>
							</div>
							
							<div class="row">
								<label for="f3_datepicker">
									<strong>Start date</strong>
								</label>
								<div>
									<input type="datetime" name=f3_datepicker id=f3_datepicker value="DD/MM/YYYY HH:MM" />
								</div>
							</div>
							
							<div class="row">
								<label for="f3_datepicker">
									<strong>End date</strong>
								</label>
								<div>
									<input type="datetime" name=f3_datepicker id=f3_datepicker value="DD/MM/YYYY HH:MM" />
								</div>
							</div>
							
							<div class="row">
								<label for="f2_select1">
									<strong>Time Zone</strong>
									<small></small>
								</label>
								<div>
									<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose a Time Zone">
										<option value=""></option>
										<option value="India Time Zone (UTC+5:30)">India Time Zone (UTC+5:30)</option>
										<option value="Gulf Time Zone (UTC+4:00)">Gulf Time Zone (UTC+4:00)</option>
										<option value="Arabia Time Zone (UTC+3:00)">Arabia Time Zone (UTC+3:00)</option>
									</select>
								</div>
							</div>
							
							<div class="row">
								<label for="f2_select1">
									<strong>Country</strong>
									<small></small>
								</label>
								<div>
									<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose a Country">
										<option value=""></option>
										<option value="India">India</option>
										<option value="Pakistan">Pakistan</option>
										<option value="United Arab Emirates">United Arab Emirates</option>
									</select>
								</div>
							</div>
							
							<div class="row">
								<label for="f2_select1">
									<strong>State</strong>
									<small></small>
								</label>
								<div>
									<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose a State">
										<option value=""></option>
										<option value="Kerala">Kerala</option>
										<option value="Karnataka">Karnataka</option>
										<option value="Tamil Nadu">Tamil Nadu</option>
									</select>
								</div>
							</div>
							
							<div class="row">
								<label for="f1_placeholder">
									<strong>City</strong>
								</label>
								<div>
									<input type="text" placeholder="Enter city name!" name="f1_placeholder" id="f1_placeholder" />
								</div>
							</div>
							
							<div class="row">
								<label for="f1_textarea_grow">
									<strong>Description</strong>
									<small></small>
								</label>
								<div>
									<textarea rows=5 name="f1_textarea_grow" id="f1_textarea_grow"></textarea>
								</div>
							</div>
							
							<div class="actions">
								<!--div class="left">
									<input type="reset" value="Cancel" />
								</div>
							
								<div class="right">
									<a href="javascript:void(0);" class="button grey open-add-partner-dialog">Add Fee</a>
									<a href="javascript:void(0);" class="button grey open-add-partner-dialog">Add AML</a>
									<a href="javascript:void(0);" class="button grey open-add-partner-dialog">Add Notifications</a>
									<a href="javascript:void(0);" class="button grey open-add-partner-dialog">Add Partner</a>
									<a href="javascript:void(0);" class="button grey open-add-client-dialog">Add Program GL</a>
									<input type="submit" value="Next" name=submit />
									<input type="submit" value="Save & Exit" name=submit />
								</div-->
							</div><!-- End of .actions -->										
						</fieldset>
						<fieldset id="wiz_partner">
							<div class="row">
								<label for="d2_role">
									<strong>Type</strong>
								</label>
								<div>
									<select name=d2_role id=d2_role class="search required" data-placeholder="Choose a Type">
										<option value=""></option>
										<option value="Earn">Earn</option>
										<option value="Burn">Burn</option>
									</select>
								</div>
							</div>
							<div class="row">
								<label for="d2_role">
									<strong>Client</strong>
								</label>
								<div>
									<select name=d2_role id=d2_role class="search required" data-placeholder="Choose a Partner">
										<option value=""></option>
										<option value="Emirates">Emirates</option>
										<option value="Landmark">Landmark</option>
										<option value="Flipkart">Flipkart</option>
										<option value="Cleartrip">Cleartrip</option>
									</select>
								</div>
							</div>
							<div class="row">
								<label for="d2_username">
									<strong>Partner Name</strong>
								</label>
								<div>
									<input class="required" type=text name=d2_accountname id=d2_accountname />
								</div>
							</div>
							<div class="row">
								<label for="d2_role">
									<strong>Category</strong>
								</label>
								<div>
									<select name=d2_role id=d2_role class="search required" data-placeholder="Choose a Partner">
										<option value=""></option>
										<option value="Travel">Travel</option>
										<option value="Retail">Retail</option>
										<option value="Airline">Airline</option>
									</select>
								</div>
							</div>
							<div class="row">
								<label for="f1_textarea_grow">
									<strong>Merchant Category Code (MCC)</strong>
									<small></small>
								</label>
								<div>
									<textarea rows=5 name="f1_textarea_grow" id="f1_textarea_grow"></textarea>
								</div>
							</div>
							<div class="row">
								<label for="f1_textarea_grow">
									<strong>Merchant Id</strong>
									<small></small>
								</label>
								<div>
									<textarea rows=5 name="f1_textarea_grow" id="f1_textarea_grow"></textarea>
								</div>
							</div>
							<div class="row">
								<label for="f1_textarea_grow">
									<strong>Terminal Id</strong>
									<small></small>
								</label>
								<div>
									<textarea rows=5 name="f1_textarea_grow" id="f1_textarea_grow"></textarea>
								</div>
							</div>
							<div class="row">
								<label for="f1_textarea_grow">
									<strong>Description</strong>
									<small></small>
								</label>
								<div>
									<textarea rows=5 name="f1_textarea_grow" id="f1_textarea_grow"></textarea>
								</div>
							</div>
						</fieldset>
						<fieldset id="wiz_glaccount">
							<div class="row">
								<label>
									<strong>GL Accounts</strong>
								</label>
								<div>
									<div class="grid_12">
										<div class="box">
										
											<div class="header">
												</h2></h2>
											</div>
											
											<div class="content">
											
												<table class="styled">
													<colgroup>
													   <col span="1">
													   <col span="1">
													   <col span="1">
													   <col span="1">
													</colgroup>

													<thead>
														<tr>
															
															<th>GL Account Type </th>
															<th>GL Account Name</th>
															<th>GL Account Number</th>
															<th>Actions</th>
														</tr>
													</thead>
													<tbody>
														<tr>
															<td><label>Liability Pool</label>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter the GL account name!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter the GL account number!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td class="center">
																<a href="#" class="button small grey tooltip" data-gravity=s title="Edit"><i class="icon-pencil"></i></a>
																<a href="#" class="button small grey tooltip" data-gravity=s title="Remove"><i class="icon-remove"></i></a>
															</td>
														</tr>
														<tr>
															<td><label>Asset Pool</label>
															<td>
																<div>
																	<input type="text" placeholder="Enter the GL account name!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter the GL account number!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td class="center">
																<a href="#" class="button small grey tooltip" data-gravity=s title="Edit"><i class="icon-pencil"></i></a>
																<a href="#" class="button small grey tooltip" data-gravity=s title="Remove"><i class="icon-remove"></i></a>
															</td>
														</tr>
														<tr>
															<td><label>Profit Pool</label>
															<td>
																<div>
																	<input type="text" placeholder="Enter the GL account name!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter the GL account number!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td class="center">
																<a href="#" class="button small grey tooltip" data-gravity=s title="Edit"><i class="icon-pencil"></i></a>
																<a href="#" class="button small grey tooltip" data-gravity=s title="Remove"><i class="icon-remove"></i></a>
															</td>
														</tr>
														<tr>
															<td><label>Fee Pool</label>
															<td>
																<div>
																	<input type="text" placeholder="Enter the GL account name!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter the GL account number!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td class="center">
																<a href="#" class="button small grey tooltip" data-gravity=s title="Edit"><i class="icon-pencil"></i></a>
																<a href="#" class="button small grey tooltip" data-gravity=s title="Remove"><i class="icon-remove"></i></a>
															</td>
														</tr>
													</tbody>
												</table>
											</div><!-- End of .content -->
										</div><!-- End of .box -->
									</div><!-- End of .grid_12 -->
								</div>
							</div>
						</fieldset>
						<fieldset id="wiz_fees">
							<div class="row">
								<div>
									<div class="grid_12">
										<div class="box">
										
											<div class="header">
												</h2></h2>
											</div>
											
											<div class="content">
											
												<table class="styled">
													<colgroup>
													   <col span="1">
													   <col span="1">
													   <col span="1">
													   <col span="1">
													   <col span="1">
													   <col span="1">
													</colgroup>

													<thead>
														<tr>
															<th>Transaction Type </th>
															<th>Fee Type</th>
															<th>Min CAP</th>
															<th>Max CAP</th>
															<th>Value</th>
															<th>Start Date</th>
															<th>End Date</th>
														</tr>
													</thead>
													<tbody>
														<tr>
															<td><label>Earn</label>
															<td>
																<div>
																	<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose a fee type">
																		<option value=""></option>
																		<option value="Flat">Flat</option>
																		<option value="Percentage">Percentage</option>
																		<option value="Tier">Tier</option>
																	</select>
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter a minimum CAP!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter a maximum CAP!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter fee value!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="datetime" name=f3_datepicker id=f3_datepicker value="DD/MM/YYYY HH:MM" />
																</div>
															</td>
															<td>
																<div>
																	<input type="datetime" name=f3_datepicker1 id=f3_datepicker1 value="DD/MM/YYYY HH:MM" />
																</div>
															</td>
														</tr>
														
														<tr>
															<td><label>Burn</label>
															<td>
																<div>
																	<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose a fee type">
																		<option value=""></option>
																		<option value="Flat">Flat</option>
																		<option value="Percentage">Percentage</option>
																		<option value="Tier">Tier</option>
																	</select>
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter a minimum CAP!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter a maximum CAP!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter fee value!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="datetime" name=f3_datepicker id=f3_datepicker value="DD/MM/YYYY HH:MM" />
																</div>
															</td>
															<td>
																<div>
																	<input type="datetime" name=f3_datepicker1 id=f3_datepicker1 value="DD/MM/YYYY HH:MM" />
																</div>
															</td>
														</tr>
														
														<tr>
															<td><label>Reverse Transaction</label>
															<td>
																<div>
																	<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose a fee type">
																		<option value=""></option>
																		<option value="Flat">Flat</option>
																		<option value="Percentage">Percentage</option>
																		<option value="Tier">Tier</option>
																	</select>
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter a minimum CAP!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter a maximum CAP!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter fee value!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="datetime" name=f3_datepicker id=f3_datepicker value="DD/MM/YYYY HH:MM" />
																</div>
															</td>
															<td>
																<div>
																	<input type="datetime" name=f3_datepicker1 id=f3_datepicker1 value="DD/MM/YYYY HH:MM" />
																</div>
															</td>
														</tr>
														<tr>
															<td><label>Adjust Points</label>
															<td>
																<div>
																	<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose a fee type">
																		<option value=""></option>
																		<option value="Flat">Flat</option>
																		<option value="Percentage">Percentage</option>
																		<option value="Tier">Tier</option>
																	</select>
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter a minimum CAP!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter a maximum CAP!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter fee value!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="datetime" name=f3_datepicker id=f3_datepicker value="DD/MM/YYYY HH:MM" />
																</div>
															</td>
															<td>
																<div>
																	<input type="datetime" name=f3_datepicker1 id=f3_datepicker1 value="DD/MM/YYYY HH:MM" />
																</div>
															</td>
														</tr>
														
														<tr>
															<td><label>Customer Enrolment</label>
															<td>
																<div>
																	<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose a fee type">
																		<option value=""></option>
																		<option value="Flat">Flat</option>
																		<option value="Percentage">Percentage</option>
																		<option value="Tier">Tier</option>
																	</select>
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter a minimum CAP!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter a maximum CAP!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="text" placeholder="Enter fee value!" name="f1_placeholder" id="f1_placeholder" />
																</div>
															</td>
															<td>
																<div>
																	<input type="datetime" name=f3_datepicker id=f3_datepicker value="DD/MM/YYYY HH:MM" />
																</div>
															</td>
															<td>
																<div>
																	<input type="datetime" name=f3_datepicker1 id=f3_datepicker1 value="DD/MM/YYYY HH:MM" />
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div><!-- End of .content -->
										</div><!-- End of .box -->
									</div><!-- End of .grid_12 -->
								</div>
							</div>
						</fieldset>
						
						<fieldset id="wiz_notifications">
							<div class="row">
								<div>
									<div class="grid_12">
										<div class="box">
										
											<div class="header">
												</h2></h2>
											</div>
											
											<div class="content">
											
												<table class="styled">
													<colgroup>
													   <col span="1">
													   <col span="1">
													   <col span="1">
													   <col span="1">
													   <col span="1">
													</colgroup>

													<thead>
														<tr>
															<th>Transaction Type </th>
															<th>Email Alert</th>
															<th>SMS Alert</th>
															<th>SMS Template</th>
															<th>Email Template</th>
														</tr>
													</thead>
													<tbody>
														<tr>
															<td><label>Customer Enrolment</label>
															<td>
																<div>
																	<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose alert">
																		<option value=""></option>
																		<option value="Enable">Enable</option>
																		<option value="Disable">Disable</option>
																	</select>
																</div>
															</td>
															<td>
																<div>
																	<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose alert">
																		<option value=""></option>
																		<option value="Enable">Enable</option>
																		<option value="Disable">Disable</option>
																	</select>
																</div>
															</td>
															<td class="center">
																<label>Add</label>
															</td>
															<td class="center">
																<label>Add</label>
															</td>
														</tr>
														<tr>
															<td><label>Earn</label>
															<td>
																<div>
																	<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose alert">
																		<option value=""></option>
																		<option value="Enable">Enable</option>
																		<option value="Disable">Disable</option>
																	</select>
																</div>
															</td>
															<td>
																<div>
																	<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose alert">
																		<option value=""></option>
																		<option value="Enable">Enable</option>
																		<option value="Disable">Disable</option>
																	</select>
																</div>
															</td>
															<td class="center">
																<label>Add</label>
															</td>
															<td class="center">
																<label>Add</label>
															</td>
														</tr>
														<tr>
															<td><label>Burn</label>
															<td>
																<div>
																	<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose alert">
																		<option value=""></option>
																		<option value="Enable">Enable</option>
																		<option value="Disable">Disable</option>
																	</select>
																</div>
															</td>
															<td>
																<div>
																	<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose alert">
																		<option value=""></option>
																		<option value="Enable">Enable</option>
																		<option value="Disable">Disable</option>
																	</select>
																</div>
															</td>
															<td class="center">
																<label>Add</label>
															</td>
															<td class="center">
																<label>Add</label>
															</td>
														</tr>
														<tr>
															<td><label>Adjust Points</label>
															<td>
																<div>
																	<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose alert">
																		<option value=""></option>
																		<option value="Enable">Enable</option>
																		<option value="Disable">Disable</option>
																	</select>
																</div>
															</td>
															<td>
																<div>
																	<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose alert">
																		<option value=""></option>
																		<option value="Enable">Enable</option>
																		<option value="Disable">Disable</option>
																	</select>
																</div>
															</td>
															<td class="center">
																<label>Add</label>
															</td>
															<td class="center">
																<label>Add</label>
															</td>
														</tr>
														<tr>
															<td><label>Reverse Transaction</label>
															<td>
																<div>
																	<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose alert">
																		<option value=""></option>
																		<option value="Enable">Enable</option>
																		<option value="Disable">Disable</option>
																	</select>
																</div>
															</td>
															<td>
																<div>
																	<select name=f2_select1 id=f2_select1 class="search" data-placeholder="Choose alert">
																		<option value=""></option>
																		<option value="Enable">Enable</option>
																		<option value="Disable">Disable</option>
																	</select>
																</div>
															</td>
															<td class="center">
																<label>Add</label>
															</td>
															<td class="center">
																<label>Add</label>
															</td>
														</tr>
													</tbody>
												</table>
												
											</div><!-- End of .content -->
											
										</div><!-- End of .box -->
									</div><!-- End of .grid_12 -->
								</div>
							</div>
						</fieldset>
						<fieldset id="wiz_finish">
							<div class="alert note top">
								<span class="icon"></span>
								<strong>Congratulations!</strong> You have successfully completed the application.
							</div>
							<p>Press &quotFinish&quot; to submit the application.</p>
						</fieldset>
					</div><!-- End of .content -->
					
					<div class="actions">
						<div class="left">
							<a href="#" class="button grey"><span><img src="img/icons/packs/fugue/16x16/arrow-180.png" width=16 height=16></span>Back</a>
						</div>
						<div class="right">
							<a href="#" class="button grey"><span><img src="img/icons/packs/fugue/16x16/arrow.png" width=16 height=16></span>Next</a>
							<a href="#" class="button finish"><span><img src="img/icons/packs/fugue/16x16/arrow.png" width=16 height=16></span>Finish</a>
						</div>
					</div><!-- End of .actions -->
					
				</form><!-- End of .box -->
			</div><!-- End of .grid_4 -->
			<script>
				$$.ready(function(){
					$('#wiz').wizard({
						onSubmit: function(){
							alert('Your Data:\n' + $('form#wiz').serialize());
							return false;
						}
					});
				});
			</script>
        </section><!-- End of #content -->

    </div><!-- End of #main -->

</body>
</html>
