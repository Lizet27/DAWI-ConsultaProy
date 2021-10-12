package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Producto;
import com.cibertec.respository.ProductoRepository;


@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository repositorio;

	@Override
	public Producto insertaActualizaProducto(Producto obj) {
		return repositorio.save(obj);
	}

	@Override
	public List<Producto> listaProducto() {
		return repositorio.findAll();
	}

	
	
	
	
	
}
