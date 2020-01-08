package com.misapps.programafacturacion.service;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.misapps.programafacturacion.entity.Cliente;

public interface ClienteService extends JpaRepositoryImplementation<Cliente, Integer> {

}
