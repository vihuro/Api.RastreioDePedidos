package RastreioDePedidos.Api.RastreioDePedidos.dto;

import java.util.Date;

public class NovoPedido {
	private String numeroPedido;
	private Date DataGeracaoPedido;
	
	
	public String getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public Date getDataGeracaoPedido() {
		return DataGeracaoPedido;
	}
	public void setDataGeracaoPedido(Date dataGeracaoPedido) {
		DataGeracaoPedido = dataGeracaoPedido;
	}
	

}
