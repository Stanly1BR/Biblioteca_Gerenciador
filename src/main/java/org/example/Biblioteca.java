package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Usuario> usuarios;
    private List<Livro> livros;

    public Biblioteca(){
        this.usuarios = new ArrayList<>();
        this.livros = new ArrayList<>();
    }

    public void adicionaUsuario(Usuario u){
        this.usuarios.add(u);
    }

    public void listarUsuarios(){
        for(Usuario u : usuarios){
            System.out.println(u);
        }
    }

    public void adicionarLivros(Livro l){
        this.livros.add(l);
    }

    public void listarLivros(){
        for(Livro l : livros){
            System.out.println(l);
        }
    }
}
