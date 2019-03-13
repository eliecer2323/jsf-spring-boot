package org.jorge.conexia.prueba.repository;

import org.jorge.conexia.prueba.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
