package br.com.teste.webapi.teste_webapi.exceptions;

public class BaseException extends Exception {

	private Boolean hasError = true;
	private String message;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BaseException() {
		super();
	}
	
	public BaseException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getHasError() {
		return hasError;
	}

	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}

}
