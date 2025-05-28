package org.example.exceptions;

public class LivroNaoEncontrado extends RuntimeException {
    public LivroNaoEncontrado(String message) {
        super(message);
    }
}
