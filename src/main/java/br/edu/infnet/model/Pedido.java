package br.edu.infnet.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import exceptions.PedidoException;

public class Pedido {

	private String descricao;
	private LocalDateTime data;
	private boolean web;

	private String pedidoWeb[];

	private List<Pedido> list = new ArrayList<Pedido>();

	public Pedido(String descricao, LocalDateTime data, boolean web) {
		this.descricao = descricao;
		this.data = data;
		this.web = web;
	}

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
				+ getDescricao() + ", getData()=" + getData() + ", isWeb()=" + isWeb() + "]";
	}

	public boolean validaDescricaoPedido() {
		boolean valido = false;
		try {
			if (this.descricao == null) {
				throw new PedidoException(this.descricao);
			}
			valido = true;
		} catch (PedidoException e) {
			e.printStackTrace();
		}
		return valido;

	}

	public String[] getPedidoWeb() {
		return pedidoWeb;
	}

	public void setPedidoWeb(String pedidoWeb[]) {
		this.pedidoWeb = pedidoWeb;
	}

	public int totalPedidosWeb() {
		return pedidoWeb == null ? 0 : (int) list.stream().count();
	}

}
