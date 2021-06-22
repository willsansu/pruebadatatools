/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Wilson
 */
public class Conexion {
	Connection con;
	public Conexion(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://ns1.comunidaddeberea.com:3306/daveexpr_pruebaempresa","daveexpr_useradmin","Spartanos777");
                        if(con!=null)
                            System.out.println("conexion establecida");
                        else
                            System.out.println("error de conexion");
                }catch (Exception e) {
			// TODO: handle exception
                        e.printStackTrace();
		}
		
	}
	
	public Connection getConexion(){
		return con;
	}

}
