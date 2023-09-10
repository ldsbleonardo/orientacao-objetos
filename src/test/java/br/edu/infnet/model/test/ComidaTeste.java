package br.edu.infnet.model.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.edu.infnet.model.Arquivo;
import br.edu.infnet.model.Comida;

public class ComidaTeste {

	private String path = "src/main/resources/arquivo/PedidoEntrada.txt";
	private String pedidoComida = "";

	@Test
	public void gerarPedidoComida() {

		Arquivo.Read(path);
		System.out.println("Arquivo de entrada: " + Arquivo.Read(path));

		List<Comida> list = new ArrayList<Comida>();
		list.add(new Comida(5f, true, "Bife Acebolado", "Prato 1", 2.50f, 1));
		list.add(new Comida(2f, true, "Feijoada", "Prato 2", 10.50f, 2));
		list.add(new Comida(10f, true, "Macarronada", "Prato 3", 1.50f, 5));

		/*
		 * só adiciona na lista de pedidos se o tamanho da comida for preenchido
		 */
		
		list.forEach(b -> {
			if (b.validaPesoComida()) {
				pedidoComida += b.getNome()+" - " + b.getIngredientes() + "; ";
			}
		});

		try {
			Arquivo.Write(path, pedidoComida);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Arquivo alterado: " + Arquivo.Read(path));
		Arquivo.Write(path, "");
	}

}
