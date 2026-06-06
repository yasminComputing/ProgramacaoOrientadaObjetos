package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Notebook notebook = new Notebook();
		
		System.out.print("Informe a marca do computador: ");
		notebook.marca = sc.nextLine();
		
		System.out.println("Marca: " + notebook.exibeMarca() + "\nModelo: " + notebook.exibeModelo());
		
		
		sc.close();

	}

}
