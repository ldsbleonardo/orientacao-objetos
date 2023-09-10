package application;

import java.time.LocalDateTime;

import br.edu.infnet.model.Arquivo;
import br.edu.infnet.model.Bebida;
import br.edu.infnet.model.Pedido;

public class Main {

	private static String pedidoBebida;
	private static String path = null;

	public static void main(String[] args) {
		path = "src/main/resources/arquivo/PedidoEntrada.txt";
		String arquivo = Arquivo.Read(path);
		System.out.println("Arquivo de Entrada: " + arquivo);

		if (!arquivo.isEmpty()) {

			String texto = arquivo + "\n";

			LocalDateTime dataPedido = LocalDateTime.now();
			Pedido p = new Pedido("Pizza", dataPedido, false);

			texto += p.toString();

			try {
				pedidoBebida = getPedidoBebida();
				if (pedidoBebida.isEmpty()) {
					texto += pedidoBebida;
				}
			} catch (Exception e) {
				System.out.println("Erro ao preencher a bebida: " + e.getMessage());
			}

			arquivo = texto;
			Arquivo.Write(path, arquivo);

			System.out.println("Arquivo de saida: " + Arquivo.Read(path));
			limparArquivo(path, "");
			Arquivo.Write(path, "---PEDIDO DE ENTRADA----");

		} else {
			System.out.println("Erro: " + arquivo);
		}

	}

	private static String getPedidoBebida() {
		pedidoBebida = "";
		
		Bebida bebida = new Bebida(true, 200f, "Pepsi", "Refrigerante", 2.50f, 1);
		
		if (bebida.validaTamanhoBebida()) {
			return bebida.toString();
		}
		return pedidoBebida;
	}

	private static void limparArquivo(String caminho, String texto) {
		Arquivo.Write(caminho, texto);
	}
}
