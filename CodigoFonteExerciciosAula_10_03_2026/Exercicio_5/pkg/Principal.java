package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Produto prod = new Produto();
		
		System.out.print("Nome do produto: ");
		prod.nome = sc.nextLine();
		
		System.out.print("Preço: R$ ");
		prod.preco = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		prod.quantidadeEmEstoque = sc.nextInt();
		
		
		
		if(prod.quantidadeEmEstoque <= 0) {
			System.out.println("Estoque vazio!Não é possível calcular o valor total em estoque");
		}else {
			System.out.println("--------------------------");
			System.out.println("Dados do Produto: ");
			System.out.println("Nome: "+prod.nome+"\nPreço: R$ "+prod.preco+"\nQuantidade em estoque: "+prod.quantidadeEmEstoque+"\nValor total em estoque: R$ "+prod.valorTotalEmEstoque());
		}
		
		
		
		
		
		sc.close();
	}

}
