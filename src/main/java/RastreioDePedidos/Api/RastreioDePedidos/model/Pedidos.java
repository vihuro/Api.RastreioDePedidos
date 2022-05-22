package RastreioDePedidos.Api.RastreioDePedidos.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name= "tab_pedidos")
public class Pedidos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;


	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column
	private String numeroPedido;
	
	@Enumerated(EnumType.STRING)
	private StatusPedido Status;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date dataPrevistaEntrega;
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime dataGeracao;
	private LocalDateTime dataIniProd;
	private LocalDateTime dataFinProd;
	private LocalDateTime dataSepara;
	private LocalDateTime dataTransito;
	private LocalDateTime dataEntrega;
	
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

}
