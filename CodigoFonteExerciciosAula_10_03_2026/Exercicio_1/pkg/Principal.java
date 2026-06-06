package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Carro carro1 = new Carro();
		
		System.out.println("Informe os seguintes dados da carro 1: ");
		
		System.out.print("Marca do carro: ");
		carro1.marca = sc.nextLine();
		
		System.out.print("Modelo: ");
		carro1.modelo = sc.nextLine();
		
		System.out.print("Ano de fabricação: ");
		carro1.anoFabricacao = sc.nextInt();
		
		Carro carro2 = new Carro();
		System.out.println("Informe os seguintes dados do carro 2: ");
		
		sc.nextLine();
		System.out.print("Marca do carro: ");
		carro2.marca = sc.nextLine();
		
		System.out.print("Modelo: ");
		carro2.modelo = sc.nextLine();
		
		System.out.print("Ano de fabricação: ");
		carro2.anoFabricacao = sc.nextInt();

		System.out.println("---------------------------------------");

		System.out.println("Dados informados dos carros");
		
		System.out.println("Carro 1: ");
		System.out.println("Marca: " + carro1.marca + "\nModelo: " + carro1.modelo + "\nAno de Fabricação: " + carro1.anoFabricacao);
		System.out.println("---------------------------------------");
		System.out.println("Carro 2: ");
		System.out.println("Marca: " + carro2.marca + "\nModelo: " + carro2.modelo + "\nAno de Fabricação: " + carro2.anoFabricacao);
		
		
		sc.close();
		
		
	}

}
