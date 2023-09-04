package br.edu.infnet.model;

import java.time.LocalDateTime;

public class Pedido {
	
	public Pedido(String descricao, LocalDateTime data, boolean web) {
		this.descricao = descricao;
		this.data = data;
		this.web = web;
	}

	private String descricao;
	private LocalDateTime data;
	private boolean web;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}
	
	@Override
	public String toString() {
		return "Pedido [descricao=" + descricao + ", data=" + data + ", web=" + web + ", getDescricao()="
				+ getDescricao() + ", getData()=" + getData() + ", isWeb()=" + isWeb() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
