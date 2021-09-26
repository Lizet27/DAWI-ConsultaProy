package com.empresa.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Consultar;
import com.empresa.service.ConsultaService;

@RestController
@RequestMapping("/rest/consulta")
public class ConsultaController {
	
	@Autowired
	private ConsultaService servicio;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Consultar>> lista(){
		List<Consultar> lista = servicio.listaconsulta();
		return ResponseEntity.ok(lista);
	
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Consultar> inserta(@RequestBody Consultar obj){
		Consultar objsalida = servicio.insertaConsulta(obj);
		return ResponseEntity.ok(objsalida);
	}
}
