package com.rodizio.crm.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.rodizio.crm.model.Usuario;
import com.rodizio.crm.model.Veiculo;
import com.rodizio.crm.repository.UsuarioRepository;
import com.rodizio.crm.repository.VeiculosRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private VeiculosRepository veiculoRepository;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario adicionar(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@GetMapping
	@RequestMapping(value = "/cadastrados")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Usuario> listarUsuarios() {
		return usuarioRepository.findAll();
	}

	@PostMapping
	@RequestMapping(value = "/veiculos/{idUsuario}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario adicionarVeiculos(@RequestBody Veiculo veiculo, @PathVariable long idUsuario) {

		Usuario u = new Usuario();
		Optional<Usuario> result = usuarioRepository.findById(idUsuario);

		if (result.isPresent()) {
			u = result.get();
		}

		veiculo.setUsuario(u);
		veiculoRepository.save(veiculo);

		return u;
	}

	@GetMapping
	@RequestMapping(value = "/veiculos/porusuario/{idUsuario}")
	public List<Veiculo> veiculosPorUsuario(@PathVariable long idUsuario) {

		Optional<Usuario> optional = usuarioRepository.findById(idUsuario);

		Usuario usuario = new Usuario();
		if (optional.isPresent()) {
			usuario = optional.get();
		}

		for (Veiculo veiculo : usuario.getVeiculos()) {
			podeTrafegar(veiculo.getId());
		}

		return usuario.getVeiculos();
	}

	public void podeTrafegar(Long idVeiculo) {

		Optional<Veiculo> optional = veiculoRepository.findById(idVeiculo);

		Veiculo veiculo = new Veiculo();
		if (optional.isPresent()) {
			veiculo = optional.get();
		}

		Date data = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		int dia = cal.get(Calendar.DAY_OF_WEEK);

		String placa = veiculo.getAno().substring(3, 4);
		veiculo.setDiaRodizio(diaDeRodizio(dia, Integer.parseInt(placa)));

		if (veiculo != null)
			veiculoRepository.save(veiculo);

	}

	// Se for dia de rodizio para a placa, deve retornar True
	public boolean diaDeRodizio(int diaSemana, int anoFinal) {

		if (diaSemana == 2 && (anoFinal == 0 || anoFinal == 1)) {
			return true;
		}
		if (diaSemana == 3 && (anoFinal == 2 || anoFinal == 3)) {
			return true;
		}
		if (diaSemana == 4 && (anoFinal == 4 || anoFinal == 5)) {
			return true;
		}
		if (diaSemana == 5 && (anoFinal == 6 || anoFinal == 7)) {
			return true;
		}
		if (diaSemana == 6 && (anoFinal == 8 || anoFinal == 9)) {
			return true;
		}

		return false;
	}
}