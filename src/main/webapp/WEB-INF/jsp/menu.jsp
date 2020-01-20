<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title></title>
<!-- Compiled and minified CSS -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
</head>
<div class = "topnav">

	<a href="${pageContext.request.contextPath}/welcome">Home</a>  &nbsp;
	<a href="${pageContext.request.contextPath}/addNewBus">Add Bus</a> &nbsp; 
	<a href="${pageContext.request.contextPath}/getBuses">Show Buses</a> &nbsp;
	<a href="${pageContext.request.contextPath}/findBus">Find Bus By ID</a> &nbsp;
	<a href="${pageContext.request.contextPath}/findType">Find Bus By Type</a> &nbsp;
	<a href="${pageContext.request.contextPath}/findOff">Off Day</a> &nbsp; 
    <a href="${pageContext.request.contextPath}/deleteBus">Delete Bus</a> &nbsp; 
	<a href="${pageContext.request.contextPath}/updateBus">Update Bus</a>
</div>