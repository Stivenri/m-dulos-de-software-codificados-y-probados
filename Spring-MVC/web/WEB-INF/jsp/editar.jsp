<%-- 
    Document   : editar
    Created on : 14/11/2024, 2:33:36 p. m.
    Author     : stive
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
      <title>Crud</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card borde-info">
                <div class="card-header bg-info">
                    <h4>Actualizar Registro</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Nombres</label>
                        <input type="text" name="nom" class="form-control" value="${lista[0].Nombres}">
                        <label>Correo</label>
                        <input type="text" name="correo" class="form-control" value="${lista[0].Correo}">
                        <label>Nacionalidad</label>
                        <input type="text" name="nacio" class="form-control" value="${lista[0].Nacionalidad}"><br>
                        <input type="submit" value="Actualizar" class="btn btn-success">
                        <a href="index.htm">Regresar</a>
                    </form>                  
                </div>
            </div>
        </div>
    </body>
</html>
