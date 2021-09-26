package com.empresa.service;

import java.util.List;

import com.empresa.entity.Consultar;

public interface ConsultaService {
	
	public Consultar insertaConsulta(Consultar obj);
	public List<Consultar> listaconsulta();

}
