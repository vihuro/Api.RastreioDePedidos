package RastreioDePedidos.Api.RastreioDePedidos.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tab_pedidos")
public class Pedidos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String numeroPedido;
	private String Status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}

	public LocalDateTime getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}
	public void setDataPrevistaEntrega(LocalDateTime dataPrevistaEntrega) {
		this.dataPrevistaEntrega = dataPrevistaEntrega;
	}
	public LocalDateTime getDataGeracao() {
		return dataGeracao;
	}
	public void setDataGeracao(LocalDateTime dataGeracao) {
		this.dataGeracao = dataGeracao;
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

	private LocalDateTime dataPrevistaEntrega;
	private LocalDateTime dataGeracao;
	private LocalDateTime dataIniProd;
	private LocalDateTime dataFinProd;
	private LocalDateTime dataSepara;
	private LocalDateTime dataTransito;
	private LocalDateTime dataEntrega;
}
