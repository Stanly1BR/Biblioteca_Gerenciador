package org.example;

import org.example.exceptions.LivroNaoEncontrado;
import org.example.exceptions.UsuarioJaCadastrado;
import org.example.exceptions.UsuarioNaoEncontrado;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Usuario> usuarios;
    private final List<Livro> livros;

    public Biblioteca(){
        this.usuarios = new ArrayList<>();
        this.livros = new ArrayList<>();
    }

    public void adicionaUsuario(Usuario u) throws UsuarioJaCadastrado {
        for(Usuario usuario : usuarios){
            if(usuario.getNome().equals(usuario.getNome())){
                throw new UsuarioJaCadastrado("Usuario já tem cadastro");
            }
        }
        this.usuarios.add(u);
    }

    public void listarUsuarios(){
        for(Usuario u : usuarios){
            System.out.println(u);
        }
    }

    public boolean buscarUsuario(String nome) throws UsuarioNaoEncontrado{
        for(Usuario u : usuarios){
            if(u.getNome().equals(nome)){
                return true;
            }
        }
        throw new UsuarioNaoEncontrado("Usuario não encontrado");
    }

    public void adicionarLivros(Livro l){
        this.livros.add(l);
    }

    public void listarLivros(){
        for(Livro l : livros){
            System.out.println(l);
        }
    }

    public boolean buscarLivro(String nome) throws LivroNaoEncontrado {
        for(Livro l : livros){
            if(l.getTitulo().equals(nome)){
                return true;
            }
        }
        throw new LivroNaoEncontrado("Livro não disponivel da biblioteca.");
    }
}
