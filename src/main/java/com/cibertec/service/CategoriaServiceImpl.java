package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Categoria;
import com.cibertec.respository.CategoriaRepository;


@Service
public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	private CategoriaRepository reposi;

	@Override
	public List<Categoria> listaCategoria() {
		return reposi.findAll();
	}


	
	
}
