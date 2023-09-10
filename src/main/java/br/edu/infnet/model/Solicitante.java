package br.edu.infnet.model;

import exceptions.SolicitanteException;

public class Solicitante {

	private String nome;
	private String cpf;
	private String email;

	public Solicitante(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean validaNome() {
		boolean valido = false;
		try {
			if (this.nome == null) {
				throw new SolicitanteException(this.nome);
			}
			valido = true;
		} catch (SolicitanteException e) {
			e.printStackTrace();
		}

		return valido;
	}

}
