package pkg;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escolha:\n1- Pessoa Física\n2- Pessoa Juridica\nOpção: ");
		int opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.println("Informe seu nome: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.println("Cidade: ");
			String cidade = sc.nextLine();
			System.out.println("Informe seu CPF: ");
			String cpf = sc.nextLine();
			PessoaFisica fisica = new PessoaFisica(nome,cidade,cpf);
			
			fisica.efetuarCompra();
		}else if(opcao == 2) {
			System.out.println("Informe razão social da empresa: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.println("Cidade: ");
			String cidade = sc.nextLine();
			System.out.println("Informe o CNPJ: ");
			String cnpj = sc.nextLine();
			PessoaJuridica juridica = new PessoaJuridica(nome,cidade,cnpj);
			
			juridica.efetuarCompra();
			
		}else {
			System.out.println("Opção não está no menu!Tente Novamante");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
