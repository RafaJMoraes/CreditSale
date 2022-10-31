package com.cursoBackend.fiado.services;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cursoBackend.fiado.domain.Cliente;
import com.cursoBackend.fiado.dto.ClienteDto;
import com.cursoBackend.fiado.repository.ClienteRepository;


@Service
public class ClienteServices {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public Cliente save(ClienteDto clienteDto) {
		Cliente c = new Cliente();
		BeanUtils.copyProperties(clienteDto, c);
		return clienteRepository.save(c);
	}


	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}


	public Optional<Cliente> findById(UUID clienteId) {
		return clienteRepository.findById(clienteId);
	}
}
