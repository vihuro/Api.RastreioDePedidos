package RastreioDePedidos.Api.RastreioDePedidos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import RastreioDePedidos.Api.RastreioDePedidos.dto.NovoPedido;
import RastreioDePedidos.Api.RastreioDePedidos.model.Pedidos;

public interface PedidosRepository extends JpaRepository <Pedidos, Integer>{
	
	Optional <Pedidos> findByNumeroPedido(String numeroPedido);

	Pedidos getByNumeroPedido(String numeroPedido);




}
