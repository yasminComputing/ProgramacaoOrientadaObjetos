package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe os seguintes dados: ");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		
		sc.nextLine();
		System.out.print("CPF: ");
		String cpf = sc.nextLine();;
		
		Pessoa p = new Pessoa(nome,idade,cpf);
		
		p.exibirDados();
		
		if(p.verificaMaiorDeIdade()) {
			System.out.println("Você é MAIOR de idade!");
		}
		else {
			System.out.println("Você é MENOR de idade");
		}
		
		sc.close();
	}

}
