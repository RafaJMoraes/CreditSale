package com.cursoBackend.fiado.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoBackend.fiado.domain.CompraFiada;
import com.cursoBackend.fiado.dto.CompraFiadaDto;
import com.cursoBackend.fiado.repository.ClienteRepository;
import com.cursoBackend.fiado.repository.ComprasRepository;
import com.cursoBackend.fiado.repository.EstabelecimentoRepository;


@Service
public class ComprasFiadasServices {

	@Autowired
	private ComprasRepository comprasRepository;
		
	public CompraFiada save(CompraFiadaDto compraDto) {
		
		
		
		return null;
	}


	public List<CompraFiada> findAll() {
		return comprasRepository.findAll();
	}
	

}
