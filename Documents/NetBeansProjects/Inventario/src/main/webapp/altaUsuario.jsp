
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="componentes/header.jsp"%>
<%@include file="componentes/bodyp1.jsp"%>
<h1>Alta de Usuarios</h1>
<p>Aqui puedes dar de alta a usuarios que podran entrar al sistema</p>
<form class="user" action="SvUsuario"method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="nombreUsu"name="nombreUsu"
                   placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apellidoUsu"name="apellidoUsu"
                   placeholder="Apellido">
        </div>
    </div>
         <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="usuarioUsu"name="usuarioUsu"
                   placeholder="Usuario">
        </div>
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user"
                   id="contrasenia"name="contrasenia" placeholder="Contraseña">
        </div>
          </div>
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Crear Cuenta
    </button>
    <a href="index.jsp" class="btn btn-primary btn-user btn-block">
        Regresar
    </a>
</form>
<%@include file="componentes/bodyf1.jsp"%>
