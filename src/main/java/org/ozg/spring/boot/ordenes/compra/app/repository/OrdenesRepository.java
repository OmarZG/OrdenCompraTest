package org.ozg.spring.boot.ordenes.compra.app.repository;

import org.ozg.spring.boot.ordenes.compra.app.model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenesRepository extends JpaRepository<Orden, Integer> {

}
