package com.empresa.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Consultar;

public interface ConsultaRepository extends JpaRepository<Consultar, Integer> {

	
}
