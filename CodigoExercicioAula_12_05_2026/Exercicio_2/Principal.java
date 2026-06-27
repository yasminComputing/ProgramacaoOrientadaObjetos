package pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Aluno> lista = new ArrayList<Aluno>();
		
		String nome;
		double nota1;
		double nota2;
		
		while (true) {
				System.out.println("--- Informe os dados do Aluno --- ");
				System.out.print("Nome: ");
				nome = sc.nextLine();
				
				System.out.print("Nota 1: ");
				nota1 = sc.nextDouble();
				
				System.out.print("Nota 2: ");
				nota2 = sc.nextDouble();
				
				Aluno aluno = new Aluno(nome,nota1,nota2);
				
				lista.add(aluno);
				
				sc.nextLine();
				System.out.print("Deseja adicionar mais dados de outro aluno (s/n)? ");
				String opcao = sc.nextLine().toUpperCase();
				if(opcao.equals("N"))break;
		}
				System.out.println("-------------------------");

		
				for (Aluno a : lista) {
					double media = a.media();
					
					System.out.println("Dados " + "\nNome: " + a.getNome() + "\nMédia: " + media);
					if (media >= 6 ) {
						System.out.println("SITUAÇÃO: Aluno Aprovado!");
					}else {
						System.out.println("SITUAÇÃO: Aluno Reprovado!");
					}
					System.out.println("-------------------------");
				}
		sc.close();
	}

}
