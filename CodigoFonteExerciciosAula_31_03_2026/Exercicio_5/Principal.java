package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.println("Salário: R$ ");
		funcionario.salario = sc.nextDouble();
		System.out.println("Horas extra: ");
		funcionario.horaExtra = sc.nextInt();
		
		System.out.println("Adiciona mais hora extra: ");
		int hora = sc.nextInt();
		
		funcionario.calcularPagamentoTotal();
		funcionario.adicionarHorasExtras(hora);
		
		
		System.out.println(funcionario.toString());
		
		sc.close();

	}

}
