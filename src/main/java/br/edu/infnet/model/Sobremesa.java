package br.edu.infnet.model;

import exceptions.SobremesaException;

public class Sobremesa extends Produto {

	private Float quantidade;
	private boolean doce;
	private String informacao;

	public Sobremesa(Float quantidade, boolean doce, String informacao, String nome, Float valor, Integer codigo) {
		super(nome, valor, codigo);
		this.quantidade = quantidade;
		this.doce = doce;
		this.informacao = informacao;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Float quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isDoce() {
		return doce;
	}

	public void setDoce(boolean doce) {
		this.doce = doce;
	}

	public String getInformacao() {
		return informacao;
	}

	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}

	@Override
	public String toString() {
		return "Sobremesa [quantidade=" + quantidade + ", doce=" + doce + ", informacao=" + informacao
				+ ", getQuantidade()=" + getQuantidade() + ", isDoce()=" + isDoce() + ", getInformacao()="
				+ getInformacao() + ", getNome()=" + getNome() + ", getValor()=" + getValor() + ", getCodigo()="
				+ getCodigo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public String tipo() {
		return doce ? "Tipo de Sobremesa - Doce" : "Tipo de Sombremesa -Salgada";
	}

	public boolean validaQuantidade() {
		boolean valido = false;
		try {
			if (this.quantidade == null) {
				throw new SobremesaException(this.quantidade);
			}
			valido = true;
		} catch (SobremesaException e) {
			e.printStackTrace();
		}

		return valido;
	}

}