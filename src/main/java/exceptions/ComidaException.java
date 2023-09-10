package exceptions;

public class ComidaException extends Exception {

	private static final long serialVersionUID = 1L;

	protected Float peso;

	public ComidaException(Float peso) {
		super();
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Peso não pode ser negativo ou nulo";
	}

}
