package com.rodizio.crm.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.rodizio.crm.model.Veiculo;
import com.rodizio.crm.repository.VeiculosRepository;
import org.springframework.http.HttpStatus;



@RestController
@RequestMapping ("/veiculos")
public class VeiculosController {
	
	@Autowired
	private VeiculosRepository veiculosrepository;
	
	
	@GetMapping
	public List<Veiculo> listar() {
		return veiculosrepository.findAll();
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	public Veiculo adicionar(@RequestBody Veiculo veiculo) {
		return veiculosrepository.save(veiculo);
		
	}
}