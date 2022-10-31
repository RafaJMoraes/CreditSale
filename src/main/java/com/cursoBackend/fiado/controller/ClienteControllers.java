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
import com.cursoBackend.fiado.dto.ClienteDto;
import com.cursoBackend.fiado.services.ClienteServices;

@RestController
@RequestMapping("api/clientes")
public class ClienteControllers {
	


	@Autowired
	ClienteServices clientesServices;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> getEstabelecimento() {
		return ResponseEntity.status(HttpStatus.OK).body(clientesServices.findAll());
	}
	
	@PostMapping(path = "/create")
	public ResponseEntity<Cliente> createEstabelecimento(@RequestBody ClienteDto estabelecimentoDto) {
		return ResponseEntity.status(HttpStatus.OK).body(clientesServices.save(estabelecimentoDto));
	}

}
