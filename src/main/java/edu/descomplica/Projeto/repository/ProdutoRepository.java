package edu.descomplica.Projeto.repository;

import edu.descomplica.Projeto.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
