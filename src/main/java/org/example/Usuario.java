package org.example;

public class Usuario {
    private  String nome;
    private String telefone;

    Usuario(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
