package projeto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do animal: ");
		String nome = sc.nextLine();
		
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Que tipo de animal é:\n1-Cachorro\n2-Gato\nOpção: ");
		int tipo = sc.nextInt();
		
		if(tipo == 1) {
			Animal cachorro = new Cachorro(nome,idade);
			cachorro.dados();
			cachorro.emitirSom();
		}
		else if(tipo == 2) {
			Animal gato =  new Gato(nome,idade);
			gato.dados();
			gato.emitirSom();
		}else {
			System.out.println("Esse tipo de animal não existe no menu!Tente Novamnete!");
		}
		
		
		
		
		
		
		sc.close();
		
	}

}
