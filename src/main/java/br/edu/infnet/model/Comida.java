package br.edu.infnet.model;

import exceptions.ComidaException;

public class Comida extends Produto {

	private Float peso;
	private boolean vegano;
	private String ingredientes;

	public Comida(Float peso, boolean vegano, String ingredientes, String nome, Float valor, Integer codigo) {
		super(nome, valor, codigo);
		this.peso = peso;
		this.vegano = vegano;
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Comida [peso=" + peso + ", vegano=" + vegano + ", ingredientes=" + ingredientes + ", getPeso()="
				+ getPeso() + ", isVegano()=" + isVegano() + ", getIngredientes()=" + getIngredientes() + ", getNome()="
				+ getNome() + ", getValor()=" + getValor() + ", getCodigo()=" + getCodigo() + "]";
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isVegano() {
		return vegano;
	}

	public void setVegano(boolean vegano) {
		this.vegano = vegano;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String tipo() {
		return vegano ? "Comida Vegana" : "Tradicional";
	}

	public boolean validaPesoComida() {
		boolean valido = true;
		try {
			if (this.peso == null) {
				throw new ComidaException(this.peso);
			}
		} catch (ComidaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			valido = false;
		}
		return valido;

	}

}
