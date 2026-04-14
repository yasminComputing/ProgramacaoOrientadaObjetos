package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Usuario user= new Usuario("YASMIN", "1234y");
		
		System.out.println("Informe seus dados para LOGIN");
		System.out.print("Usuário: ");
		String usuario = sc.nextLine().toUpperCase();
		System.out.print("Senha: ");
		String senha = sc.nextLine();
		
		
		
		user.login(usuario,senha);
		System.out.println();
		
		user.exibirStatus();
		
		user.logout();
		
	
		
		sc.close();
	}

}
