package br.edu.infnet.model.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.edu.infnet.model.Arquivo;
import br.edu.infnet.model.Bebida;

public class BebidaTeste {
	private String pedidoBebidas = "";
	private String arquivoLido = "";
	private String path = "src/main/resources/arquivo/PedidoEntrada.txt";

	@Test
	public void gerarPedidoBebida() {

		System.out.println("Arquivo lido: " + arquivoLido);

		List<Bebida> listBebidas = new ArrayList<Bebida>();

		listBebidas.add(new Bebida(true, 200f, "Pepsi", "Refrigerante", 2.50f, 1));
		listBebidas.add(new Bebida(true, 300f, "Red Bul", "Energetico", 10.50f, 2));
		listBebidas.add(new Bebida(true, 300f, "Antartica", "Cerveja", 1.50f, 5));

		/*
		 * só adiciona na lista de pedidos se o tamanho da bebida for preenchido
		 */

		listBebidas.forEach(b -> {
			if (b.validaTamanhoBebida()) {
				pedidoBebidas += b.getNome() + "; ";
				System.out.println("Nome do pedido: " + pedidoBebidas);
			}
		});

		try {
			Arquivo.Write(path, pedidoBebidas);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (!leArquivo()) {
			System.out.println("Não é possivel realizar a leitura do arquivo!");
		}
		System.out.println("Arquivo alterado: " + arquivoLido);

	}

	private boolean leArquivo() {
		try {
			arquivoLido = Arquivo.Read(path);
		} catch (Exception e) {
			arquivoLido = null;
			System.out.println("Erro ao realizar a leitura do arquivo: " + e.getMessage());
			return false;
		}
		return true;
	}

}
