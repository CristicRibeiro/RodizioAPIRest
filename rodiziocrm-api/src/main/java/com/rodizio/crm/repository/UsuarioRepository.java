package com.rodizio.crm.repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import com.rodizio.crm.model.Usuario;
import com.rodizio.crm.model.UsuarioId;


public interface UsuarioRepository extends JpaRepository<Usuario, UsuarioId>{
	
	Usuario save(List<Usuario> usuario);
}
