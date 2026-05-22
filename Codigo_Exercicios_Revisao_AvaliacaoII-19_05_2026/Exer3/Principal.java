package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Informe o salário do funcionário: ");
		double salario = sc.nextDouble();
		
		sc.nextLine();
		System.out.println("O funcionário é gerente (sim/nao)? ");
		String isGerente = sc.nextLine().toUpperCase();
		
		if(isGerente.equals("SIM")) {
			System.out.println("Informe a porcentagem de bônus: ");
			double porcentagem = sc.nextDouble();
			
			Gerente gerente = new Gerente(salario,porcentagem);
			
			System.out.println("Salário final (com bônus): R$ " + gerente.calcularSalario());
		}
		else {
			
		
		Funcionario funcionario = new Funcionario (salario);
		
		System.out.println("Salário: R$ " + funcionario.calcularSalario());
		}
		sc.close();
	}

}
