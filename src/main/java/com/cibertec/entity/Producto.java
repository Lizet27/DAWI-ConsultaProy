package com.cibertec.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "producto")
@Getter
@Setter
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproducto;
	private String nombre;
	@ManyToOne
	@JoinColumn(name = "idcategoria")
	private Categoria categoria;	  
	private double precio;		
	private String autor;	
	@Lob
	private byte[] foto1;
	private String descripcion;
	

	

	
	
	

}
