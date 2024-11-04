package edu.descomplica.Projeto.repository;

import edu.descomplica.Projeto.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
}
