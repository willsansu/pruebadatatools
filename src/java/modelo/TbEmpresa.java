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
public class TbEmpresa {
	long codempresa;
	String tipo;
	String numidentificacion;
	String nombre;
	String direccion;
	String ciudad;
	String departamento;
	String pais;
	String telefono;
	long codcontribuyente;
	
	
	public TbEmpresa() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public TbEmpresa(long codempresa, String tipo, String numidentificacion, String nombre, String direccion,
			String ciudad, String departamento, String pais, String telefono, long codcontribuyente) {
		super();
		this.codempresa = codempresa;
		this.tipo = tipo;
		this.numidentificacion = numidentificacion;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.departamento = departamento;
		this.pais = pais;
		this.telefono = telefono;
		this.codcontribuyente = codcontribuyente;
	}



	public long getCodempresa() {
		return codempresa;
	}
	public void setCodempresa(long codempresa) {
		this.codempresa = codempresa;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumidentificacion() {
		return numidentificacion;
	}
	public void setNumidentificacion(String numidentificacion) {
		this.numidentificacion = numidentificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public long getCodcontribuyente() {
		return codcontribuyente;
	}
	public void setCodcontribuyente(long codcontribuyente) {
		this.codcontribuyente = codcontribuyente;
	}
	
	
	
	
	

}
