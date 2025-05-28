package org.example;

import org.example.exceptions.LivroNaoEncontrado;
import org.example.exceptions.UsuarioJaCadastrado;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcao, opcaoCategoria;
        do {
                menuPrincipal();
                opcao = sc.nextInt();
                sc.nextLine();

            if (opcao == 1) {
                try {
                    menuUsuario();
                    opcaoCategoria = sc.nextInt();
                    sc.nextLine();

                    if (opcaoCategoria == 1) {

                        System.out.println("Qual o nome do usuario?");
                        String nome = sc.nextLine();

                        System.out.println("Qual o telefone do usuario?");
                        String telefone = sc.nextLine();

                        Usuario usuarioNovo = new Usuario(nome, telefone);
                        biblioteca.adicionaUsuario(usuarioNovo);
                    } else if (opcaoCategoria == 2) {
                        biblioteca.listarUsuarios();
                    }
                } catch (UsuarioJaCadastrado e) {
                    System.err.println("Usuario ja cadastrado" + e.getMessage());
                }
            } else if (opcao == 2) {
                try {

                    menuLivro();
                    opcaoCategoria = sc.nextInt();
                    sc.nextLine();

                    if (opcaoCategoria == 1) {
                        cadastraLivro(sc, biblioteca);

                    } else if (opcaoCategoria == 2) {
                        biblioteca.listarLivros();

                    } else if (opcaoCategoria == 3) {
                        System.out.println("Qual o nome do livro?");
                        String nome = sc.nextLine();
                        if (!biblioteca.buscarLivro(nome)) {
                            System.out.println("Livro não encontrado/Disponivel");
                        } else {
                            System.out.println("Livro disponivel");
                        }
                    } else if (opcaoCategoria == 4) {
                        System.out.println("Qual é o seu usuario?");
                        String nome = sc.nextLine();

                        if (!biblioteca.buscarUsuario(nome)) {
                            System.out.println("Usuario não cadastrado");
                        } else {
                            System.out.println("Qual o titulo do livro?");
                            String titulo = sc.nextLine();

                            if (!biblioteca.buscarLivro(titulo)) {
                                System.out.println("Livro não encontrado/Disponivel");
                            } else {
                                System.out.println("Livro retirado com sucesso");
                            }
                        }
                    } else if (opcaoCategoria == 5) {
                        cadastraLivro(sc, biblioteca);
                        System.out.println("Livro devolvido");
                    }
                } catch (LivroNaoEncontrado e) {
                    System.err.println("Livro não encontrado" + e.getMessage());
                }
            }

        } while (opcao != 0);
        sc.close();
    }

    private static void menuPrincipal() {
        System.out.println("------Menu Principal-----");
        System.out.println("-------------------------");
        System.out.println(" 1 - Usuario");
        System.out.println(" 2 - Livro");
        System.out.println("-------------------------");
        System.out.println(" Digite a opção:");

    }

    private static void menuUsuario() {
        System.out.println("------Menu Usuario-----");
        System.out.println("1 - Cadastrar Usuario");
        System.out.println("2 - Listar Usuarios");
        System.out.println("-------------------------");
        System.out.println(" Digite a opção:");
    }

    private static void menuLivro() {
        System.out.println("------Menu Livro-----");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("2 - Listar Livros");
        System.out.println("3 - Buscar livro");
        System.out.println("4 - Emprestar livro");
        System.out.println("5 - Receber livro");
        System.out.println("-------------------------");
        System.out.println(" Digite a opção:");
    }

    private static void cadastraLivro(Scanner sc, Biblioteca biblioteca) {
        System.out.println("Qual o nome do livro?");
        String nome = sc.nextLine();

        System.out.println("Qual o autor do livro?");
        String autor = sc.nextLine();

        System.out.println("Qual o data de públicação do livro?");
        String dataPublicacao = sc.next();

        Livro livronovo = new Livro(nome, autor, dataPublicacao);
        biblioteca.adicionarLivros(livronovo);
    }
}
