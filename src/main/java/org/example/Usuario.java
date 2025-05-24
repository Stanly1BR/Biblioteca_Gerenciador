package org.example;

public class Usuario {
    private  String nome;
    private String telefone;

    Usuario(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public  String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
