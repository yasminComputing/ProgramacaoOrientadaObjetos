package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		Carro carro =  new Carro();
		
		System.out.println("Modelo do carro: ");
		carro.modelo = sc.nextLine();
		
		System.out.println("Velocidade atual: ");
		carro.velocidadeAtual = sc.nextDouble();
		
		System.out.println("Velocidade máxima: ");
		carro.velocidadeMaxima = sc.nextInt();
		
		System.out.println("Informe valor para acelerar: ");
		int valor = sc.nextInt();
		carro.acelerar(valor);
		
		System.out.println("Informe um valor para frear: ");
		int valorFrear = sc.nextInt();
		carro.frear(valorFrear);
		if(carro.atingiuVelocidadeMaxima(valorFrear)) {
			System.out.println("Não atingiu a velocidade máxima!");
		}else {
			System.out.println("Atingiu a velocidade máxima " +carro.velocidadeMaxima);
		}
		
		System.out.println("Distância da viagem: ");
		double distancia = sc.nextDouble();
		
		System.out.println("Distância da viagem: " + carro.calcularTempoViagem(distancia));
		
		sc.close();
	}

}
