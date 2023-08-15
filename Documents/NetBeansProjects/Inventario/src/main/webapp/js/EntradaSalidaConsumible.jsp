<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
    <center><div class="container" style="margin-top: 80px">
            <form action="LoginController" method="POST">
                <div class="card" style="width: 30rem;">
                    <div class="card-body">
                        <h3>Registrar Consumible</h3>
                        <input type="text" name="txtipo" class="form-control mt2" placeholder="Tipo ( Laptop o Escritorio)" required><br>
                        <input type="text" name="txtmarca" class="form-control mt2" placeholder="Marca" required><br>
                        <input type="text" name="txtmodelo" class="form-control mt2" placeholder="Modelo" required><br>
                        <input type="text" name="txtmodelo" class="form-control mt2" placeholder="Fecha de movimiento" required><br>
                        <select name="select" class="form-control mt2">
                            <option value="0" selected>Seleccionar</option>
                            <option value="1" >Entrada</option>
                            <option value="2">Salida</option>
                        </select><br>
                        <input type="submit" class="btn btn-primary btn-block mt2" name="btn-login" value="Guardar">
                    </div>    
                </div>
            </form>    
        </div>
    </center>



</body>
</html>
