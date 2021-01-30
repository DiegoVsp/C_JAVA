package model.exceptions;

public class DomainException extends RuntimeException { //Não é obrigado a tratar runtimeException


	private static final long serialVersionUID = 1L; // declarar versão de uma classe serializable
	
	public DomainException(String msg) {
		super(msg);
	}
	
	
}
