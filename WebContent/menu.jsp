<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>

<head>
	<meta charset="ISO-8859-1">
	<%@ include file="parts/header.jsp" %> 
	<title>Insert title here</title>
</head>

<body background="img/fondo.jpg">

	<div class="container">
	
		<div class="header clearfix">
				<nav>
					<ul class="nav nav-pills pull-right">
						<li role="presentation"><a href="ServletAlumno?tipo=listar">Listar Alumnos</a><br></li>
		           		<li role="presentation"><a href="registrarAlumno.jsp">Registrar Alumno</a></li>
					</ul>
				</nav>
				
				<br><br>
				
				<% String mensaje = (String) request.getAttribute("mensaje"); %>
	
				<h1><%=mensaje %></h1>
		</div>
	
		<%@ include file="parts/footer.jsp" %>
	</div>

</body>
</html>