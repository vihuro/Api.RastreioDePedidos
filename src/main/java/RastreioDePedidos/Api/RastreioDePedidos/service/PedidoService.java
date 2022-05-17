package RastreioDePedidos.Api.RastreioDePedidos.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RastreioDePedidos.Api.RastreioDePedidos.dto.NovoPedido;
import RastreioDePedidos.Api.RastreioDePedidos.model.Pedidos;
import RastreioDePedidos.Api.RastreioDePedidos.repository.PedidosRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidosRepository repository;
	
	public void save(NovoPedido novoPedido) {
		Pedidos pedidos = new Pedidos();
		pedidos.setNumeroPedido(novoPedido.getNumeroPedido());
		pedidos.setDataGeracao(LocalDateTime.now());
		
		repository.save(pedidos);
	}

}
