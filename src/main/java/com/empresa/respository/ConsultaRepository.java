package com.empresa.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {

	
}
