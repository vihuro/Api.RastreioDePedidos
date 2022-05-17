package RastreioDePedidos.Api.RastreioDePedidos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RastreioDePedidos.Api.RastreioDePedidos.dto.NovoPedido;
import RastreioDePedidos.Api.RastreioDePedidos.model.Pedidos;
import RastreioDePedidos.Api.RastreioDePedidos.repository.PedidosRepository;
import RastreioDePedidos.Api.RastreioDePedidos.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {
	
	@Autowired
	private PedidosRepository repository;
	
	@Autowired
	private PedidoService service;
	
	@GetMapping
	private List<Pedidos> findAll(){
		return repository.findAll();
		
	}
	
	@PostMapping
	public void save(@RequestBody NovoPedido pedido) {
		service.save(pedido);
	}
}
