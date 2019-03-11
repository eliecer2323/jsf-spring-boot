package org.jorge.conexia.prueba.restaurante.lamejorcocina.controller;

import java.util.ArrayList;
import java.util.List;

import org.jorge.conexia.prueba.restaurante.lamejorcocina.model.Camarero;
import org.jorge.conexia.prueba.restaurante.lamejorcocina.model.Cliente;
import org.jorge.conexia.prueba.restaurante.lamejorcocina.model.DetalleFactura;
import org.jorge.conexia.prueba.restaurante.lamejorcocina.model.Factura;
import org.jorge.conexia.prueba.restaurante.lamejorcocina.repository.CamareroRepository;
import org.jorge.conexia.prueba.restaurante.lamejorcocina.repository.ClienteRepository;
import org.jorge.conexia.prueba.restaurante.lamejorcocina.repository.DetalleFacturaRepository;
import org.jorge.conexia.prueba.restaurante.lamejorcocina.repository.FacturaRepository;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "consultaController")
@ELBeanName(value = "consultaController")
@Join(path = "/consulta", to = "/factura-query.jsf")
public class ConsultaController {

	@Autowired
    private FacturaRepository facturaRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private CamareroRepository camareroRepository;
    @Autowired
    private DetalleFacturaRepository detalleFacturaRepository;

    private Factura factura = new Factura();
    private Cliente cliente = new Cliente();
    private Camarero camarero = new Camarero();    
    private List<DetalleFactura> detallesFactura = new ArrayList<DetalleFactura>();
    
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
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
	public List<DetalleFactura> getDetallesFactura() {
		return detallesFactura;
	}
	public void setDetallesFactura(List<DetalleFactura> detallesFactura) {
		this.detallesFactura = detallesFactura;
	}
    
}
