package org.generation.farmaCentro.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.generation.farmaCentro.model.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByNomeContainingIgnoreCase( String nome); 
}
