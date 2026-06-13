package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Informe a marca: ");
		String marca = sc.nextLine();
		System.out.print("Modelo: ");
		String modelo = sc.nextLine();
		System.out.print("Ano: ");
		int ano = sc.nextInt();
		
		System.out.println("Qual tipo do veículo? ");
		System.out.println("1- Carro");
		System.out.println("2- Moto");
		System.out.print("Opção: ");
		int opcao = sc.nextInt();
		
		if(opcao == 1) {
			Veiculo carro = new Carro(marca,modelo,ano);
			carro.dados();
			carro.Acelerar();
			carro.Frear();
		}else if(opcao == 2) {
			Veiculo moto = new Moto(marca,modelo,ano);
			moto.dados();
			moto.Acelerar();
			moto.Frear();
		}else {
			System.out.println("O menu não possui essa opção!");
		}
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
