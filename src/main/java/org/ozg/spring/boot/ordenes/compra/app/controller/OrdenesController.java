package org.ozg.spring.boot.ordenes.compra.app.controller;

import java.util.Optional;

import org.ozg.spring.boot.ordenes.compra.app.model.Orden;
import org.ozg.spring.boot.ordenes.compra.app.service.IOrdenesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrdenesController {
	
	@Autowired
	private IOrdenesService ordenesService;
	
	@GetMapping("/ordenes/{id}")
	public ResponseEntity<Orden> getOrdenesById(@PathVariable("id") int id){
		Optional<Orden> ordenData = ordenesService.obtenerOrden(id);
		if(ordenData.isPresent()) {
			return new ResponseEntity<>(ordenData.get(), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping("/ordenes")
	public ResponseEntity<Orden> crearOrden(@RequestBody Orden ordenes){
		try {
			System.out.println("Antes de Gurdar =================>>> ");
			Orden miOrden = ordenesService.gurdarOrden(ordenes);
			System.out.println("Despues de Gurdar =================>>> ");
			return new ResponseEntity<>(miOrden, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>( HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	

}
