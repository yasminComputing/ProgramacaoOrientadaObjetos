package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
		System.out.println("Conta Bancária");
		
		System.out.println("Limite da conta: R$ ");
		conta.setLimite(sc.nextDouble());
		
		System.out.println("Saldo inicial: R$  ");
		conta.setSaldo(sc.nextDouble());

		int opcao;
		
		do{
			
			System.out.println("Menu");
			System.out.println("1- Sacar");
			System.out.println("2- Depositar");
			System.out.println("3 - Sair");
			System.out.print("Opção: ");
			opcao = sc.nextInt();
			
			if(opcao == 1) {
				
				System.out.println("Valor que deseja sacar: R$ ");
				double saque = sc.nextDouble();
				System.out.println("Saldo: R$ " + conta.sacar(saque));
				
			}else if (opcao == 2) {
				System.out.println("Valor que deseja depositar: R$ ");
				double deposito = sc.nextDouble();
			
				System.out.println("Saldo: R$ " +conta.depositar(deposito));
			}else if (opcao == 3) {
				System.out.println("Programa finalizado!");
				
			}else {
				System.out.println("Opção inválida!");
			}
			
		}while(opcao != 3);

		sc.close();

	}

}
