package com.angelo.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.angelo.cursomc.domain.enums.StatusPagamento;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataVenciemtno;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
	}

	public PagamentoComBoleto(Integer id, StatusPagamento status, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, status, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVenciemtno = dataVencimento;
	}

	public Date getDataVenciemtno() {
		return dataVenciemtno;
	}

	public void setDataVenciemtno(Date dataVenciemtno) {
		this.dataVenciemtno = dataVenciemtno;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
	
}
