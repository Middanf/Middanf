<!DOCTYPE html>
<html lang="esS" >
<head>
<%@ include file="parts/header.jsp" %> 
<title>Registra Alumno</title>
</head>

<body background="img/fondo.jpg">

	<div class="container">
	
		<!-- Probando -->
		<% 
		String x = (String) request.getAttribute("msj");
		String a="";
		if(x!=null) a = x;
		%>
		<!-- Probando -->
		
	
		<div class="header clearfix">
			<nav>
				<ul class="nav nav-pills pull-right">
					<li role="presentacion" class="active"><a href="index.jsp">Login</a></li>
					<li role="presentation"><a href="registro.jsp">Registro</a></li>
	           		<li role="presentation"><a href="index.jsp">Contáctanos</a></li>
				</ul>
			</nav>
	        <br><br><br><br><br><br><br>
	        
		</div>
		
		
		<div class="row">
			<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
				<h1>Nombre de Empresa</h1>
			</div>
			<div class="row">
        <div class='col-md-3'></div>
        <div class="col-md-6">
            <div class="login-box well">
                    <form action="ServletLogin" id="id_form" name="frmsesion" method="post">
                        <legend>Login</legend>
                        <div class="form-group">
                            <input name="txtlogin" value='' id="username-email" placeholder="E-mail or Username" type="text" class="form-control" />
                        </div>
                        <div class="form-group">
                            <input name="txtpass" id="password" value='' placeholder="Password" type="text" class="form-control" />
                        </div>
                        <div class="input-group">
                          <div class="checkbox">
                            <label>
                              <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                            </label>
                          </div>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btn btn-default btn-login-submit btn-block m-t-md" value="Login" />
                        </div>
                        <span class='text-center'><a href="/resetting/request" class="text-sm">Forgot Password?</a></span>
                        <div class="form-group">
                            <p class="text-center m-t-xs text-sm">Do not have an account?</p> 
                            <a href="registro.jsp" class="btn btn-default btn-block m-t-md">Create an account</a>
                        </div>
                    </form>
                
            </div>
        </div>
        <div class='col-md-3'></div>
    </div>
		</div>
        
		<%@ include file="parts/footer.jsp" %>     


	</div>

</body>
</html>
