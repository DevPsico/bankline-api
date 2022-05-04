package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GeneratorType;

@Entity
@Table (name = "tab_movimentacao") //nome da tabela no BANCO DE DADOS
public class Movimentacao {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) //JPA vai incrementar o ID
	private Integer id;
	
	@Column (name = "data_hora") //nome da coluna no BANCO DE DADOS
	private LocalDateTime dataHora;
	
	//JPA vai criar o nome da coluna igual ao atributo
	private String descricao;
	
	//JPA vai criar o nome da coluna igual ao atributo
	private Double valor;
	
	@Enumerated (EnumType.STRING) //Serve para salvar o ENUM da classe MOVIMENTACAOTIPO
	private MovimentacaoTipo tipo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public MovimentacaoTipo getTipo() {
		return tipo;
	}

	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}
	
}
