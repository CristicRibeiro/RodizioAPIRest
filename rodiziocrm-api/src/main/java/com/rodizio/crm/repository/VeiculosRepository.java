package com.rodizio.crm.repository;

import java.util.List;
import com.rodizio.crm.model.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculosRepository extends JpaRepository<Veiculos, Long>{
	Veiculos save(List<Veiculos>carros);
}



