package org.example;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcao, opcaoCategoria;
        do{
            menuPrincipal();
            opcao = sc.nextInt(); sc.nextLine();

            if(opcao == 1){
                menuUsuario();
                opcaoCategoria = sc.nextInt(); sc.nextLine();

                if(opcaoCategoria == 1){

                    System.out.println("Qual o nome do usuario?");
                    String nome = sc.nextLine();

                    System.out.println("Qual o telefone do usuario?");
                    String telefone = sc.nextLine();

                    Usuario usuarioNovo = new Usuario(nome, telefone);
                    biblioteca.adicionaUsuario(usuarioNovo);
                } else if (opcaoCategoria == 2) {
                    biblioteca.listarUsuarios();
                }
            }else if(opcao == 2){
                menuLivro();
                opcaoCategoria = sc.nextInt(); sc.nextLine();

                if(opcaoCategoria == 1){
                    System.out.println("Qual o nome do livro?");
                    String nome = sc.nextLine();

                    System.out.println("Qual o autor do livro?");
                    String autor = sc.nextLine();

                    System.out.println("Qual o data de públicação do livro?");
                    String dataPublicacao = sc.next();

                    Livro livronovo = new Livro(nome, autor, dataPublicacao);


                } else if(opcaoCategoria == 2){

                } else if (opcaoCategoria == 3) {

                } else if (opcaoCategoria == 4) {

                } else if (opcaoCategoria == 5) {

                }
            }

        }while(opcao !=0);
        sc.close();
    }
    private static void menuPrincipal(){
        System.out.println("------Menu Principal-----");
        System.out.println("-------------------------");
        System.out.println(" 1 - Usuario");
        System.out.println(" 2 - Livro");
        System.out.println("-------------------------");
        System.out.println(" Digite a opção:");

    }
    private static void menuUsuario(){
        System.out.println("------Menu Usuario-----");
        System.out.println("1 - Cadastrar Usuario");
        System.out.println("2 - Listar Usuarios");
        System.out.println("-------------------------");
        System.out.println(" Digite a opção:");
    }
    private static void menuLivro(){
        System.out.println("------Menu Livro-----");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("2 - Listar Livros");
        System.out.println("3 - Buscar livro");
        System.out.println("4 - Emprestar livro");
        System.out.println("5 - Receber livro");
        System.out.println("-------------------------");
        System.out.println(" Digite a opção:");
    }
}
