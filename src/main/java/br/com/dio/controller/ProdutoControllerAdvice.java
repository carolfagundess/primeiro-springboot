package br.com.dio.controller;

import br.com.dio.exception.ProductNullException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author carol Controller de erro da classe produto
 */
@ControllerAdvice
public class ProdutoControllerAdvice extends ResponseEntityExceptionHandler {

    //é chamado quando acontece a execeção produto nulo
    @ExceptionHandler(ProductNullException.class)
    public ResponseEntity<Object> captureErroNull() {
        
            Map<String, Object> body = new HashMap<>();
            
            body.put("message", "Verifique os campos do produto");
        
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);

    }

}
