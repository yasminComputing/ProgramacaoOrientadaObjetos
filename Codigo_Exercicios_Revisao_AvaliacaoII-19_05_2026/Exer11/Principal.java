package pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		System.out.println("Informe quantas pessoas deseja adicionar na lista: ");
		int quantidade = sc.nextInt();
		
		int i = 0;
		String nome,sexo;
		int idade;
		int quantidadeMulheres = 0;
		
		while(i < quantidade) {
			
			sc.nextLine();
			System.out.println("------------------------------");
			
			System.out.println("Nome: ");
			nome = sc.nextLine();
			
			System.out.println("Idade: ");
			idade = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Sexo (f/m): ");
			sexo = sc.next().toUpperCase();
			
			if(sexo.equals("F"))quantidadeMulheres++;
			
			Pessoa pessoa= new Pessoa(nome,idade,sexo);
			
			lista.add(pessoa);
			
			i++;
		}
		
		System.out.println("-- Dados -- ");
		for(Pessoa p : lista) {
			System.out.println(p.informacoes());
			System.out.println("------------------------------");
		}
		System.out.println("Na lista possui: " + quantidadeMulheres + " de mulheres.");

			
		
		sc.close();
		
	}

}
