package pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.print("Informe uma temperatura: ");
			String celsius = sc.nextLine();
			
			double converterTemperatura = Double.parseDouble(celsius);
			
			 double fahrenheit = (converterTemperatura * 1.8) + 32;
			 System.out.println("Temperatura em fahrenheit: " + fahrenheit);
		}catch(NumberFormatException e) {
			System.out.println("ERRO: Temperatura informada está na formação incorreta!");
		}
		
		
		sc.close();
	}

}
