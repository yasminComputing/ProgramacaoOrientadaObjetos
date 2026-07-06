package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o lado A do triângulo: ");
		double ladoA = sc.nextDouble();
		System.out.println("Informe o lado B do triângulo: ");
		double ladoB = sc.nextDouble();
		System.out.println("Informe o lado C do triângulo: ");
		double ladoC = sc.nextDouble();
		
		Triangulo triangulo = new Triangulo(ladoA,ladoB,ladoC);
		
		if(triangulo.verificaEquilatero()) {
			System.out.println("O triângulo é EQUILÁTERO");
		}else {
			System.out.println("O triângulo NÃO equilátero");
		}
		
		sc.close();

	}

}
