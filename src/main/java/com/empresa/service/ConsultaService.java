package com.empresa.service;

import java.util.List;

import com.empresa.entity.Consulta;

public interface ConsultaService {
	
	public Consulta insertaConsulta(Consulta obj);
	public List<Consulta> listaconsulta();

}
