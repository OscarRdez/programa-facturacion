package com.misapps.programafacturacion.service;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.misapps.programafacturacion.entity.Producto;

public interface ProductoService extends JpaRepositoryImplementation<Producto, Integer> {

}
