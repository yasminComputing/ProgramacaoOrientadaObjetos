package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Pessoa pessoa = new Pessoa ();
		
		System.out.println("Informe uma mensagem: ");
		String mensagem = sc.nextLine();

		pessoa.falar(mensagem);
		
		System.out.println("----------------");
		
		System.out.println("Informe outra mensagem: ");
		mensagem = sc.nextLine();
		
		System.out.println("Digite um número para fazer a repetiçãa da mensagem: ");
		int repeticao = sc.nextInt();
		
		pessoa.falar(mensagem, repeticao);
		
		
		
		
		sc.close();
	}

}
