package com.daw.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daw.persistence.entities.PizzaPedido;
import com.daw.persistence.repositories.PizzaPedidoRepository;
import com.daw.services.dtos.PizzaPedidoOutputDTO;
import com.daw.services.mappers.PizzaPedidoMapper;

@Service
public class PizzaPedidoService {
	
	@Autowired
	private PizzaPedidoRepository pizzaPedidoRepository;	

	//CRUDs simples
	public List<PizzaPedido> findAll(){
		return this.pizzaPedidoRepository.findAll();
	}
	
	public boolean existsPizzaPedido(int idPizzaPedido){
		return this.pizzaPedidoRepository.existsById(idPizzaPedido);
	}
	
	public Optional<PizzaPedido> findById(int idPizzaPedido){
		return this.pizzaPedidoRepository.findById(idPizzaPedido);
	}
	
	//Actualizar el precio del pizzaPedido
	public PizzaPedido create(PizzaPedido pizzaPedido){		
		return this.pizzaPedidoRepository.save(pizzaPedido);
	}
	
	//Actualizar el precio del pizzaPedido
	public PizzaPedido save(PizzaPedido pizzaPedido){
		return this.pizzaPedidoRepository.save(pizzaPedido);
	}
	
	public boolean delete(int idPizzaPedido) {		
		boolean result = false;
		
		if(this.pizzaPedidoRepository.existsById(idPizzaPedido)) {
			this.pizzaPedidoRepository.deleteById(idPizzaPedido);
			result = true;
		}
		
		return result;
	}
	
	//CRUDs de PizzaPedidoDTO
	public List<PizzaPedidoOutputDTO> findByIdPedido(int idPedido){
		List<PizzaPedidoOutputDTO> dtos = new ArrayList<PizzaPedidoOutputDTO>();
		
		for(PizzaPedido pp : this.pizzaPedidoRepository.findByIdPedido(idPedido)) {
			dtos.add(PizzaPedidoMapper.toDTO(pp));
		}
		
		return dtos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
