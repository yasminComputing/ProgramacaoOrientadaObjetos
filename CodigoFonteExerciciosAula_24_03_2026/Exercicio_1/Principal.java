package pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalExercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Informe um número inteiro: ");
			int numero = sc.nextInt();
			
			int raizQuadrada = (int) Math.sqrt(numero);
			System.out.println("Raiz quadrada: " + raizQuadrada);
		}catch(InputMismatchException e) {
			System.out.println("Erro: Valor digitado inválido! " + e.toString());
		}
		
		sc.close();
		
	}

}
