package br.edu.infnet.model;

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
				+ getNome() + ", getValor()=" + getValor() + ", getCodigo()=" + getCodigo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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

}
