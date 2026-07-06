package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a marca do seu notebook: ");
		Notebook notebook = new Notebook(sc.nextLine());
		
		System.out.println("\nInsira a marca do netbook: ");
		Netbook netbook = new Netbook(sc.nextLine());
		
		System.out.println("Dados do seu Notebook: ");
		System.out.println(notebook.exibeMarca());
		System.out.println("Modelo: "+ notebook.exibeModelo());
		System.out.println("---------------------");
		System.out.println("Dados do seu Netbook: ");
		System.out.println(netbook.exibeMarca());
		System.out.println("Modelo: " +  netbook.exibeModelo());
		
		sc.close();
	}

}
