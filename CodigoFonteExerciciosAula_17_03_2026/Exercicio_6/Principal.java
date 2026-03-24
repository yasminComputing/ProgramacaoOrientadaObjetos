package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Matrícula: ");
		String matricula = sc.nextLine();
		
		Aluno aluno1 = new Aluno(nome,matricula);
		
		System.out.print("Data de nascimento (dd/mm/aaaa): ");
		String dataDeNascimento = sc.nextLine();
		
		Aluno aluno2 = new Aluno(dataDeNascimento);
		
		System.out.print("Ano de ingresso na faculdade: ");
		int anoIngressoFaculdade = sc.nextInt();
		
		Aluno aluno3 = new Aluno(nome,dataDeNascimento,anoIngressoFaculdade);
		
		System.out.println("----------------------");
		System.out.println("Dados Informados:");
		System.out.println("Nome: " + aluno1.nome + "\nData de nascimento: " + aluno2.dataDeNascimento + "\nAno de ingresso na faculdade: " + aluno3.anoIngressoFaculdade);
		sc.close();

	}

}
