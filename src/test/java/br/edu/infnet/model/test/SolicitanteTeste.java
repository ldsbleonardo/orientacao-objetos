package br.edu.infnet.model.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.edu.infnet.model.Arquivo;
import br.edu.infnet.model.Solicitante;

public class SolicitanteTeste {

	private String path = "src/main/resources/arquivo/PedidoEntrada.txt";
	private String solicitante = "";

	@Test
	public void testarSobremesa() {

		Arquivo.Read(path);
		System.out.println("Solicitante: " + Arquivo.Read(path));

		List<Solicitante> list = new ArrayList<>();

		list.add(new Solicitante("Joao Carlos", "001-002-003-12", "jcarlos@gmail.com"));
		list.add(new Solicitante("Paulo Araujo", "111-012-103-02", "paraujoe@gmail.com"));
		list.add(new Solicitante("Julio Silva", "101-102-103-05", "julio@gmail.com"));

		list.forEach(b -> {
			solicitante += b.getNome() + " - " + (b.getCpf()) + " / ";
		});

		try {
			Arquivo.Write(path, solicitante);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Arquivo alterado de sobremesa: " + Arquivo.Read(path));
		Arquivo.Write(path, "");

	}

}
