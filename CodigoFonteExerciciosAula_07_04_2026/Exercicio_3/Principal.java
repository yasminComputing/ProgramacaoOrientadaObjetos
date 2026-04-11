package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a base do retângulo: ");
		double base = sc.nextDouble();
		
		System.out.print("Informe altura: ");
		double altura = sc.nextDouble();
		
		Retangulo retangulo = new Retangulo(base,altura);
		
		System.out.println("Área do retângulo: " + retangulo.calculaArea());
		
		
		
		sc.close();
	}

}
