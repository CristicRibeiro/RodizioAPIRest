package com.rodizio.crm.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestTemplate;

import com.rodizio.crm.model.Usuario;
import com.rodizio.crm.model.VeiculoFromAPI;
import com.rodizio.crm.model.Veiculos;
import com.rodizio.crm.repository.VeiculosRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping ("/veiculos")
public class VeiculosController {
	
	@Autowired
	private VeiculosRepository veiculosrepository;
	
	
	@GetMapping
	public List<Veiculos> listar() {
		return veiculosrepository.findAll();
	}
	
	
	@PostMapping
	//@RequestMapping(value = "/{ListarVeiculos}")
	@ResponseStatus(HttpStatus.CREATED)
	public Veiculos adicionar(@RequestBody Veiculos carros) {
		return veiculosrepository.save(carros);
		
	}
	
	
	
		
	
	
	
}
	
	/*public Veiculos adicionarVeiculos (@RequestBody Veiculos carros, @PathVariable String cpf){
        //RestTemplate restTemplate = new RestTemplate();
		RestTemplate client = new RestTemplate();
        String fooResourceUrl = "https://parallelum.com.br/fipe/api/v1/carros"
                + "/marcas/" + carros.getMarca()
                + "/modelos/" + carros.getModelo()
                + "/anos/" + carros.getAno();
        
        ResponseEntity<String> response = client.getForEntity(fooResourceUrl, String.class);
        
        
        
        if(response.getStatusCode().is2xxSuccessful()) {
            VeiculoFromAPI veiculoFromAPI = response.getBody();
            carros.setValorCarro(veiculoFromAPI.getValor());
            carros.setMarca(veiculoFromAPI.getMarca());
            carros.setModelo(veiculoFromAPI.getModelo());
        }

		return veiculosrepository.save(carros);
	}*/

