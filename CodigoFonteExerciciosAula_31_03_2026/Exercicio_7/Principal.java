package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pedido pedido = new Pedido();
		
		System.out.println("Número do pedido: ");
		pedido.numero = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Produto: ");
		pedido.produto = sc.nextLine();
		
		System.out.println("Preço: R$ ");
		pedido.preco = sc.nextDouble();
		
		System.out.println("Quantidade: ");
		pedido.quantidade = sc.nextInt();
		
		pedido.calcularSubTotal();

		
		System.out.println("Percentual do desconto: ");
		double percentual = sc.nextDouble();
		
		pedido.calcularDesconto(percentual);
		
		pedido.calcularTotal(percentual);
		
		System.out.println(pedido.resumoPedido(percentual,percentual));
		
		
		sc.close();

	}

}
