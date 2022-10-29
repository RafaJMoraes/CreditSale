package com.cursoBackend.fiado.domain;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.cursoBackend.fiado.dto.EstabelecimentoDto;

@Entity
@Table(name = "establecimentos")
public class Estabelecimento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	private String nome;
	
	private String telefone;
	
	private String documento;
	

	public Estabelecimento() {
		
	}


	public Estabelecimento(String nome, String telefone, String documento) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.documento = documento;
	}


	public Estabelecimento(EstabelecimentoDto estabelecimentoDto) {
		this.nome = estabelecimentoDto.getNome();
		this.documento = estabelecimentoDto.getDocumento();
		this.telefone = estabelecimentoDto.getTelefone();
	}


	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
