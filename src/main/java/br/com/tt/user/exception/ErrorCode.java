package br.com.tt.user.exception;

import java.util.Arrays;

public enum ErrorCode {

    INVALID_ID(1, "Invalid id"),
    INVALID_EXTERNAL_ID(2, "Invalid external id"),
    INVALID_USERNAME(3, "Invalid username"),
    INVALID_PASSWORD(4, "Invalid password"),
    INVALID_ENDPOINT(5, "Endpoint not found"),

    UNMAPPED_ERROR(-1, "Unhandled error");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public ErrorCode getByCode(int code) {
        return Arrays.stream(ErrorCode.values()).filter(error -> error.getCode() == code).findAny()
                .orElseThrow(ErrorCodeException::new);
    }
}
