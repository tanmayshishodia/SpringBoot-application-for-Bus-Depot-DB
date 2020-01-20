<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="http://fonts.googleapis.com/css?family=Ubuntu:regular,bold&subset=Latin">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
<title>Show Buses</title>
<style>

/* Add a black background color to the top navigation */
.topnav {
  background-color: #33CEFF;
  overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
  float: left;
  color: #CCF9F6;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

/* Add a color to the active/current link */
.topnav a.active {
  background-color: #4CAF50;
  color: white;
}

* {
	font-family : Ubuntu;"
}

body {
	display: flex;
	min-height: 100vh;
	flex-direction: column;
}

main {
	flex: 1 0 auto;
}

.blacktext {
	color: black;
	font-size: 20px;
}

th {
	background-color: #0EA6F2;
	color: white;
	text-align: center;
}

td {
	text-align: center;
}

table {
	border-collapse: collapse;
}

table, th, td {
	border: 2px solid black;
}
</style>


</head>

<jsp:include page="menu.jsp" />
<center>
	   
	<h5 style="color: red;">Bus Details</h5>
</center>
<center>
	<table style="width: 80%">
		<tr>
			<th>Bus ID</th>
			<th>Bus Name</th>
			<th>Model Name</th>
			<th>Route</th>
			<th>Start Time</th>
			<th>End Time</th>
			<th>Off Day</th>
			<th>Driver Number</th>
			<th>Parking Address</th>
			<th>Bus Type</th>
		</tr>
		<c:forEach var="listValue" items="${buses}">
			<tr>
				<td>${listValue.busID}</td>
				<td>${listValue.busName}</td>
				<td>${listValue.modelName}</td>
				<td><c:out value="${listValue.route}" /></td>
				<td><c:out value="${listValue.startTime}" /></td>
				<td><c:out value="${listValue.endTime}" /></td>
				<td><c:out value="${listValue.offDay}" /></td>
				<td><c:out value="${listValue.driverNum}" /></td>
				<td><c:out value="${listValue.parkAddr}" /></td>
				<td><c:out value="${listValue.busType}" /></td>
			</tr>
		</c:forEach>
	</table>
</center>

</html>