package org.jorge.conexia.prueba.restaurante.lamejorcocina.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAMARERO")
public class Camarero {
	
	@Id
	@Column(name = "ID_CAMARERO", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCamarero;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDO1")
	private String apellido1;
	
	@Column(name = "APELLIDO2")
	private String apellido2;
	
	public Camarero() {
		
	}
	
	public Camarero(Long idCamarero, String nombre, String apellido1, String apellido2) {
		super();
		this.idCamarero = idCamarero;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}
	
	public Long getIdCamarero() {
		return idCamarero;
	}
	public void setIdCamarero(Long idCamarero) {
		this.idCamarero = idCamarero;
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
