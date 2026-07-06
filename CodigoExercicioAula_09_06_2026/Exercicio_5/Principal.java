package projeto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o saldo: R$ ");
		double saldo = sc.nextDouble();
		
		System.out.println("Informe o limite: ");
		double limite = sc.nextDouble();
		
		System.out.println("Qual seu tipo de conta? ");
		System.out.println("1- Conta Investimento");
		System.out.println("2- Conta Poupança");
		System.out.println("Opção: ");
		int tipo = sc.nextInt();
		int opcao;
		
switch(tipo) {
		case 1: 
				ContaInvestimento investimento = new ContaInvestimento(saldo,limite);
				System.out.println("Saldo atualizado: R$ " +investimento.atualizarRendimentos());
				System.out.println("Deseja sacar ou depositar algum valor?\n1-Sacar\n2-Depositar\nOpção: ");
				opcao = sc.nextInt();
				if(opcao == 1) {
					System.out.println("Valor que deseja sacar: R$ ");
					double valor = sc.nextDouble();
					investimento.sacar(valor);
				}else if(opcao == 2) {
					System.out.println("Valor que deseja depositar: R$ ");
					double valor = sc.nextDouble();
					investimento.depositar(valor);
				}
				
				investimento.dados();

				break;
		case 2: 
		
				ContaPoupanca poupanca = new ContaPoupanca(saldo,limite);
				System.out.println("Saldo atualizado: R$ " +poupanca.atualizarJuros());
				System.out.println("Deseja sacar ou depositar algum valor?\n1-Sacar\n2-Depositar\nnOpção: ");
				opcao = sc.nextInt();
				if(opcao == 1) {
					System.out.println("Valor que deseja sacar: R$ ");
					double valor = sc.nextDouble();
					poupanca.sacar(valor);
				}else if(opcao == 2) {
					System.out.println("Valor que deseja depositar: R$ ");
					double valor = sc.nextDouble();
					poupanca.depositar(valor);
				}
				
				poupanca.dados();
				break;
		default:
				System.out.println("O menu não possui esse tipo de conta!Tente Novamente!");
			
		}
		sc.close();
	}

}
