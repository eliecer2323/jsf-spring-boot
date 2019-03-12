package org.jorge.conexia.prueba.restaurante.lamejorcocina.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.transform.Transformers;
import org.jorge.conexia.prueba.restaurante.lamejorcocina.model.Camarero;
import org.jorge.conexia.prueba.restaurante.lamejorcocina.model.CamareroVO;
import org.jorge.conexia.prueba.restaurante.lamejorcocina.model.Cliente;
import org.jorge.conexia.prueba.restaurante.lamejorcocina.model.ClienteVO;
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

	@PersistenceContext
	private EntityManager entityManager;

	private List<CamareroVO> camareros = new ArrayList<CamareroVO>();
	private List<ClienteVO> clientes = new ArrayList<ClienteVO>();

	public List<CamareroVO> getCamareros() {
//		camareros = this.entityManager.createQuery("SELECT c FROM Customer c", CamareroVO.class).getResultList();
		return camareros;
	}
	
	public List<ClienteVO> getClientes() {
		return clientes;
	}

	public void setCamareros(List<CamareroVO> camareros) {
		this.camareros = camareros;
	}

	public void setClientes(List<ClienteVO> clientes) {
		this.clientes = clientes;
	}

}
