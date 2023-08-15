<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="componentes/header.jsp"%>
<%@include file="componentes/bodyp1.jsp"%>
<h1>Alta de Personal</h1>
<p>Aqui puedes dar de alta al personal de FMS</p>
<form class="user" action="SvPersonal"method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="nombrePer"
                   placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apellidoPer"
                   placeholder="Apellido">
        </div>
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user"
                   id="departamentoPer" placeholder="Departamento">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user"
                   id="correoPer" placeholder="Correo">
        </div>
    </div>
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Guardar
    </button>
    <a href="index.jsp" class="btn btn-primary btn-user btn-block">
        Regresar
    </a>
</form>
<%@include file="componentes/bodyf1.jsp"%>