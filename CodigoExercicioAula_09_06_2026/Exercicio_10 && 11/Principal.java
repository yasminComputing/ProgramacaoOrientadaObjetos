package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual tipo de produto deseja informar os dados?");
		System.out.println("1- Livro");
		System.out.println("2- CD");
		System.out.print("Opção: ");
		int opcao = sc.nextInt();
		sc.nextLine();
		
		if(opcao == 1) {
			System.out.print("Nome do Livro: ");
			String nome = sc.nextLine();
			System.out.print("Preço: R$ ");
			double preco = sc.nextDouble();
			sc.nextLine();
			System.out.print("Descrição: ");
			String descricao = sc.nextLine();
			
			Produto livro = new Livro(nome,preco,descricao);
			
			livro.dados();
			
		}else if(opcao == 2) {
			System.out.print("Nome do CD: ");
			String nome = sc.nextLine();
			
			System.out.print("Preço: R$ ");
			double preco = sc.nextDouble();
			sc.nextLine();
			System.out.print("Descrição: ");
			String descricao = sc.nextLine();
			
			Produto cd = new CD(nome,preco,descricao);
			
			cd.dados();
		}
		
		
		
		
		
		sc.close();
	}

}
