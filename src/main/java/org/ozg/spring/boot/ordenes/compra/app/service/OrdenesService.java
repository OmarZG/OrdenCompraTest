package org.ozg.spring.boot.ordenes.compra.app.service;

import java.util.Optional;

import org.ozg.spring.boot.ordenes.compra.app.model.Orden;
import org.ozg.spring.boot.ordenes.compra.app.repository.OrdenesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenesService implements IOrdenesService {
	
	@Autowired
	private OrdenesRepository ordenesRepository;

	@Override
	public Optional<Orden>  obtenerOrden(int id) {
		return ordenesRepository.findById(id);
	}

	@Override
	public Orden gurdarOrden(Orden ordenes) {
		System.out.println(" Gurdar Service =================>>> ");
		return ordenesRepository.save(ordenes);
	}

}
