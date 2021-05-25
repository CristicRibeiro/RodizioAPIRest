package com.rodizio.crm.repository;
import java.util.List;

import com.rodizio.crm.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculosRepository extends JpaRepository<Veiculo, Long>{
	Veiculo save(List<Veiculo>carros);
}


