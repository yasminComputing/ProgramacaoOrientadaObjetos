package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tipo: ");
		String tipo = sc.nextLine();

		
		
		System.out.println("Informe seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		
		Pessoa pessoa = new Pessoa(tipo,nome,idade);
		
		System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nTipo: " + tipo);
		
		pessoa.falar();
		pessoa.andar();
		
		sc.close();
	}

}
