package br.com.tt.user.exception;

public class ErrorCodeException extends RuntimeException {

    private static final String message = "Error code not found.";

    public ErrorCodeException() {
    }

    public String getMessage() {
        return message;
    }
}
