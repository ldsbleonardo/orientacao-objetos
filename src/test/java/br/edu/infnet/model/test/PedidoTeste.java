package br.edu.infnet.model.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.edu.infnet.model.Arquivo;
import br.edu.infnet.model.Pedido;

public class PedidoTeste {

	private String path = "src/main/resources/arquivo/PedidoEntrada.txt";
	private String pedidoComida = "";

	@Test
	public void testarPedido() {

		Arquivo.Read(path);
		System.out.println("Arquivo de entrada de pedido: " + Arquivo.Read(path));

		List<Pedido> list = new ArrayList<Pedido>();

		list.add(new Pedido("Retirada no balcao", LocalDateTime.now(), false));
		list.add(new Pedido("Delivery", LocalDateTime.now(), true));
		list.add(new Pedido("Retirada no balcao", LocalDateTime.now(), false));

		list.forEach(b -> {
			pedidoComida += b.getDescricao() + " - " + (b.getData()) + "; ";
		});

		try {
			Arquivo.Write(path, pedidoComida);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Arquivo alterado de pedido: " + Arquivo.Read(path));
		Arquivo.Write(path, "");
	}

}
