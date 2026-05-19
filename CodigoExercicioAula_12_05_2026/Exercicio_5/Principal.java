package pkg;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Conta> lista = new ArrayList<>();
		
		
		lista.add(new Conta(101, "Yasmin", 2500.00));
		lista.add(new Conta(102, "Carlos", 7800.00));
		lista.add(new Conta(103, "Amanda", 4300.00));
		lista.add(new Conta(104, "Joao", 9200.00));
		lista.add(new Conta(105, "Fernanda", 6100.00));
		
		
		Conta maior = maiorSaldo(lista);
			
			System.out.println("A conta com maior saldo: ");
			System.out.println("Numero: " + maior.getNumero());
			System.out.println("Titular: "+ maior.getTitular());
			System.out.println("Saldo: R$ " + maior.getSaldo());
		
		
		
		
	}
	public static Conta maiorSaldo(List<Conta> lista) {
		Conta maior = lista.get(0);
		for(Conta c : lista) {
			if(c.getSaldo() > maior.getSaldo()) {
				maior = c;
			}
		}
		return maior;
	}
}
