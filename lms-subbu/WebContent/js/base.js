$(function(){
	$(document).ready(function(){
	
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
}


function showProgressBar(){
       $("#id_progressBarNew").show();
       $('#loading').fadeOut(mango.config.fxSpeed);
		$('#loading-overlay').delay(100 + mango.config.fxSpeed).fadeOut(mango.config.fxSpeed * 8);
       
}


$(document).ready(function(){
       $('.login1122').click(function(){
              setProgressBar();
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
	 	 
}); 
