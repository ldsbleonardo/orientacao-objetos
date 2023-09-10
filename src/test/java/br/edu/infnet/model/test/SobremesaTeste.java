package br.edu.infnet.model.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.edu.infnet.model.Arquivo;
import br.edu.infnet.model.Sobremesa;

public class SobremesaTeste {

	private String path = "src/main/resources/arquivo/PedidoEntrada.txt";
	private String sobremesa = "";

	@Test
	public void testarSobremesa() {

		Arquivo.Read(path);
		System.out.println("Arquivo de entrada de sobremesa: " + Arquivo.Read(path));

		List<Sobremesa> list = new ArrayList<Sobremesa>();

		list.add(new Sobremesa(1f, true, "Chocolate", "Torta", 10f, 1));
		list.add(new Sobremesa(1f, true, "Morango", "Torta", 10f, 1));
		list.add(new Sobremesa(1f, true, "Abacaxi", "Torta", 10f, 1));

		list.forEach(b -> {
			sobremesa += b.getCodigo() + " - " + (b.getInformacao()) + " / ";
		});

		try {
			Arquivo.Write(path, sobremesa);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Arquivo alterado de sobremesa: " + Arquivo.Read(path));
		Arquivo.Write(path, "");
	}

}
