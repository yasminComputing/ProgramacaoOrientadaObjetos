package pkg;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ContaCorrente conta = new ContaCorrente();
		System.out.print("Informe o saldo na conta corrente: ");
		conta.setSaldo(sc.nextDouble());
		
		conta.calcularSaldo();
		
		
		sc.close();
 }
}
