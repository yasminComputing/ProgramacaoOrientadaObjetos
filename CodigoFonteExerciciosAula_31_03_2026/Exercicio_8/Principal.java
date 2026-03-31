package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		Filme filme = new Filme();
		System.out.println("Informe o titulo do filme: ");
		filme.titulo = sc.nextLine();
		System.out.println("Minutos: ");
		filme.minutos = sc.nextInt();
		System.out.println("Classificação de idade: ");
		filme.classificacaoEtaria = sc.nextInt();
		
		filme.converterDuracaoHoras();
		
		System.out.println("Informe sua idade: ");
		int idade = sc.nextInt();
		
		filme.podeAssistir(idade);
		if(filme.podeAssistir(idade)) {
			System.out.println("Pode assistir o filme.");
		}
		else {
			System.out.println("Não pode assistir o filme");
		}
		
		sc.close();
	}

}
