package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Matrícula: ");
		aluno.matricula = sc.nextLine();
		
		System.out.print("Nota 1: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.print("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.print("Nota 3: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("---------------------");
		System.out.println("Nome: " + aluno.nome + "\nMatrícula: " + aluno.matricula + "\nNota 1:" + aluno.nota1 + "\nNota2:" + aluno.nota2 + "\nNota 3:" + aluno.nota3);

		if (aluno.notaFinal() >= 6) {
			System.out.println("Situação: APROVADO!");
		}
		else {
			System.out.println("Situação: REPROVADO!");
		}
		
		
		sc.close();

	}

}
