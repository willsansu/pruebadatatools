<%-- 
    Document   : index
    Created on : 21/06/2021, 11:09:37
    Author     : Wilson
--%>

<%@page import="webservices.TbEmpresa"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Empresa"%>
<%@page import="webservices.Servicios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <title>Pagina Inicial</title>
    </head>
    <body>
        <div class="container mt-4">
            <div class="card">
                <div class="card-header">
                    <a href="Controlador?accion=nuevo" class="btn btn-primary">Nueva Empresa</a>
                    
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Codigo Empresa</th>
                                <th>Ciudad</th>
                                
                                <th>Departamento</th>
                                <th>Identificación</th>
                            </tr>
                            
                        </thead>
                        <tbody>
                            
                            <%
                                Empresa ser=new Empresa() ;
                                List<TbEmpresa> datos=ser.listar();
                                for(TbEmpresa em:datos){
                                
                                
                            
                            %>
                             <tr>
                                <th><%= em.getCodempresa() %></th>
                                <th><%= em.getCiudad()%></th>
                                <th><%= em.getDepartamento()%></th>
                                <th><%= em.getNumidentificacion()%></th>
                            </tr>
                            
                            <%}%>
                        </tbody>
                    </table>
                    
                </div>
                
            </div>
            
            
        </div>
    </body>
</html>
