package uncheckedppexception;

public class InvalidPPException extends RuntimeException{
	public InvalidPPException() {
	
	}

	public InvalidPPException(final String message) {
		super(message);
	}
}
