package com.dio.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.dio.santander.bankline.api.service.CorrentistaService;

//Classse responsavel para fazer o vinculo com o POSTGREE
@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

	@Autowired
	private CorrentistaRepository repository;
	
	@Autowired
	private CorrentistaService service;

	@GetMapping
	public List<Correntista> findAll() {
		return repository.findAll();

	}

	// serve para pegar o MAPPING 
	@PostMapping 
	public void salvarCorretista(@RequestBody NovoCorrentista correntista) {
		
		service.salvarNovoCorrentista(correntista);

	}

}
