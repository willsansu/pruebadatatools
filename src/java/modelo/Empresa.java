/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Wilson
 */
public class Empresa {
    
    
    public Empresa(){
    }

    public java.util.List<webservices.TbEmpresa> listar() {
        webservices.Servicios_Service service = new webservices.Servicios_Service();
        webservices.Servicios port = service.getServiciosPort();
        return port.listar();
    }

    public String agregar(java.lang.String codempresa, java.lang.String nombre, java.lang.String departamento, java.lang.String ciudad, java.lang.String numidentificacion, java.lang.String direccion) {
        webservices.Servicios_Service service = new webservices.Servicios_Service();
        webservices.Servicios port = service.getServiciosPort();
        return port.agregar(codempresa, nombre, departamento, ciudad, numidentificacion, direccion);
    }
    
    
}
