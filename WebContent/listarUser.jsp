<%@page import="entidad.User"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<User> du= (List<User>)request.getAttribute("data");%>

<h2 align="center">LISTADO DE USUARIOS</h2>
<p align="center" ><a href="registro.jsp"> + Nuevo Registro</a>

<table border="2" align="center" width="75%"> <tr>
	<th>CODIGO</th>
	<th>USER_NAME</th>
	<th>LASTNAME</th>
	<th>LOGIN</th>
	<th>PASSWORD</th>
	<th>EMAIL</th>
	<th>CELLPHONE</th>
	<th colspan="2">ACCIONES</th>
	</tr>
	<%
	if(du!=null){
	for(User u:du){
	%>
	<tr>
	<td><%=u.getUser_id()%></td>
	<td><%=u.getName_user()%></td>
	<td><%=u.getLastname()%></td>
	<td><%=u.getLogin()%></td>
	<td><%=u.getPassword()%></td>
	<td><%=u.getEmail()%></td>
	<td><%=u.getCellphone()%></td>
	<td colspan="2" align="center">
	<a href=""><img alt="Editar" title="Editar"
	src="img/edit.gif"></a>
	<a href=""><img alt="Eliminar" title="Eliminar"
	src="img/delete.gif"></a>
	</td>
	</tr>
	<%
	}
	}
	%> 
</table>

</body>
</html>