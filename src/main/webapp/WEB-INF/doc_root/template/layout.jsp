<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>


<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<title>LMS Admin Panel: Add Role</title>
<meta name="description"
	content="slick and responsive Admin Template build with modern techniques like HTML5 and CSS3 to be used for backend solutions of any size.">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<meta name="format-detection" content="telephone=no">

<link rel="shortcut icon" href="favicon.ico" />
<link rel="stylesheet" href="<c:url value="/css/base.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet" href="<c:url value="/css/style.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet" href="<c:url value="/css/grid.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet" href="<c:url value="/css/layout.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet" href="<c:url value="/css/icons.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value="/css/fonts/font-awesome.css"/>" type="text/css"
	media="all" />
<link rel="stylesheet"
	href="<c:url value="/css/external/jquery-ui-1.9.1.custom.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value="/css/external/jquery.chosen.css"/>" type="text/css"
	media="all" />
<link rel="stylesheet"
	href="<c:url value="/css/external/jquery.cleditor.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value="/css/external/jquery.colorpicker.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value="/css/external/jquery.elfinder.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value="/css/external/jquery.fancybox.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value="/css/external/jquery.jgrowl.css"/>" type="text/css"
	media="all" />
<link rel="stylesheet"
	href="<c:url value="/css/external/jquery.plupload.queue.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value="/css/external/syntaxhighlighter/shCore.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value="/css/external/syntaxhighlighter/shThemeDefault.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet" href="<c:url value="/css/elements.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet" href="<c:url value="/css/forms.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet" href="<c:url value="/css/print-invoice.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet" href="<c:url value="/css/typographics.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet" href="<c:url value="/css/media-queries.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet" href="<c:url value="/css/ie-fixes.css"/>"
	type="text/css" media="all" />
<link rel="stylesheet"
	href="<c:url value="/css/themes/alertify.core.css"/>" type="text/css"
	media="all" />
<link rel="stylesheet"
	href="<c:url value="/css/themes/alertify.default.css"/>"
	type="text/css" media="all" id="toggleCSS" />

<script type="text/javascript"
	src="<c:url value="/js/libs/alertify.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/libs/jquery-1.10.2.min.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/libs/jquery-migrate-1.2.1.min.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/libs/jquery-ui-1.9.1.min.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/libs/lo-dash.min.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/libs/require-2.0.6.min.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/mylibs/polyfills/modernizr-2.6.1.min.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/mylibs/polyfills/respond.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/mylibs/polyfills/matchmedia.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/mylibs/jquery.hashchange.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/mylibs/jquery.idle-timer.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/mylibs/jquery.plusplus.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/mylibs/jquery.scrollTo.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/mylibs/jquery.ui.touch-punch.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/mylibs/jquery.ui.multiaccordion.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/mylibs/number-functions.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/mylibs/fullstats/jquery.css-transform.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/mylibs/fullstats/jquery.animate-css-rotate-scale.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/mylibs/forms/jquery.validate.js"/> "></script>
<script type="text/javascript"
	src="<c:url value="/js/client/clientmanagement.js"/> "> </script>
<script type="text/javascript" src="<c:url value="/js/base.js"/> "></script>
<script type="text/javascript" src="<c:url value="/js/user/user.js"/> "> </script>
<script type="text/javascript"
	src="<c:url value="/js/program/program.js"/> "> </script>





<!-- Do not touch! -->
<script type="text/javascript" src="<c:url value="/js/mango.js"/> "></script>
<script type="text/javascript" src="<c:url value="/js/plugins.js"/> "></script>
<script type="text/javascript" src="<c:url value="/js/script.js"/> "></script>

<!-- Your custom JS goes here -->
<script type="text/javascript" src="<c:url value="/js/app.js"/> "></script>
<script type="text/javascript" src="<c:url value="/js/leftmenu.js"/> "></script>

<script type="text/javascript"
	src="<c:url value="/js/manageroles.js"/> "></script>
<script type="text/javascript" src="<c:url value="/js/main.js"/> "></script>


<!-- end scripts -->



<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body id="id_body">
	<header>
		<tiles:insertAttribute name="header" />
	</header>

	<div id="id_mainContainer">
		<tiles:insertAttribute name="mainContainer" />
	</div>
	<footer>
		<tiles:insertAttribute name="footer" />
	</footer>

</body>
</html>