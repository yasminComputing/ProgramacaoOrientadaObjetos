package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Livro livro = new Livro();
		
		System.out.print("Nome do livro: ");
		livro.titulo = sc.nextLine();
		
		System.out.print("Autor: ");
		livro.autor = sc.nextLine();
		
		System.out.print("Ano de publicação: ");
		livro.anoPublicacao = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Gênero: ");
		livro.genero = sc.nextLine();
		
		System.out.println("---------------------");
		System.out.println("Dados do livro:");
		
		
		livro.exibirDados();
		
		System.out.println("---------------------");
		System.out.println("Situação do livro:");
		livro.emprestar();
		
		livro.emprestar();
		
		livro.devolucao();
		
		
		
		sc.close();
	}

}
