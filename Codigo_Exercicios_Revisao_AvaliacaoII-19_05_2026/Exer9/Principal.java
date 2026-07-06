package pacote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Produto> lista = new ArrayList<Produto>();
		
		String nome;
		double preco;
		int quantidade;
		System.out.println("---- Adicione produtos ---- ");
		while(true) {
			System.out.println("Nome do produto: ");
			 nome = sc.nextLine();
			
			System.out.println("Preço: R$ ");
			preco = sc.nextDouble();
			
			System.out.println("Quantidade: ");
			quantidade = sc.nextInt();
			
			Produto produto = new Produto (nome,preco,quantidade);
			lista.add(produto);
			
			sc.nextLine();
			System.out.println("Deseja adicionar mais (s/n)? ");
			String opcao = sc.nextLine().toUpperCase();
			if (opcao.equals("N")) break;
			
		}
		for (Produto p : lista) {
			System.out.println("Nome do produto: " +p.nome);
			System.out.println("Preço: R$ " + p.preco);
			System.out.println("Quantidade: " + p.quantidade);
			System.out.println("----------------");
		}
		
	}

}
