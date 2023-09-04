package br.edu.infnet.model.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.infnet.model.Comida;

public class ComidaTeste {
	
	public static void main(String[] args) {
		
		File fileEntrada = new File ("/orientacao-objetos/src/main/resources/arquivo/PedidoEntrada.txt");
		
		String fileSaida = "Teste.Saida.txt";
		
		List<Comida> list = new ArrayList<Comida>();
		list.add(new Comida(5f, true, "Bife Acebolado", "Prato 1", 2.50f,1));
		list.add(new Comida(2f, true, "Feijoada", "Prato 2", 10.50f,2));
		list.add(new Comida(10f, true, "Macarronada", "Prato 3", 1.50f,5));
		
		Scanner dadosEntrada = null;
		

	}

}
