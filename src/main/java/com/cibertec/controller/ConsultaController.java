package com.cibertec.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Consulta;
import com.cibertec.service.ConsultaService;
import com.cibertec.util.Constantes;

@RestController
@RequestMapping("/rest/consulta")
@CrossOrigin(origins = "http://localhost:4200")
public class ConsultaController {
	
	@Autowired
	private ConsultaService servicio;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Consulta>> lista(){
		List<Consulta> lista = servicio.listaconsulta();
		return ResponseEntity.ok(lista);
	
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Map<String, Object>> inserta(@RequestBody Consulta obj){
		Map<String, Object> salida= new HashMap<>();
		try {
			Consulta objSalida = servicio.insertaConsulta(obj);
			if (objSalida ==null) {
				salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
				
			} else {
				salida.put("mensaje", Constantes.MENSAJE_REG_EXITOSO);

			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
		}
		
		return ResponseEntity.ok(salida);
	}
}
