package com.cursoBackend.fiado;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cursoBackend.fiado.domain.Cliente;
import com.cursoBackend.fiado.domain.Estabelecimento;
import com.cursoBackend.fiado.repository.ClienteRepository;

@SpringBootTest
class ClienteTests {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Test
	void contextLoads() {
	}
	
	public void testCreateEstab() throws Exception {
		
		Cliente x1 = new Cliente("Rafael", "123123123", "14982222222","Rua 10", 10);
		Cliente x2 = new Cliente("Rafael 02", "123123123", "14982222222","Rua 11", 10);

		
		assertEquals(Arrays.asList(x1, x2), clienteRepository.saveAll(Arrays.asList(x1, x2)));
	}

}
