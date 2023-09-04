package br.edu.infnet.model.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.infnet.model.Bebida;


public class BebidaTeste {
	
	public static void main(String[] args) {
		
		File fileEntrada = new File ("/orientacao-objetos/src/main/resources/arquivo/PedidoEntrada.txt");
		
		String fileSaida = "Teste.Saida.txt";
		
		List<Bebida> listBebidas = new ArrayList<Bebida>();
		listBebidas.add(new Bebida(true, 200f, "Pepsi", "Refrigerante", 2.50f,1));
		listBebidas.add(new Bebida(true, 300f, "Red Bul", "Energetico", 10.50f,2));
		listBebidas.add(new Bebida(true, 300f, "Antartica", "Cerveja", 1.50f,5));
		
		Scanner dadosEntrada = null;
		

	}

}
