<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="componentes/header.jsp"%>
<%@include file="componentes/bodyp1.jsp"%>
<h1>Alta de Consumible</h1>
<p>Aqui puedes dar de alta los consumibles de FMS</p>
<form class="user" action="SvConsumible"method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="marcaConsu"
                   placeholder="Marca">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="CantidadConsu"
                   placeholder="Cantidad">
        </div>
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user"
                   id="tipoConsu" placeholder="Tipo de Consumible">
          </div>
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Guardar
    </button>
    <a href="index.jsp" class="btn btn-primary btn-user btn-block">
        Regresar
    </a>
</form>
<%@include file="componentes/bodyf1.jsp"%>