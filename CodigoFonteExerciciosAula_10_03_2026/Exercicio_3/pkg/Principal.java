package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Informe seus dados");
		
		System.out.print("Nome: ");
		pessoa.nome = sc.nextLine();
		
		System.out.print("Idade: ");
		pessoa.idade = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Gênero: ");
		pessoa.genero = sc.nextLine();
		
		System.out.println("-----------------------");
		System.out.println("Dados informados:");
		
		System.out.println("Nome: " + pessoa.nome + "\nIdade: "+pessoa.idade + "\nGênero: " + pessoa.genero);
		
		
		sc.close();

	}

}
