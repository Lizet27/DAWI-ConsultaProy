package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Consultar;
import com.empresa.respository.ConsultaRepository;

@Service
public class ConsultaServiceImple implements ConsultaService {
	
	@Autowired
	private ConsultaRepository repository;

	@Override
	public Consultar insertaConsulta(Consultar obj) {
		return repository.save(obj);
	}

	@Override
	public List<Consultar> listaconsulta() {
       return repository.findAll();
	}

}
