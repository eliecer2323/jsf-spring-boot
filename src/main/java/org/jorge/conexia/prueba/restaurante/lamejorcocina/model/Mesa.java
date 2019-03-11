package org.jorge.conexia.prueba.restaurante.lamejorcocina.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MESA")
public class Mesa {
	
	@Id
	@Column(name = "ID_MESA", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idMesa;
	
	@Column(name = "NUM_MAX_COMENSALES")
	private Integer numMaxComensales;
	
	@Column(name = "UBICACION")
	private String ubicacion;
	
	public Mesa() {
		
	}
	
	public Mesa(Long idMesa, Integer numMaxComensales, String ubicacion) {
		super();
		this.idMesa = idMesa;
		this.numMaxComensales = numMaxComensales;
		this.ubicacion = ubicacion;
	}
	
	public Long getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(Long idMesa) {
		this.idMesa = idMesa;
	}
	public Integer getNumMaxComensales() {
		return numMaxComensales;
	}
	public void setNumMaxComensales(Integer numMaxComensales) {
		this.numMaxComensales = numMaxComensales;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
}
