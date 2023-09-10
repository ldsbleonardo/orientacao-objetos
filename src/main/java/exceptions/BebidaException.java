package exceptions;

public class BebidaException extends Exception{
	
	private static final long serialVersionUID = 1L;
	protected float tamanho;
	
	public BebidaException(float tamanho) {
		super();
		this.tamanho=tamanho;
	}
	
	@Override
	public String toString() {
		return "Tamanho da bebida deve ser preenchido!";
	}

}
