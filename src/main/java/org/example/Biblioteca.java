package org.example;

import org.example.exceptions.LivroNaoEncontrado;
import org.example.exceptions.UsuarioJaCadastrado;
import org.example.exceptions.UsuarioNaoEncontrado;
import org.example.model.LivroModel;
import org.example.model.UsuarioModel;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<UsuarioModel> usuarios;
    private final List<LivroModel> livroModels;

    public Biblioteca(){
        this.usuarios = new ArrayList<>();
        this.livroModels = new ArrayList<>();
    }

    public void adicionaUsuario(UsuarioModel u) throws UsuarioJaCadastrado {
        for(UsuarioModel usuario : usuarios){
            if(usuario.getNome().equals(usuario.getNome())){
                throw new UsuarioJaCadastrado("Usuario já tem cadastro");
            }
        }
        this.usuarios.add(u);
    }

    public void listarUsuarios(){
        for(UsuarioModel u : usuarios){
            System.out.println(u);
        }
    }

    public boolean buscarUsuario(String nome) throws UsuarioNaoEncontrado{
        for(UsuarioModel u : usuarios){
            if(u.getNome().equals(nome)){
                return true;
            }
        }
        throw new UsuarioNaoEncontrado("Usuario não encontrado");
    }

    public void adicionarLivros(LivroModel l){
        this.livroModels.add(l);
    }

    public void listarLivros(){
        for(LivroModel l : livroModels){
            System.out.println(l);
        }
    }

    public boolean buscarLivro(String nome) throws LivroNaoEncontrado {
        for(LivroModel l : livroModels){
            if(l.getTitulo().equals(nome)){
                return true;
            }
        }
        throw new LivroNaoEncontrado("Livro não disponivel da biblioteca.");
    }
}
