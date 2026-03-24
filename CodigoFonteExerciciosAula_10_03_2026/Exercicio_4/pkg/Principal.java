package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Livro livro = new Livro();
		
		System.out.print("Título do livro: ");
		livro.titulo = sc.nextLine();
		
		//sc.nextLine();
		System.out.print("Autor(es): ");
		livro.autor = sc.nextLine();
		
		System.out.print("Ano de publicação: ");
		livro.anoDePublicacao = sc.nextInt();
	
		sc.nextLine();

		System.out.print("O livro têm edicação (sim/não): ");
		String temEdicao = sc.nextLine();
		if(temEdicao.equalsIgnoreCase("sim")) {
			System.out.print("Edição: ");
			livro.edicao = sc.nextInt();
		}else {
			livro.edicao = 1;
		}
		
		System.out.println("----------------------------");
		System.out.println("Dados do Livro");
		System.out.println("Título: " + livro.titulo + "\nAutor(es): " + livro.autor+ "\nAno de publicação: " + livro.anoDePublicacao + "\nEdição:  "+livro.edicao);
		
		sc.close();
	}

}
