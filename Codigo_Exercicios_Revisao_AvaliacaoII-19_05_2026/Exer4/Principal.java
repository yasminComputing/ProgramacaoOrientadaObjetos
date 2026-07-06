package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um saldo inicial: ");
		double saldo = sc.nextDouble();
		
		ContaBancaria conta = new ContaBancaria(saldo);
		conta.setSaldo(saldo);

		System.out.println("Valor que deseja depositar: ");
		double valor = sc.nextDouble();
		if(valor < 0) {
			System.out.println("O valor de deposito não pode ser menor que zero!");
		}else {
			System.out.println("Saldo atualizado: R$ " + conta.depositar(valor));

		}
		
		Cheque cheque = new Cheque(500);

		System.out.println("Saldo atualizado (cheque): " + conta.depositar(valor, cheque));

		
		sc.close();
	}

}
