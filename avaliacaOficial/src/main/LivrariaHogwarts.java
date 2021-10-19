package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entidades.Acervo;

public class LivrariaHogwarts {

	public static void main(String[] args) {

		Acervo acervo = new Acervo();

		Scanner teclado = new Scanner(System.in);
		int opcao;
		opcao = 1;

		do {

			menu();

			System.out.print("Informe a opção desejada: ");
			opcao = teclado.nextInt();

			switch (opcao) {

			case 1:
				acervo.cadastrar();
				break;

			case 2:
				acervo.listaLivro();
				break;

			case 3:
               acervo.pesquisar();
				break;

			case 4:
				System.out.println("Obrigado(a) por utilizar o nosso sistema! Atenciosamente livraria Hogwarts ");
				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
				break;
			default:
				System.err.println("Essa opção é invalida, tente novamente!");
				System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
				break;
			}

		} while (opcao != 4);

	}

	public static void menu() {

		System.out.println("|----#----#----#----#----#----#----#----#----#----#----|"
				+ "\n|----#   Sejam bem vindos a livraria Hogwarts     #----|"
				+ "\n|----#           Menu da livraria                 #----|"
				+ "\n|----#         1 - Cadastrar livro                #----|"
				+ "\n|----#         2 - Listar livros                  #----|"
				+ "\n|----#         3 - Pesquisar por livros           #----|"
				+ "\n|----#         4 - Encerrar                       #----|"
				+ "\n|----#----#----#----#----#----#----#----#----#----#----|");
	}

}
