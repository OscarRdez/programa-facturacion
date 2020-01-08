package com.misapps.programafacturacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.misapps.programafacturacion.entity.Cliente;
import com.misapps.programafacturacion.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/lista")
	public String getClientes(Model theModel) {
		List<Cliente> losClientes = clienteService.findAll();
		theModel.addAttribute("clientes", losClientes);
		return "clientes/lista-clientes";
	}

	@GetMapping("/mostrarFormParaAnadir")
	public String mostrarFormParaAnadir(Model theModel) {
		Cliente nuevoCliente = new Cliente();
		theModel.addAttribute(nuevoCliente);
		return "clientes/formularioAnadir";
	}

	@PostMapping("/guardar")
	public String guardar(@ModelAttribute("cliente") Cliente elCliente) {
		clienteService.save(elCliente);
		return "redirect:/cliente/lista";
	}

	@GetMapping("/mostrarFormParaActualizar")
	public String mostrarFormParaActualizar(Model theModel, @RequestParam("clienteId") int elId) {
		Cliente nuevoCliente = clienteService.getOne(elId);
		theModel.addAttribute(nuevoCliente);
		return "clientes/formularioAnadir";
	}

}
