package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Consulta;

public interface ConsultaService {
	
	public Consulta insertaConsulta(Consulta obj);
	public List<Consulta> listaconsulta();

}
