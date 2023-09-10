package exceptions;

public class PedidoException extends Exception {

	private static final long serialVersionUID = 1L;

	protected String descricao;

	public PedidoException(String descricao) {
		super();
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Pedido não pode ser vazio!";
	}

	

}
