package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		Computador computador1 = new Computador();
		
		System.out.print("Informe a marca do computador: ");
		computador1.marca = sc.nextLine();
		
		System.out.print("Modelo: ");
		computador1.modelo = sc.nextLine();
		
		System.out.print("Tipo(notebook,tablet....): ");
		computador1.tipo = sc.nextLine();
		
		System.out.print("Preço: R$ ");
		computador1.preco = sc.nextDouble();
		
		System.out.println("-------------------------------");

		System.out.println("Dados do computador 1: ");
		System.out.println("Marca: "+ computador1.marca + "\nModelo: "+computador1.modelo + "\nTipo: "+computador1.tipo +"\nPreço: R$ " +computador1.preco);
		
		
		
		
		Computador computador2 = new Computador();
		computador2.dadosComputador2();
		System.out.println("-------------------------------");
		System.out.println("Dados do computador 2: ");
		System.out.println("Marca: "+ computador2.marca + "\nModelo: "+computador2.modelo + "\nTipo: "+computador2.tipo +"\nPreço: R$ " +computador2.preco);
		
		
		sc.close();

	}

}
