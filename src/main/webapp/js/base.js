$(function(){
	$(document).ready(function(){
		hideProgessBar();
		if(typeof console === "undefined") {
		    console = {
		        log : function () {}
		    };
		}
		setCSSToUI();
		$(window).resize(function() {
			setCSSToUI();
		});
		
        var perPage = 5;
        var opened = 1;
        var onClass = 'on';
        var paginationSelector = '.pages';
        $('.gallery').simplePagination(perPage, opened, onClass, paginationSelector);

	});
	

});

function setCSSToUI(){
	var pageHeight =$(window).height();
	var pageWidth =$(window).width();
	$("#id_body").css("height", pageHeight);
	$("#id_body").css("width", pageWidth);
}

function show_menu(){
    var menu = document.getElementById('dropdown_menu');
    
    if(menu.style.display == 'block'){
        menu.style.display = 'none';
    }else {
        menu.style.display = 'block';                    
    }
}

function setProgressBar(){
       showProgressBar();
}

function hideProgessBar(){
       $("#id_progressBarNew").hide();
       
       $("#dialog_add_client").hide();
       
       $('loading-overlay').hide();
       $('loading').hide();
}


function showProgressBar(id){
       $("#id_progressBarNew").show();
       $('loading-overlay').show();
       $('loading').show();
     var showLoading = "<div id='loading-overlay'></div>"+
							"<div id='loading'>"+
							"<span>Loading...</span> </div>";
	
	 $(id).append(showLoading);
}


$(document).ready(function(){
       $('#login1122').click(function(){
    	   var userName = $("#id_username").val();
    	   var password = $("#id_password").val();
    	   if(userName == ""){
    	   }else if(password == ""){
    	   }else{
    		   showProgressBar("#id_login_form");
    	   }
       });
});

$(document).ready(function() {
	
	hideProgessBar();

	$('#logout').click(function(event) {
		 window.location.href='logout';
	 });
	 
	 $('#homePage').click(function(event){
	 		 window.location.href='homePage';
	 });
	 
	 $('#id_submit_client').click(function(){
			if(validateClientValues()){
			}else{
				return false;
			}
		});
}); 
