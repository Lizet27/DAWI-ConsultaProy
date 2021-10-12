package com.cibertec.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
