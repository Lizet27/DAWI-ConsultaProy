package com.empresa.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="consulta")
@Getter
@Setter
public class Consultar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idconsulta;
	private String nombre;
	private String correo;
	private String comentario;
	private int telefono;

}
