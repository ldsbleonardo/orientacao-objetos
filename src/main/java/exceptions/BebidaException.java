package exceptions;

import java.math.BigDecimal;

public class BebidaException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected BigDecimal peso;
	
	public BebidaException(BigDecimal peso) {
		super();
		this.peso=peso;
	}
	
	@Override
	public String toString() {
		return "Bebida não pode ser nulo!";
	}

}
