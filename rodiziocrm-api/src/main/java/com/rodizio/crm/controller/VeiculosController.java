package com.rodizio.crm.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rodizio.crm.model.Veiculos;
import com.rodizio.crm.repository.VeiculosRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping ("/veiculos")
public class VeiculosController {
	
	@Autowired
	private VeiculosRepository veiculosrepository ;
	
	
	@GetMapping
	public List<Veiculos> listar() {
		return veiculosrepository.findAll();
	}
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Veiculos adicionarVeiculos (@RequestBody Veiculos carros){
		return veiculosrepository.save(carros);
	}
}
