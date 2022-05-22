package RastreioDePedidos.Api.RastreioDePedidos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping ("/{id}") 
	private Optional<Pedidos> findAll(@PathVariable("id") Integer id){
		return repository.findById(id);
	}
	
	@GetMapping("/{numeroPedido}/")
	private Optional<Pedidos> findAll(@PathVariable("numeroPedido") String numeroPedido){
		return  repository.findByNumeroPedido(numeroPedido);
	}
	

	@PostMapping
	public void save(@RequestBody NovoPedido pedido) {
		service.save(pedido);
	}
	
	@PutMapping
	public void alterar(@RequestBody NovoPedido saveAlteracao) {
	
			service.saveAlteracao(saveAlteracao);
	}
	
	@DeleteMapping
	public void delete(@RequestBody NovoPedido deletePedido) {
		
		service.delete(deletePedido);
	}
}
