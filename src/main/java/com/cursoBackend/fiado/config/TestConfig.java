package com.cursoBackend.fiado.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cursoBackend.fiado.domain.Estabelecimento;
import com.cursoBackend.fiado.repository.EstabelecimentoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private EstabelecimentoRepository esRepository;

	@Override
	public void run(String... args) throws Exception {
		Estabelecimento estabelecimento = new Estabelecimento("Bar Baridade", "123456798", "14981111111");
		Estabelecimento estabelecimento1 = new Estabelecimento("Bar Beirao", "98745632112", "14981111111");
		
		esRepository.saveAll(Arrays.asList(estabelecimento, estabelecimento1));
		
	}
}
