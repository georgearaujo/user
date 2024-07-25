package br.com.tt.user.exception;

public class InvalidParameterException extends RuntimeException {

    public InvalidParameterException(ErrorCode code) {
        super(code.getMessage());
    }
}
