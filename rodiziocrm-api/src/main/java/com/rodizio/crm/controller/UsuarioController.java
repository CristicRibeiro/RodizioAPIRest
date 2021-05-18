package com.rodizio.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodizio.crm.model.Usuario;
import com.rodizio.crm.repository.UsuarioRepository;


@RestController
@RequestMapping ("/usuarios")
public class UsuarioController {
	
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@GetMapping
	public List<Usuario> listar() {
		return usuarioRepository.findAll();
	}
	/*
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody Cliente cliente) {

			return clienteRepository.save(cliente);
			
	}
	
	@PostMapping
	@RequestMapping(value = "/varios")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Cliente> adicionarVarios(@RequestBody List<Cliente> clientes) {
		
		for (Cliente cliente : clientes) {
			//System.out.println(cliente.getNome());
			clienteRepository.save(cliente);
			}
		
		return clientes;
	}
	*/

}
