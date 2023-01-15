package Snake.Exceptions;

public class UroborosException extends RuntimeException {
    public UroborosException(String message) {
        super("YOU DIED");
    }

    public UroborosException() {
        super();
    }

    public UroborosException(String message, Throwable cause) {
        super(message, cause);
    }

    public UroborosException(Throwable cause) {
        super(cause);
    }
}
