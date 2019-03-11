package org.jorge.conexia.prueba.restaurante.lamejorcocina.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FACTURA")
public class Factura {

	@Id
	@Column(name = "ID_FACTURA", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idFactura;
	
	@ManyToOne(targetEntity=Cliente.class)
    @JoinColumn(referencedColumnName="ID_CLIENTE")
	private Cliente cliente;
	
	@ManyToOne(targetEntity=Camarero.class)
    @JoinColumn(referencedColumnName="ID_CAMARERO")
	private Camarero camarero;
	
	@ManyToOne(targetEntity=Mesa.class)
    @JoinColumn(referencedColumnName="ID_MESA")
	private Mesa mesa;
	
	@Column(name = "FECHA_FACTURA")
	private Date fechaFactura;
	
	public Factura() {
		
	}
	
	public Factura(Long idFactura, Cliente cliente, Camarero camarero, Mesa mesa, Date fechaFactura) {
		super();
		this.idFactura = idFactura;
		this.cliente = cliente;
		this.camarero = camarero;
		this.mesa = mesa;
		this.fechaFactura = fechaFactura;
	}
	
	public Long getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Camarero getCamarero() {
		return camarero;
	}

	public void setCamarero(Camarero camarero) {
		this.camarero = camarero;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}
	
}
