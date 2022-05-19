package org.ozg.spring.boot.ordenes.compra.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sucursales")
public class Sucursal implements Serializable {
	
	private static final long serialVersionUID = 4919044222701713944L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sucursal_id")
	private int id;
	
	private String nombre;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "orden_id")
	private List<Orden> listOrden = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Orden> getListOrden() {
		return listOrden;
	}

	public void setListOrden(List<Orden> listOrden) {
		this.listOrden = listOrden;
	}

}
