package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Disciplina disciplina = new Disciplina();
		
		
		System.out.println("Dados originais: ");
		disciplina.exibirDadosOriginal();
		System.out.println("------------------------");
	
		System.out.print("Nome da disciplina: ");
		String nome = sc.nextLine();
		
		System.out.print("Carga horária da disciplina: ");
		int cargaHoraria = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Nome do professor: ");
		String nomeProfessor = sc.nextLine();
		
		disciplina.atribuindoValores(nome,cargaHoraria,nomeProfessor);
		System.out.println("------------------------");
		System.out.println("Dados informados: ");
		disciplina.exibirDadosOriginal();

	
		
		sc.close();

	}

}
