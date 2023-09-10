package exceptions;

public class SobremesaException extends Exception {

	private static final long serialVersionUID = 1L;

	protected Float quantidade;

	public SobremesaException(Float quantidade) {
		super();
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Quantidade não pode ser negativo!";
	}
}
