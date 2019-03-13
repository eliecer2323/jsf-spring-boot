package org.jorge.conexia.prueba.view;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jorge.conexia.prueba.model.CamareroVO;
import org.jorge.conexia.prueba.model.ClienteVO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "consultaController")
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
