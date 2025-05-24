package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Usuario> usuarios;

    public Biblioteca(){
        this.usuarios = new ArrayList<>();
    }

    public void adicionaUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    public void listarUsuarios(){
        for(Usuario u : usuarios){
            System.out.println(u);
        }
    }
}
