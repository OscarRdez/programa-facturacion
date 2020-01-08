package com.misapps.programafacturacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.misapps.programafacturacion.entity.Factura;
import com.misapps.programafacturacion.service.FacturaService;

@Controller
@RequestMapping("/factura")
public class FacturaController {

	@Autowired
	private FacturaService facturaService;

	@GetMapping("/lista")
	public String getFacturas(Model theModel) {
		List<Factura> lasFacturas = facturaService.findAll();
		theModel.addAttribute("facturas", lasFacturas);
		return "facturas/lista-facturas";
	}
}
