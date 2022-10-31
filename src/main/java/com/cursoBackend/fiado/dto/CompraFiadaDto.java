package com.cursoBackend.fiado.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class CompraFiadaDto {
	
	
	private UUID clienteId;
	private UUID estabelecimentoId;
	private String nome;
	private String observacao;
	private int valor;
	private LocalDateTime data;
	
	public CompraFiadaDto() {
		super();
	}

	public UUID getClienteId() {
		return clienteId;
	}

	public void setClienteId(UUID clienteId) {
		this.clienteId = clienteId;
	}

	public UUID getEstabelecimentoId() {
		return estabelecimentoId;
	}

	public void setEstabelecimentoId(UUID estabelecimentoId) {
		this.estabelecimentoId = estabelecimentoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

}
