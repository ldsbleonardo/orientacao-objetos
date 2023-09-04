package br.edu.infnet.model;

public class Bebida extends Produto {

	private boolean gelada;
	private Float tamanho;
	private String marca;

	public Bebida(boolean gelada, Float tamanho, String marca, String nome, Float valor, Integer codigo) {
		super(nome, valor, codigo);
		this.gelada = gelada;
		this.tamanho = tamanho;
		this.marca = marca;
	}

	public boolean isGelada() {
		return gelada;
	}

	public void setGelada(boolean gelada) {
		this.gelada = gelada;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Bebida [gelada=" + gelada + ", tamanho=" + tamanho + ", marca=" + marca + ", isGelada()=" + isGelada()
				+ ", getTamanho()=" + getTamanho() + ", getMarca()=" + getMarca() + ", getNome()=" + getNome()
				+ ", getValor()=" + getValor() + ", getCodigo()=" + getCodigo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public String tipo() {
		return gelada ? "Bebida do Tipo Gelada" : "Bebida Quente (Destilada)";
	}

}
