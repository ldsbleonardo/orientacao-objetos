package exceptions;

public class SolicitanteException extends Exception {

	private static final long serialVersionUID = 1L;

	protected String nome;

	public SolicitanteException(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "O nome do solicitante não pode ser vazio ou nulo!";
	}

}
