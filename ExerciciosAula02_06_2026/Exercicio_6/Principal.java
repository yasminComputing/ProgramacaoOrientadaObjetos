package pkg;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Salário Base do Gerente: R$ ");
		double salarioBase = sc.nextDouble();
		
		Gerente gerente = new Gerente(nome,salarioBase);
		
		gerente.dados();
		System.out.println("Salário final do Gerente: R$ "+ gerente.calcularSalario());
		
		System.out.println();
		
		System.out.print("Informe o nome do Vendedor: ");
		nome = sc.nextLine();
		sc.nextLine();
		System.out.println("Salário Base do Vendedor: R$ ");
		salarioBase = sc.nextDouble();
		
		Vendedor vendedor = new Vendedor(nome,salarioBase);
		
		vendedor.dados();
		System.out.println("Salário final do Vendedor: R$ " + vendedor.calcularSalario());
		
		
		
		sc.close();
	}
}
