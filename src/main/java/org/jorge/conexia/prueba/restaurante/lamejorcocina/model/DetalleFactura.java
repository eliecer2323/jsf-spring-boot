package org.jorge.conexia.prueba.restaurante.lamejorcocina.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DETALLE_FACTURA")
public class DetalleFactura {
	
	@Id
	@Column(name = "ID_DETALLE_FACTURA", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long idDetalleFactura;
	
	@ManyToOne(targetEntity=Factura.class)
    @JoinColumn(referencedColumnName="ID_FACTURA")
	private Factura factura;
	
	@ManyToOne(targetEntity=Cocinero.class)
    @JoinColumn(referencedColumnName="ID_COCINERO")
	private Cocinero cocinero;
	
	@Column(name = "PLATO")
	private String plato;
	
	@Column(name = "IMPORTE")
	private Double importe;
	
	public DetalleFactura() {
		
	}

	public DetalleFactura(Long idDetalleFactura, Factura factura, Cocinero cocinero, String plato, Double importe) {
		super();
		this.idDetalleFactura = idDetalleFactura;
		this.factura = factura;
		this.cocinero = cocinero;
		this.plato = plato;
		this.importe = importe;
	}

	public Long getIdDetalleFactura() {
		return idDetalleFactura;
	}

	public void setIdDetalleFactura(Long idDetalleFactura) {
		this.idDetalleFactura = idDetalleFactura;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Cocinero getCocinero() {
		return cocinero;
	}

	public void setCocinero(Cocinero cocinero) {
		this.cocinero = cocinero;
	}

	public String getPlato() {
		return plato;
	}

	public void setPlato(String plato) {
		this.plato = plato;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}
	
}
