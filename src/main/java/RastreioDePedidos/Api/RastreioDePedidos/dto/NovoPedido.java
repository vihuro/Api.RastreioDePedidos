package RastreioDePedidos.Api.RastreioDePedidos.dto;

import java.time.LocalDateTime;
import java.util.Date;

import RastreioDePedidos.Api.RastreioDePedidos.model.StatusPedido;

public class NovoPedido {
	private Integer id;
	private String numeroPedido;
	
	private Date DataGeracaoPedido;
	private StatusPedido Status;
	private Date dataPrevistaEntrega;
	private LocalDateTime dataIniProd;
	private LocalDateTime dataFinProd;
	private LocalDateTime dataSepara;
	private LocalDateTime dataTransito;
	private LocalDateTime dataEntrega;
	
	public Integer getId() {
		return id;
	}
	
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
	public StatusPedido getStatus() {
		return Status;
	}
	
	public void setStatus(StatusPedido status) {
		Status = status;
	}

	public Date getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}
	public void setDataPrevistaEntrega(Date dataPrevistaEntrega) {
		this.dataPrevistaEntrega = dataPrevistaEntrega;
	}
	public LocalDateTime getDataIniProd() {
		return dataIniProd;
	}
	public void setDataIniProd(LocalDateTime dataIniProd) {
		this.dataIniProd = dataIniProd;
	}
	public LocalDateTime getDataFinProd() {
		return dataFinProd;
	}
	public void setDataFinProd(LocalDateTime dataFinProd) {
		this.dataFinProd = dataFinProd;
	}
	public LocalDateTime getDataSepara() {
		return dataSepara;
	}
	public void setDataSepara(LocalDateTime dataSepara) {
		this.dataSepara = dataSepara;
	}
	public LocalDateTime getDataTransito() {
		return dataTransito;
	}
	public void setDataTransito(LocalDateTime dataTransito) {
		this.dataTransito = dataTransito;
	}
	public LocalDateTime getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(LocalDateTime dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	
	

}
