package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.print("Nome do produto: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		
		Produto produto1 = new Produto(nome,preco,quantidade);
		System.out.println("--------------------------");
		System.out.println("Informações do produto 1");
		produto1.exibirInformacoes();
		System.out.println("--------------------------");

		
		nome = "Cafeteira";
		preco = 190.53;
		quantidade = 3;
		Produto produto2 = new Produto(nome,preco,quantidade);
		System.out.println("Informações do produto 2");
		produto2.exibirInformacoes();
		System.out.println("--------------------------");

		sc.close();

	}

}
