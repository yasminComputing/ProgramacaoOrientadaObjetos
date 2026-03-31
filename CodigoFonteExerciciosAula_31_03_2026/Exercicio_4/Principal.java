package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a altura do retângulo: ");
		double altura = sc.nextDouble();
		
		System.out.print("Informe a largura: ");
		double largura = sc.nextDouble();
		
		Retangulo retangulo = new Retangulo(altura,largura);
		
		System.out.println("Área do retângulo: " + retangulo.calcularArea(altura, largura));
		
		System.out.println("Perimetro: " + retangulo.calcularPerimetro(altura, largura));
		
		System.out.printf("Diagonal: %.2f\n" ,retangulo.calcularDiagonal(altura, largura));
		
		
		
		sc.close();
	}

}
