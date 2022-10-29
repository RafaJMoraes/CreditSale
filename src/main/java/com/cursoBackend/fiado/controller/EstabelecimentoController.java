package com.cursoBackend.fiado.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursoBackend.fiado.domain.Estabelecimento;
import com.cursoBackend.fiado.dto.EstabelecimentoDto;
import com.cursoBackend.fiado.services.EstabelecimentoServices;

@RestController
public class EstabelecimentoController {
	
	

	@Autowired
	EstabelecimentoServices estabelecimentoServices;
	
	@GetMapping(path = "api/estabelecimento")
	public ResponseEntity<List<Estabelecimento>> getEstabelecimento() {
		return ResponseEntity.status(HttpStatus.OK).body(estabelecimentoServices.findAll());
	}
	
	@PostMapping(path = "api/estabelecimento")
	public ResponseEntity<Estabelecimento> createEstabelecimento(@RequestBody EstabelecimentoDto estabelecimentoDto) {
		return ResponseEntity.status(HttpStatus.OK).body(estabelecimentoServices.save(estabelecimentoDto));
	}

}
