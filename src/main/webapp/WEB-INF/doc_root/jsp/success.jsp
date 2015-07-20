<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html class="no-js" lang="en"> <!--<![endif]-->
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="description" content="slick and responsive Admin Template build with modern techniques like HTML5 and CSS3 to be used for backend solutions of any size.">
    <!-- Mobile viewport optimized: h5bp.com/viewport -->
    <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0;">
    <!-- iPhone: Don't render numbers as call links -->
    <meta name="format-detection" content="telephone=no">
</head>

<body>

    <!-- The container of the sidebar and content box -->
    <div role="main" id="main" class="container_12 clearfix">
        
		<jsp:include page="/WEB-INF/doc_root/jsp/template/toolbar.jsp"></jsp:include>
		<jsp:include page="/WEB-INF/doc_root/jsp/template/sidebar.jsp"></jsp:include>

        <!-- Here goes the content. -->
        <section id="content" class="container_12 clearfix" data-sort=true>
			<div class="successMessage" align="center">${message}</div>
        </section><!-- End of #content -->

    </div><!-- End of #main -->
    <!-- Spawn $$.loaded -->
    <script>
        $$.loaded();
    </script>
</body>
