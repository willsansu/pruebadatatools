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
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class EmpresaDAO implements CRUD{

	PreparedStatement ps=null;
	ResultSet rs = null;
	Connection con=null;
	Conexion cone=new Conexion();
	
	final static List<TbEmpresa> emp=new ArrayList<>();
	
	public List listar() {
		// TODO Auto-generated method stub
                
                
		//List<TbEmpresa> emp=new ArrayList<TbEmpresa>();
		//String sentencia="select * from tb_empresa";
		
		try{
			/*con=cone.getConexion();
			ps=con.prepareStatement(sentencia);
			rs=ps.executeQuery();*/
                        for (int i=0; i<4; i++){
			//while(rs.next()){
				TbEmpresa em=new TbEmpresa();
				em.setCodempresa((i+1));
				em.setCiudad("GUAYAQUIL");
				em.setDireccion("PRUEBA");
				em.setDepartamento("PRUEBA");
				em.setNumidentificacion("092948308"+(i+1));
				emp.add(em);
			}
		}catch (Exception e) {
			
		}
		return emp;
	}

	
	public String add(String codempresa, String tipo, String numidentificacion, String nombre, String direccion,
			String ciudad, String departamento, String pais, String telefono, String codcontribuyente) {
		// TODO Auto-generated method stub
                
                TbEmpresa empresa=new TbEmpresa();
                empresa.setCodempresa(40);
                empresa.setTipo(tipo);
                empresa.setNumidentificacion(numidentificacion);
                empresa.setDepartamento(departamento);
                empresa.setCiudad(ciudad);
                empresa.setPais(pais);
                emp.add(empresa);
                
		return "Se agrego correctamente la empresa y contribuyente";
	}

	public long addContribuyente(String tipo, String numidentificacion, String nombre, String direccion, String ciudad,
			String departamento, String pais, String telefono) {
		// TODO Auto-generated method stub
		return 0;
	}

    
    public String add(long codempresa, String tipo, String numidentificacion, String nombre, String direccion, String ciudad, String departamento, String pais, String telefono, long codcontribuyente) {
        TbEmpresa empresa=new TbEmpresa();
                empresa.setCodempresa(40);
                empresa.setTipo(tipo);
                empresa.setNumidentificacion(numidentificacion);
                empresa.setDepartamento(departamento);
                empresa.setCiudad(ciudad);
                empresa.setPais(pais);
                emp.add(empresa);
                
		return "Se agrego correctamente la empresa y contribuyente";
    }

}
