package pkg;

import java.util.InputMismatchException;
import java.lang.ArithmeticException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double premio = 5000.0;
		
		try {
		    System.out.print("Informe quantas pessoas vão dividir o prêmio de R$ " + premio + ": ");
		    int quantidade = sc.nextInt();

		    int totalParaCadaUm = (int) premio / quantidade;
		    System.out.println("Cada pessoa vai receber: R$ " + totalParaCadaUm);

		} catch (ArithmeticException e) {
		    System.out.println("ERRO: Não é possível dividir por zero " + e.getMessage());
		} catch (InputMismatchException e) {
		    System.out.println("ERRO: O valor informado deve ser um inteiro " + e.toString());
		}
		
		sc.close();
	}
}
