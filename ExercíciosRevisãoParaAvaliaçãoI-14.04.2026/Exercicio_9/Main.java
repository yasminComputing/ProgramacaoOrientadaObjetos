package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Filme filme = new Filme();
		System.out.println("Informe os dados do filme:");
		System.out.println("Título do filme: ");
		filme.titulo = sc.nextLine();
		System.out.println("Diretor: ");
		filme.diretor = sc.nextLine();
		System.out.println("Duração em minutos: ");
		filme.duracaoEmMinutos = sc.nextInt();
		System.out.println("Genêro: ");
		filme.genero = sc.nextLine();
		System.out.println("---------------------");
		filme.exibirDetalhes();
		if(filme.ehLongo()) {
			System.out.println("O filme " + filme.titulo + " é longo!");
		}
		else {
			System.out.println("O filme não é longo");
		}
		sc.close();

	}

}
