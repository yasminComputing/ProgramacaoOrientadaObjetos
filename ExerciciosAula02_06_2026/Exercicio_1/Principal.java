package pkg;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu tipo de conta? ");
		System.out.println("1 - Conta de Investimento");
		System.out.println("2 - Conta Corrente");
		System.out.print("Opção: ");
		int opcao = sc.nextInt();
		
		double saldo,limite,valor,sacar;
		switch(opcao) {
		case 1: 
			System.out.print("Saldo inicial da conta: R$ ");
			saldo = sc.nextDouble();
			System.out.print("Limite da conta: R$ ");
			limite = sc.nextDouble();
			
			System.out.println("Valor que deseja investir na conta: R$ ");
			valor = sc.nextDouble();
			System.out.println("Valor que deseja sacar: R$ ");
			sacar = sc.nextDouble();
			
			ContaInvestimento investimento = new ContaInvestimento(saldo,limite);
			
			investimento.informacoes();
			System.out.println("Deposito: R$ " + investimento.Depositar(valor));
			System.out.println("Sacar: R$ " + investimento.Sacar(sacar));
			break;
		case 2:
			System.out.print("Saldo inicial da conta: R$ ");
			saldo = sc.nextDouble();
			System.out.print("Limite da conta: R$ ");
			limite = sc.nextDouble();
			
			System.out.println("Valor que deseja depositar na conta: R$ ");
			valor = sc.nextDouble();
			System.out.println("Valor que deseja sacar: R$ ");
			sacar = sc.nextDouble();
			
			ContaCorrente corrente = new ContaCorrente(saldo,limite);
			
			corrente.informacoes();
			System.out.println("Deposito: R$ " + corrente.Depositar(valor));
			System.out.println("Sacar: R$ " + corrente.Sacar(sacar));
			break;
		default:
				System.out.println("O menu não possui essa opção!Tente Novamente!");
		}
		
	}

}
