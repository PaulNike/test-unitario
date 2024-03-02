package com.codigo.msregistro.application.middleware;

import com.codigo.msregistro.domain.aggregates.response.ResponseError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestMiddleware {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseError> errorResponseEntity(Exception exception){
        return ResponseEntity.status(422).body(new ResponseError(2024,exception.getCause().toString()));
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ResponseError> errorResponseEntityNullPointer(NullPointerException exception){
        return ResponseEntity.status(400).body(new ResponseError(2000,"ERORRRRR LA ESTAS CAGANDOOOOO"));
    }
}
