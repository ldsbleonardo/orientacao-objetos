package exceptions;

public class ProdutoException extends Exception {

	protected Float valor;

	public ProdutoException(Float valor) {
		super();
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Valor do produto não deve ser vazio!";
	}

}
