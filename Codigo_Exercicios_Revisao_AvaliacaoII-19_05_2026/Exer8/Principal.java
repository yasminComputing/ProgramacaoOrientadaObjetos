package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Reserva reserva1 = new ReservaDeHotel();
		Reserva reserva2 = new ReservaDeVoo();
		System.out.println("--- RESERVA DE HOTEL --- ");
		System.out.println("1-Adicionar reserva no hotel\n2- Cancelar reserva");
		System.out.println("Qual opção?");
		int opcao = sc.nextInt();
		if(opcao == 1) {
			reserva1.adicionar();

		}else if (opcao == 2) {
			reserva1.cancelar();

		}
		
	/*	não funciona
		reserva2.adicionar("Econômico");
		reserva2.adicionar("Executiva");
		
	*/
		ReservaDeVoo voo = new ReservaDeVoo();

		System.out.println("--- RESERVA DE VOO --- ");
		System.out.println("1-Adicionar uma reserva de voo\n2- Cancelar reserva");
		System.out.println("Qual opção?");
		int opcaoVoo = sc.nextInt();
		if(opcaoVoo == 1) {
			voo.adicionar("Econômico");
			voo.adicionar("Executivo");

		}else if(opcaoVoo == 2) {
			voo.cancelar();
		}
		
		sc.close();
	}

}
