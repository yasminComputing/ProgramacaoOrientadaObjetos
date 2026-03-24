package pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0, n2 = 0;
		
		try {
		System.out.print("Informe um valor: ");
		n1 = sc.nextInt();
		
		System.out.print("Informe outro valor: ");
		n2 = sc.nextInt();
		
		Calculadora calculadora = new Calculadora(n1,n2);
		
		int opcao;
		do {
			System.out.println("--------------------------");
			System.out.println("Escolha uma opção");
			System.out.println("1-Soma");
			System.out.println("2-Subtrair");
			System.out.println("3-Multiplicar");
			System.out.println("4-Divisão");
			System.out.println("5-Finalizar programa");
			System.out.println("Escolha: ");
			 opcao = sc.nextInt();
			if (opcao == 1) {
				System.out.println("Soma: " + calculadora.somar(n1, n2));
				
			}
			else if (opcao == 2) {
				System.out.println("Subtrair: " + calculadora.subtrair(n1, n2));
			}
			else if (opcao == 3) {
				System.out.println("Multiplicar: " + calculadora.multiplicar(n1, n2));
			}
			else if (opcao == 4) {
				System.out.println("Divisão: " + calculadora.divisao(n1,n2));
			}
			
		}while(opcao != 5);
		
		System.out.println("Programa Finalizado!");
		
		
		}catch(InputMismatchException e) {
			System.out.println("ERRO: Valor informado inválido! " + e.toString());
		}
		catch(Exception e) {
			System.out.println("Exceção: " + e.toString());
		}
		
		sc.close();

	}

}
