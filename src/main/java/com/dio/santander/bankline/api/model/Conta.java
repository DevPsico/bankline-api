package com.dio.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable //Ta referenciada a outra CLASSE
public class Conta {
	
	@Column (name = "conta_numero") //Nome da coluna no BANCO DE DADOS
	private Long numero;
	
	@Column (name = "conta_saldo")//Nome da coluna no BANCO DE DADOSs
	private Double saldo;
	
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
}
