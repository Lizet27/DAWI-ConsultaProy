package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Producto;

public interface ProductoService {

	public Producto insertaActualizaProducto(Producto obj);
	public List<Producto> listaProducto();
}
