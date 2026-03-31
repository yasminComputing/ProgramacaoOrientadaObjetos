package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.print("Nome do titular: ");
			String nome = sc.nextLine();
			
			System.out.print("Informe o valor que deseja depositar na conta: R$ ");
			double valor = sc.nextDouble();
			
			
			ContaBancaria conta = new ContaBancaria(nome,valor);
			
			System.out.print("Valor que deseja sacar:  R$ ");
			double saque = sc.nextDouble();
			
			if(conta.sacar(saque)) {
				System.out.println("Saque realizado....");
				System.out.println("Saldo: R$ " + conta.consultarSaldo(valor));
			}else {
				System.out.println("Saldo insuficiente!");
			}
			
			System.out.print("Informe o valor que deseja transferir: R$ ");
			valor = sc.nextDouble();
			if (conta.transferir(valor, conta) <= 0) {
				System.out.println("Não é possível realizar a transferencia.Saldo insuficiente");
			}else{
				conta.transferir(valor, conta);
			}
		
			System.out.println("Valor atual na conta: R$  "+ conta.consultarSaldo(valor));
		
			System.out.println("");
		}catch(Exception e) {
			System.out.println("ERRO...." + e.getMessage());
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
