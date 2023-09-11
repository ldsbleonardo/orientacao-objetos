package services;

public class TaxaDeliveryService implements TaxaService {

	private int numeroPedido;
	private String endereçoEntrega;
	private boolean pedidoAplicativo;
	protected double valorPedido;

	@Override
	public double taxa(double valor) {
		if (pedidoAplicativo) {
			return valor * 0.5;
		}
		return valor * 0.8;
	}

	public TaxaDeliveryService(int numeroPedido, String endereçoEntrega, boolean pedidoAplicativo, double valorPedido) {
		super();
		this.numeroPedido = numeroPedido;
		this.endereçoEntrega = endereçoEntrega;
		this.pedidoAplicativo = pedidoAplicativo;
		this.valorPedido = valorPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido+ 1;
	}

}
