package pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] pessoas = {"Ana","Carlos","Luiz","Fernando","Ana Paula"};
		
		try {
			System.out.print("Informe um valor (0 a 4): ");
			int posicao = sc.nextInt();
			System.out.println(pessoas[posicao]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ERRO: Número informado está fora da array\n" + e.toString());
		}catch(InputMismatchException e) {
			System.out.println("ERRO: Valor informado inválido! " + e.toString());
		}
			
		sc.close();
	

}
}
