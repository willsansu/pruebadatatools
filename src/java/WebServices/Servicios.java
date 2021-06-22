/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.EmpresaDAO;
import modelo.TbEmpresa;

/**
 *
 * @author Wilson
 */
@WebService(serviceName = "Servicios")
public class Servicios {
    EmpresaDAO daoM=new EmpresaDAO();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listar")
    public List<TbEmpresa> listar() {
        //TODO write your implementation code here:
        List datos=daoM.listar();
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "codempresa") String codempresa, @WebParam(name = "nombre") String nombre, @WebParam(name = "departamento") String departamento, @WebParam(name = "ciudad") String ciudad, @WebParam(name = "numidentificacion") String numidentificacion, @WebParam(name = "direccion") String direccion) {
        //TODO write your implementation code here:
        String datos=daoM.add("", ciudad, numidentificacion, nombre, direccion, ciudad, departamento, ciudad, direccion, "");
        return null;
    }
}
