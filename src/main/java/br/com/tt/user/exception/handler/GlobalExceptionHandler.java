package br.com.tt.user.exception.handler;


import br.com.tt.user.exception.ErrorCode;
import br.com.tt.user.exception.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = NoResourceFoundException.class)
    public ResponseEntity<ExceptionResponse> noResourceFoundException(NoResourceFoundException ex) {
        var response = new ExceptionResponse();
        response.setMessage(ex.getMessage());
        response.setCode(ErrorCode.INVALID_ENDPOINT.getCode());

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ExceptionResponse> genericException(Exception ex) {
        var response = new ExceptionResponse();
        response.setMessage(ex.getMessage());
        response.setCode(ErrorCode.UNMAPPED_ERROR.getCode());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
