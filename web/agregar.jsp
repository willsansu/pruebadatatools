<%-- 
    Document   : agregar
    Created on : 21/06/2021, 18:23:41
    Author     : Wilson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

        <title>Ingreso de Empresa</title>
    </head>
    <body>
           <div class="container mt-4">
            <div class="card">
                <div class="card-header">
                    <h5>Agregar Nueva Empresa</h5>
                    
                </div>
                <div class="card-body">
                    <form action="Controlador">
                        <label>Tipo</label>
                        <input type="text" name="txtTipo" class="form-control">
                        <label>Identificación</label>
                        <input type="text" name="txtNumiden" class="form-control">
                        <label>Departamento</label>
                        <input type="text" name="txtDep" class="form-control">
                        <label>Ciudad</label>
                        <input type="text" name="txtCiudad" class="form-control">
                        <label>País</label>
                        <input type="text" name="txtPais" class="form-control">
                        <input type="submit" name="accion" value="Guardar">
                        <a href="Controlador?accion=indice">Regresar al Menú</a>



                    </form>
                </div>
                
            </div>
            
            
        </div>
    </body>
</html>
