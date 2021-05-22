package com.rodizio.crm.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
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
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario adicionar(@RequestBody Usuario usuario) {		
		return usuarioRepository.save(usuario);
	}
}








/*
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public Cliente adicionar(@RequestBody Cliente cliente) {

		return clienteRepository.save(cliente);
		
}*/
