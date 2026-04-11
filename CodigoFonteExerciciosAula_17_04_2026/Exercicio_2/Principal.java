package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o raio do círculo: ");
		double raio = sc.nextDouble();
		
		Circulo circulo = new Circulo(raio);
		
		System.out.println("Área do círculo é " + circulo.calculaArea());
		
		
		
		
		sc.close();

	}

}
