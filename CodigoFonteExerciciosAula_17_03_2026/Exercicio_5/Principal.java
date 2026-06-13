package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		System.out.print("Informe seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		
		
		
		System.out.print("Qual gostaria de instanciar?(1- Nome e idade/ 2- Idade): ");
		int opcao = sc.nextInt();
		
		if (opcao == 1) {
			Pessoa pessoa = new Pessoa(nome,idade);
		}else if (opcao == 2) {
			Pessoa pessoa = new Pessoa(idade);
		}else {
			System.out.println("Nenhuma pessoa foi instanciada!");
		}
		
		
		
		sc.close();
	}

}
