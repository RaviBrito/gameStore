package com.gen.gamestore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.gen.gamestore.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List <Produto> findAllByNomeContainingIgnoreCase(@Param ("nome") String nome);

	public Object findAllByDescricaoContainingIgnoreCase(String descricao);
}
