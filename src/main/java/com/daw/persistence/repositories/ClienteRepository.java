package com.daw.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import com.daw.persistence.entities.Cliente;
import com.daw.services.dtos.TopDTO;

public interface ClienteRepository extends ListCrudRepository<Cliente, Integer> {
	
	List<Cliente> findByTelefonoContaining(String telefono);	
	@Query(value="SELECT cli.nombre, cli.telefono, cli.email, cli.direccion,SUM(p.total) from cliente cli Join pedido p on p.id_cliente=cli.id GROUP BY p.id_cliente ORDER BY SUM(p.total) DESC LIMIT 3;", 
	nativeQuery = true)
    List<Object[]> findTop3Clientes();

}
