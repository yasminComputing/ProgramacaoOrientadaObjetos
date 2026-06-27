package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teste da data1 informada:");
		Data data1 =  new Data(13,"JUNHO",2026);
		
		data1.validarData();
		
		
		System.out.println("Teste da data2 informada: ");
		Data data2= new Data(31,"FEVEREIRO",2026);
		
		
		data2.validarData();
		
		
		
		
		sc.close();
	}

}
