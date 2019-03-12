package org.jorge.conexia.prueba.restaurante.lamejorcocina.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CamareroVO {
	
	@Id
	@Column(name = "ID_CAMARERO")
	private String idCamarero;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDO1")
	private String apellido1;
	
	@Column(name = "APELLIDO2")
	private String apellido2;
	
	@Column(name = "MES")
	private String mes;
	
	@Column(name = "TOTAL_FACTURADO")
	private Double totalFacturado;

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

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Double getTotalFacturado() {
		return totalFacturado;
	}

	public void setTotalFacturado(Double totalFacturado) {
		this.totalFacturado = totalFacturado;
	}

	public String getIdCamarero() {
		return idCamarero;
	}

	public void setIdCamarero(String idCamarero) {
		this.idCamarero = idCamarero;
	}
	
}
