package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe marca do carro: ");
		String marca = sc.nextLine();
		
		System.out.println("Modelo: ");
		String modelo = sc.nextLine();
		
		System.out.println("Ano: ");
		int ano = sc.nextInt();
		
		Carro carro = new Carro(marca,modelo,ano);
		
		carro.exibirDetalhes();
		
		
		
		
		sc.close();
	}

}
