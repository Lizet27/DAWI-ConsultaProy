package com.cibertec.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
