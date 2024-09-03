package org.restaurante.msmensajeria.infrastructure.configuration.exception;

public class JwtException extends RuntimeException{
    public  JwtException(String msg) {
        super(msg);
    }
}

