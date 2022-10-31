package com.cursoBackend.fiado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoBackend.fiado.domain.Cliente;
import com.cursoBackend.fiado.domain.CompraFiada;
import com.cursoBackend.fiado.dto.CompraFiadaDto;
import com.cursoBackend.fiado.repository.ClienteRepository;
import com.cursoBackend.fiado.repository.EstabelecimentoRepository;
import com.cursoBackend.fiado.services.ClienteServices;
import com.cursoBackend.fiado.services.ComprasFiadasServices;
import com.cursoBackend.fiado.services.EstabelecimentoServices;

@RestController
@RequestMapping("api/compras")
public class ComprasFiadasController {

	@Autowired
	private ComprasFiadasServices comprasServices;

	@Autowired
	private ClienteServices clienteServices;

	@Autowired
	private EstabelecimentoServices estabelecimentoServices;

	@GetMapping
	public ResponseEntity<List<CompraFiada>> getEstabelecimento() {
		return ResponseEntity.status(HttpStatus.OK).body(comprasServices.findAll());
	}

	@PostMapping(path = "/create")
	public ResponseEntity<CompraFiada> createEstabelecimento(@RequestBody CompraFiadaDto compra) {

		if (clienteServices.findById(compra.getClienteId()).isPresent()) {

		}
		if (estabelecimentoServices.findById(compra.getEstabelecimentoId())) {

		}

		return ResponseEntity.status(HttpStatus.OK).body(comprasServices.save(compra));
	}

}
