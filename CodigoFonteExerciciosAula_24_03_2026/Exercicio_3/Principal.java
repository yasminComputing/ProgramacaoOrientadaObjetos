package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.print("Informe uma string: ");
			String leitura = sc.nextLine();
			
			double valor = Double.parseDouble(leitura);
			
			System.out.println(valor);
		}catch(NumberFormatException e){
			System.out.println("ERRO: Não fo possível converter a String " + e.toString());
		}
		
		
		sc.close();
		
	}

}
