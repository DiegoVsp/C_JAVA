package model.exceptions;

public class DomainException extends RuntimeException { //N�o � obrigado a tratar runtimeException


	private static final long serialVersionUID = 1L; // declarar vers�o de uma classe serializable
	
	public DomainException(String msg) {
		super(msg);
	}
	
	
}
