package com.cursoBackend.fiado.domain;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cleintes")
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private UUID id;
	
	private String nome;
	
	private String documento;
	
	private String telefone;
	
	private String rua;
	
	private int numero;

	public Cliente() {

	}

	public Cliente(UUID id, String nome, String documento, String telefone, String rua, int numero) {
		super();
		this.id = id;
		this.nome = nome;
		this.documento = documento;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}
	

}
