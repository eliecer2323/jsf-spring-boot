package org.jorge.conexia.prueba.restaurante.lamejorcocina.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

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
import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "facturaController")
@ELBeanName(value = "facturaController")
@Join(path = "/factura", to = "/factura-form.jsf")
public class FacturaController {
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
    private DetalleFactura detalle = new DetalleFactura();

    public void onConfirmarEdicion(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Detalle editado", ((DetalleFactura) event.getObject()).getPlato());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onCancelarEdicion(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((DetalleFactura) event.getObject()).getPlato());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void agregarDetalle(DetalleFactura nuevoDetalle) {
        detallesFactura.add(nuevoDetalle);
        FacesMessage msg = new FacesMessage("Detalle Agregado", detalle.getPlato());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public String guardar() {
    	factura.setCliente(cliente);
    	factura.setCamarero(camarero);
    	clienteRepository.save(cliente);
    	camareroRepository.save(camarero);
    	facturaRepository.save(factura);
    	for (DetalleFactura detalleFactura : detallesFactura) {
			detalleFactura.setFactura(factura);
			detalleFacturaRepository.save(detalleFactura);
		}
    	factura = new Factura();
    	cliente = new Cliente();
        camarero = new Camarero();    
        detallesFactura = new ArrayList<DetalleFactura>();
        detalle = new DetalleFactura();
    	FacesMessage msg = new FacesMessage("Factura guardada", "exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        return "/factura-form.xhtml?faces-redirect=true";
    }

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

	public DetalleFactura getDetalle() {
		return detalle;
	}

	public void setDetalle(DetalleFactura detalle) {
		this.detalle = detalle;
	}

}