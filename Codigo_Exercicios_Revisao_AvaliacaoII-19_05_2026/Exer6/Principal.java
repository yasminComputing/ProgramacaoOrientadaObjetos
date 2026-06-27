package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Quantos funcionário deseja adicionar: ");
		int quantidade = sc.nextInt();
		
		sc.nextLine();

		Funcionario[] funcionario = new Funcionario[quantidade];
		int i = 0;
		while(i < quantidade) {
			
			
			 System.out.println("\nTipo do funcionário (1 - Funcionario | 2 - Gerente | 3 - Desenvolvedor): ");
	          int tipo = sc.nextInt();
	          sc.nextLine();
			
			
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Salário: R$ ");
			double salario = sc.nextDouble();
			sc.nextLine();
			
			if(tipo == 1) {
				funcionario [i] = new Funcionario(nome,salario);

			}else if (tipo == 2) {
				System.out.println("Informe seu bônus anual: ");
				double bonus = sc.nextDouble();
				sc.nextLine();
				funcionario[i] = new Gerente(nome,salario,bonus);
			}else if(tipo == 3) {
				System.out.println("Horas extras: ");
				int horas = sc.nextInt();
				System.out.println("Valor hora: R$ ");
				double  valorH = sc.nextDouble();
				funcionario[i] = new Desenvolvedor(nome,salario,horas,valorH);
			}

			funcionario[i].aumentarSalario(5);
			i++;
		}
		
		System.out.println("--------------------");
		for(Funcionario f: funcionario) {
			System.out.println(f);
			System.out.println("------------------------");
		}
		
				
				
				
				
	   sc.close();
	}

}
