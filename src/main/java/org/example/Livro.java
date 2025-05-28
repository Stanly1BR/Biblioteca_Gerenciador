package org.example;

public class Livro {
    private final String titulo;
    private final String autor;
    private final String dataPublicacao;

    public Livro(String titulo, String autor, String dataPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", dataPublicacao=" + dataPublicacao +
                '}';
    }
}
