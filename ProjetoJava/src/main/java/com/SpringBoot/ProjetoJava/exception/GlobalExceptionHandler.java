package com.SpringBoot.ProjetoJava.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler ( RegraNegocioException.class )
    public ResponseEntity < ProjetoJavaException > handleRegraNegocio ( RegraNegocioException ex ) {

    ProjetoJavaException erro = new ProjetoJavaException (
            HttpStatus.BAD_REQUEST.value ( ),
            "Requisição Inválida",
            ex.getMessage ( )
    );  return ResponseEntity.status ( HttpStatus.BAD_REQUEST ) .body ( erro ); }


    @ExceptionHandler ( MethodArgumentNotValidException.class )
    public ResponseEntity < ProjetoJavaException > handleValidacao ( MethodArgumentNotValidException ex ) {

        FieldError fieldError = ex.getBindingResult ( ).getFieldError ( );
        String mensagemExplicativa = ( fieldError != null ) ? fieldError.getDefaultMessage ( ) : "Erro de validação";

        if ( fieldError != null ) {
            mensagemExplicativa = fieldError.getField ( ) + ": " + fieldError.getDefaultMessage ( );
        }

        ProjetoJavaException erro = new ProjetoJavaException(
                HttpStatus.BAD_REQUEST.value ( ),
                "Erro de Validação nos Dados",
                mensagemExplicativa
        );

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
    }


    @Getter @Setter
    public static class ProjetoJavaException {

        private int status;
        private String error;
        private String message;
        private LocalDateTime timestamp;


        public ProjetoJavaException ( int status,
                                      String error,
                                      String message ) {
            this.status = status;
            this.error = error;
            this.message = message;
            this.timestamp = LocalDateTime.now ( ); }
    }
}
