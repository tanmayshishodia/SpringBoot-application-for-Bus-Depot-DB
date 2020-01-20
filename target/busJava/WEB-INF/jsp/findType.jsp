<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Ubuntu:regular,bold&subset=Latin">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title></title>
<!-- Compiled and minified CSS -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">

<title>Find Bus</title>
<jsp:include page="menu.jsp" />

<style>
* {
	font-family : Ubuntu;"
}

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

.content-section {
  background: #ffffff;
  padding: 10px 20px;
  border: 2px solid #dddddd;
  border-radius: 3px;
  margin-bottom: 20px;
  width : 60%;
  
}
</style>

</head>
<body>
	<h3 style="color: red;">Find Bus</h3>

	<div id="findType">
		<form:form action="/findType" method="post" modelAttribute="bus">
			<p>
				<label>Enter Bus Type</label>
				<form:input path="busType" />
			</p>
			
		<input type="SUBMIT" value="Submit" />
		
	<ul>
		<c:forEach var="listValue" items= "${buses}" >
			<li>${listValue}</li>
		</c:forEach>
	</ul>
	</form:form>
	</div>
</body>
</html>