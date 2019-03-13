package org.jorge.conexia.prueba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COCINERO")
public class Cocinero {

	@Id
	@Column(name = "ID_COCINERO", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCocinero;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDO1")
	private String apellido1;
	
	@Column(name = "APELLIDO2")
	private String apellido2;
	
	public Cocinero() {
		
	}
	
	public Cocinero(Long idCocinero, String nombre, String apellido1, String apellido2) {
		super();
		this.idCocinero = idCocinero;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}
	
	public Long getIdCocinero() {
		return idCocinero;
	}
	public void setIdCocinero(Long idCocinero) {
		this.idCocinero = idCocinero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}	
	
}
