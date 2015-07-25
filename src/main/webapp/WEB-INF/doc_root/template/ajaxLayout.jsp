<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>
<head>

<link rel="stylesheet" href="<c:url value="/css/resemble.css" /> " type="text/css" media="all"/>

<script type="text/javascript" src="<c:url value="/js/library/jquery-min-1.9.0.js"/> "></script>
<script type="text/javascript" src="<c:url value="/js/library/jquery-ui-1.9.2.min.js"/> "></script>
<script type="text/javascript" src="<c:url value="/js/base.js"/> "></script>

</head>
<body>
<tiles:insertAttribute name="body"/>
</body>
</html>