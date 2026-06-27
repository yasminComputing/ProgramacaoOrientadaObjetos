package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Casa casa = new Casa();
		
		System.out.println("Informe o tamanho da casa: ");
		int tamanho = sc.nextInt();
		
		System.out.println("Preço por metro: R$ ");
		casa.setPrecoMetro(sc.nextDouble());
		
		
		System.out.println("Quantos quartos têm na casa? ");
		int quartos = sc.nextInt();
		
		System.out.println("Preço unitário de um quarto: R$ ");
		double adicionalQuarto = sc.nextDouble();
		
		System.out.println("--------------------");
		System.out.println("Preço da casa (sem adicional dos quartos): R$ " + casa.calcularPreco(tamanho));

		
		System.out.println("Preço final da casa: R$ " + casa.calcularPreco(tamanho, quartos, adicionalQuarto));
		
		sc.close();
	}

}
