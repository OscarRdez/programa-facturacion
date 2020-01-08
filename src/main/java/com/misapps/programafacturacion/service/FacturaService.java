package com.misapps.programafacturacion.service;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.misapps.programafacturacion.entity.Factura;

public interface FacturaService extends JpaRepositoryImplementation<Factura, Integer> {

}
