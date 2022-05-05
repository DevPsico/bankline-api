package com.dio.santander.bankline.api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Conta;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;

//Camada service responsavel pela regra de negocio

@Service
public class CorrentistaService {
	
	@Autowired
	private CorrentistaRepository repository;
	
	//Novo correntista do pacote DTO
	public void salvarNovoCorrentista(NovoCorrentista novoCorrentista) {
		
		Correntista correntista = new Correntista();
		
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		
		
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		
		correntista.setConta(conta);
		
		repository.save(correntista);
		
	}

}
