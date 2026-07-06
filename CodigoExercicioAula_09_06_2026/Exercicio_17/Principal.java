package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados para adicionar na Agenda...");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Telefone: ");
		String telefone = sc.nextLine();
		
		Agenda agenda = new Agenda(nome,telefone);
		
		agenda.adicionarContato();
		
		
		sc.close();
	}

}
