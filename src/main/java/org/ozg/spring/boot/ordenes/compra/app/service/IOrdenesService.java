package org.ozg.spring.boot.ordenes.compra.app.service;

import java.util.Optional;

import org.ozg.spring.boot.ordenes.compra.app.model.Orden;

public interface IOrdenesService {
	
	Optional<Orden> obtenerOrden(int id);

	Orden gurdarOrden(Orden ordenes);

}
