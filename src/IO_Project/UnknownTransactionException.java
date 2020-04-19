package IO_Project;

public class UnknownTransactionException extends Exception {
    public UnknownTransactionException() {

    }

    public UnknownTransactionException(String message) {
        super(message);
    }
}
