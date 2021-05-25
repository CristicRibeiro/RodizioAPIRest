package com.rodizio.crm.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodizio.crm.model.Usuario;
import com.rodizio.crm.model.UsuarioId;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario save(List<Usuario> usuario);
}
