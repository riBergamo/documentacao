package edu.descomplica.Projeto.repository;

import edu.descomplica.Projeto.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
