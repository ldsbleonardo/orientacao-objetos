package br.edu.infnet.model;

import exceptions.ProdutoException;

public abstract class Produto {

	private String nome;

	private Float valor;

	private Integer codigo;
	
	public Produto(String nome, Float valor, Integer codigo) {
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;
	}
	

	public abstract String tipo();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public boolean validaValorProduto() {
		boolean valido = false;
		try {
			if (this.valor == null) {
				throw new ProdutoException(this.valor);
			}
			valido = true;
		} catch (ProdutoException e) {
			e.printStackTrace();
		}
		return valido;
	}

}
