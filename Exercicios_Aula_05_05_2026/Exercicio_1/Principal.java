package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangulo triangulo = new Triangulo();
		
		
		System.out.print("Informe a base do triângulo: ");
		triangulo.setBase(sc.nextDouble());
		
		System.out.print("Altura: ");
		triangulo.setAltura(sc.nextDouble());
		
		
		
		triangulo.calcularArea();
		
		
		
		sc.close();

	}

}
