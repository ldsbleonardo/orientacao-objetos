package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.edu.infnet.model.Arquivo;
import br.edu.infnet.model.Pedido;

public class Main {

	public static void main(String[] args) {

		String arquivo = Arquivo.Read("C://Projetos_INFNET/PedidoEntrada.txt");
		System.out.println("Arquivo de Entrada: " + arquivo);

		if (!arquivo.isEmpty()) {

			String texto = "\n";

			LocalDateTime dataPedido = LocalDateTime.now();
			Pedido p = new Pedido("Pizza", dataPedido, false);
			p.toString();

			texto += p;

			arquivo = texto;

			System.out.println("Arquivo de saida: " + arquivo);

		} else {
			System.out.println("Erro: " + arquivo);
		}

	}
}
