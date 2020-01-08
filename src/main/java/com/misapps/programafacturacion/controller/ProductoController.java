package com.misapps.programafacturacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.misapps.programafacturacion.entity.Producto;
import com.misapps.programafacturacion.service.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	@GetMapping("/lista")
	public String getProductos(Model theModel) {
		List<Producto> losProductos = productoService.findAll();
		theModel.addAttribute("productos", losProductos);
		return "productos/lista-productos";
	}
}
