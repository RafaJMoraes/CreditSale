package com.cursoBackend.fiado;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cursoBackend.fiado.domain.Cliente;
import com.cursoBackend.fiado.domain.Estabelecimento;
import com.cursoBackend.fiado.repository.EstabelecimentoRepository;

@SpringBootTest
class EstabelecimentoTests {
	

	@Autowired
	private EstabelecimentoRepository esRepository;
	
	@Test
	void contextLoads() throws Exception {
		testCreateEstab();
		
	}
	
	public void testCreateEstab() throws Exception {
		Estabelecimento estabelecimento = new Estabelecimento("Bar Baridade", "123456798", "14981111111");
		Estabelecimento estabelecimento1 = new Estabelecimento("Bar Beirao", "98745632112", "14981111111");
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		
		
		assertEquals(Arrays.asList(estabelecimento, estabelecimento1), esRepository.saveAll(Arrays.asList(estabelecimento, estabelecimento1)));
	}


	

}
