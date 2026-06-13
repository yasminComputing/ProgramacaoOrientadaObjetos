package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os valores dos lados do triângulo");
		
		System.out.println("Lado 1: ");
		double lado1 = sc.nextDouble();
		
		System.out.println("Lado 2: ");
		double lado2 = sc.nextDouble();
		
		System.out.println("Lado 3: ");
		double lado3 = sc.nextDouble();
		
		Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
		
		triangulo.validarTriangulo();
		
		
		sc.close();
	}

}
