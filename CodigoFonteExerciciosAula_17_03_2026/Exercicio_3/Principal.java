package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Pessoa pessoa1 = new Pessoa();
		
		System.out.println("Informe os seguintes dados: ");
		System.out.print("Nome: ");
		pessoa1.nome = sc.nextLine();
		
		System.out.print("E-mail: ");
		pessoa1.email = sc.nextLine();
		
		System.out.print("Data de nascimento (dd/mm/aaaa): ");
		pessoa1.dataDeNascimento = sc.nextLine();
		
		Pessoa pessoa2 = new Pessoa();
		
		System.out.println("Informe os seguintes dados: ");
		System.out.print("Nome: ");
		pessoa2.nome = sc.nextLine();
		System.out.print("E-mail: ");
		pessoa2.email = sc.nextLine();
		
		System.out.print("Data de nascimento (dd/mm/aaaa): ");
		pessoa2.dataDeNascimento = sc.nextLine();
		
		System.out.print("Escolha quem vai ser adminstrator: ");
		String nomeDoAdmin = sc.nextLine();
	
		System.out.println();
		if (pessoa1.nome.equals(nomeDoAdmin)){
			pessoa1.promoverAdmin();
		}
		else if(pessoa2.nome.equals(nomeDoAdmin)) {
			pessoa2.promoverAdmin();
		}
		
		
		System.out.println("-----------------------------");
		System.out.println("Dados da Pessoa 1 " + pessoa1.nome);
		System.out.println("Nome: " + pessoa1.nome + "\nE-mail: " + pessoa1.email + "\nData de nascimento: " + pessoa1.dataDeNascimento);
		
		System.out.println("-----------------------------");
		System.out.println("Dados da Pessoa 2 " + pessoa1.nome);
		System.out.println("Nome: " + pessoa2.nome + "\nE-mail: " + pessoa2.email + "\nData de nascimento: " + pessoa2.dataDeNascimento);
		
	
		sc.close();
		
	}

}
