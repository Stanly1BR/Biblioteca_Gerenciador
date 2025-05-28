package org.example.exceptions;

public class UsuarioJaCadastrado extends RuntimeException {
    public UsuarioJaCadastrado(String message) {
        super(message);
    }
}
