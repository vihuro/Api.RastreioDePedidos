package RastreioDePedidos.Api.RastreioDePedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import RastreioDePedidos.Api.RastreioDePedidos.model.Pedidos;

public interface PedidosRepository extends JpaRepository <Pedidos, Integer>{

}
