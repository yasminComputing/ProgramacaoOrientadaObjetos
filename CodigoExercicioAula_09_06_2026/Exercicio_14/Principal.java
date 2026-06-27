package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		
		Pessoa p = new Pessoa(nome,idade);
		
		p.validarIdade();
		
		sc.close();
	}

}
