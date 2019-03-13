package org.jorge.conexia.prueba.repository;

import org.jorge.conexia.prueba.model.Factura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends CrudRepository<Factura, Long> {

}
