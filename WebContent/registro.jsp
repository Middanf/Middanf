<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="parts/header.jsp" %> 
<meta charset="UTF-8">
<title>Registrar Alumno</title>
</head>
<body>

<div class="container">
	<div class="header clearfix">
		<nav>
          <ul class="nav nav-pills pull-right">
            <li role="presentation"><a href="#">Login</a></li>
            <li role="presentation" class="active"><a href="#">Registro</a></li>
            <li role="presentation"><a href="#">Contáctanos</a></li>
          </ul>
        </nav>
        <h3 class="text-muted">Aula Virtual</h3>
        <br>
        <br>
	</div>
	<h1>Registrar Alumno</h1>


	<div class="row">
		<div class="col-lg-6 jumbotron">
		
			<form action="ServletUser?tipo=registrar" id="id_form" name="frmsesion" method="post">	
				<div class="form-group">
					<label class="control-label" for="id_nombre">User Name</label>
					<input name="txt_user" id="txt_user" class="form-control" placeholder="User Name" type="text">
				</div>
				<div class="form-group">
					<label class="control-label" for="id_nombre">Last Name</label>
					<input name="txt_lastname" id="txt_lastname" class="form-control" placeholder="Last Name" type="text">
				</div>
				<div class="form-group">
					<label class="control-label" for="id_nombre">EMail</label>
					<input name="txt_email" id="txt_email" class="form-control" placeholder="Correo" type="email">
				</div>
				<div class="form-group">
					<label class="control-label" for="id_nombre">Cellphone</label>
					<input name="txt_cellphone" id="txt_cellphone" class="form-control" placeholder="Numero de Telefono o Celular" type="text">
				</div>
				<div class="form-group">
					<label class="control-label" for="id_nombre">Create Login</label>
					<input name="txt_login" id="txt_login" class="form-control" placeholder="Crear Login" type="text">
				</div>
				<div class="form-group">
					<label class="control-label" for="id_nombre">Create Password</label>
					<input name="txt_password" id="txt_password" class="form-control" placeholder="Crear password" type="password">
				</div>
				<div class="form-group">
					<label class="control-label" for="id_nombre">Repeat Password</label>
					<input class="form-control" placeholder="Repetir password" type="password">
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary" name="validateBtn" value="iniciar">Crea Alumno</button>
				</div>
			</form>
		
		</div>
	
	</div>

</div>
<%@ include file="parts/footer.jsp" %>    
</body>
</html>