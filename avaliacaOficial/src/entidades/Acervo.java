package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Acervo {

	private static ArrayList<LivroGenero> listaLivros = new ArrayList<>();

	// Cadastrar Livro
	public static void cadastrar() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
		System.out.println("|----#----# CADASTRAR LIVRO #----#----|");

		System.out.println(" * Informe o titulo do livro: ");
		String titulo = teclado.nextLine();

		System.out.println(" * Informe o autor do livro: ");
		String autor = teclado.nextLine();

		System.out.println(" * Informe a sinopse do livro: ");
		String sinopse = teclado.nextLine();

		System.out.println(" * Informe o genero do livro: ");
		String genero = teclado.nextLine();

		System.out.println(" * Informe o preço do livro: ");
		float preco = teclado.nextFloat();
		
		preco = Math.round(preco);
        
		LivroGenero livros = new LivroGenero(titulo, autor, sinopse, preco, genero);

		listaLivros.add(livros);

		System.out.println("Livro Cadastrado com sucesso!");
		System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
	}

	public static void listaLivro() {

		System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
		System.out.println("|----#----# LISTAR LIVROS #----#----|");

		for (LivroGenero livros : listaLivros) {
			System.out.println("|----#----#----#----#----#----#----#----#----#----#----|\n");
			System.out.println("* Titulo do livro: " + livros.getTitulo());
			System.out.println("* Autor do livro: " + livros.getAutor());
			System.out.println("* Sinopse do livro: " + livros.getSinopse());
			System.out.println("* Genero do livro: " + livros.getGenero());
			System.out.println("* Preço do livro R$:" + livros.getPreco());
			System.out.println("|----#----#----#----#----#----#----#----#----#----#----|\n");
		}
	}

	public static void pesquisar() {

		System.out.println("|----#----#----#----#----#----#----#----#----#----#----|");
		System.out.println("|----#----# PESQUISAR PARTICIPANTE #----#----|");

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o titulo do livro: ");
		String titulo = teclado.nextLine();

		for (LivroGenero livros : listaLivros) {
			if (livros.getTitulo().equals(titulo)) {
				int opc = 1;

				do {

					System.out.println("|----#----#----#----#----#----#----#----#----#-----#----|"
							+ "\n|----#         1 - Editar livro                    #----|"
							+ "\n|----#         2 - remover livro                   #----|"
							+ "\n|----#         3 - sair do pesquisar               #----|"
							+ "\n|----#----#----#----#----#----#----#----#----#-----#----|");

					System.out.println("* Informe a opção desejada: ");
					opc = teclado.nextInt();

					switch (opc) {

					case 1:
						Scanner tec = new Scanner(System.in);
						int opcEdit = 1;
						do {

							System.out.println("|----#----#----#----#----#----#----#----#----#-----#----|"
									+ "\n|----#     Qual dessas informações irá editar?        #----|\""
									+ "\n|----#         1 - Titulo                             #----|"
									+ "\n|----#         2 - Autor                              #----|"
									+ "\n|----#         3 - Sinopse                            #----|"
									+ "\n|----#         4 - Genero                             #----|"
									+ "\n|----#         5 - Preço                              #----|"
									+ "\n|----#         6 - Sair do editar                     #----|"
									+ "\n|----#----#----#----#----#----#----#----#----#-----#----|");

							System.out.println("* Informe a opção desejada: ");
							opcEdit = teclado.nextInt();

							switch (opcEdit) {
							case 1:
								System.out.println(" * Informe o novo titulo do livro: ");
								String novoTitulo = tec.nextLine();
								livros.setTitulo(novoTitulo);
								System.out.println("Titulo atualizado!");
								break;
							case 2:
								System.out.println(" * Informe o novo autor do livro: ");
								String novoAutor = tec.nextLine();
								livros.setAutor(novoAutor);
								System.out.println("Autor atualizado!");
								break;
							case 3:
								System.out.println(" * Informe a nova sinopse do livro: ");
								String novoSinopse = tec.nextLine();
								livros.setSinopse(novoSinopse);
								System.out.println("Sinopse atualizado!");
								break;
							case 4:
								System.out.println(" * Informe o novo genero do livro: ");
								String novoGenero = tec.nextLine();
								livros.setGenero(novoGenero);
								System.out.println("Genero atualizado!");
								break;
							case 5:
								System.out.println(" * Informe o novo preço do livro: ");
								float novoPreco = tec.nextFloat();
								livros.setPreco(novoPreco);
								System.out.println("Preço atualizado!");
								break;
							default:
								break;
							}
						} while (opcEdit != 6);
						break;
					case 2:

						Scanner remover = new Scanner(System.in);
						System.out.println("Informe o titulo do livro: ");
						String removerLivro = remover.nextLine();

						for (LivroGenero livrosRemover : listaLivros) {
							if (livrosRemover.getTitulo().equals(removerLivro)) {
								listaLivros.remove(removerLivro);
								System.out.println("Livro removido com sucesso! ");
							} else {
								System.err.println("O titulo está incorreto, tente novamente!");
							}
						}
						
						break;
					default:
						break;
					}

				} while (opc != 3);

			} else {
				System.err.println(
						"Esse livro não foi encontrado na livraria, por favor verifique se o titulo está correto!");
			}
		}
	}

}
