package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor do produto: R$ ");
		double valor = sc.nextDouble();
		
		System.out.println("Porcentagem do desconto %%: ");
		double porcentagem = sc.nextDouble();
		
		ProdutoComDesconto produto = new ProdutoComDesconto();
		
		System.out.println("Valor final do produto (com desconto): R$ " + produto.desconto(valor, porcentagem));
		
		
		
		sc.close();

	}

}
