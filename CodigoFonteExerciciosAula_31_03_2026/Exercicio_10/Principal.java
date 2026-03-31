package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Nome do time: ");
		String nome = sc.nextLine();
		
		System.out.println("Gol marcados: ");
		int golsMarcados = sc.nextInt();
		
		System.out.println("Gols sofridos: ");
		int golsSofridos = sc.nextInt();
		
		Time time = new Time(nome,golsMarcados,golsSofridos);
		
		System.out.println(time.dados());
		
		System.out.println(time.resultadoPartido());
		
		
		
		
		sc.close();

	}

}
