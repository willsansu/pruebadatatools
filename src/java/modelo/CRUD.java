/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Wilson
 */
public interface CRUD {
	public List listar();
	public String add(long codempresa,
			String tipo,
			String numidentificacion,
			String nombre,
			String direccion,
			String ciudad,
			String departamento,
			String pais,
			String telefono,
			long codcontribuyente);
	public long addContribuyente(String tipo,
			String numidentificacion,
			String nombre,
			String direccion,
			String ciudad,
			String departamento,
			String pais,
			String telefono
			);

}