package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Categoria;
import com.cibertec.entity.Producto;
import com.cibertec.service.CategoriaService;
import com.cibertec.service.ProductoService;

@RestController
@RequestMapping("/url/lista")
@CrossOrigin(origins =  "http://localhost:4200")
public class GeneralController {
	
	@Autowired
	private ProductoService producService;
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/listaProducto")
	@ResponseBody
	public List<Producto> listaProducto(){
		return producService.listaProducto();
	}
	
	@GetMapping("/listaCategoria")
	@ResponseBody
	public List<Categoria> listaCate(){
		return categoriaService.listaCategoria();
	}

}
