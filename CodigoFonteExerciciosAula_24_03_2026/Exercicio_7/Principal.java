package pkg;

public class Principal {

	public static void main(String[] args) {

		
		try {
			String nome = null;
			System.out.println(nome.length()); // Lança NullPointerException

		}catch(NullPointerException  e) { //Esse exceção acontece quando é tentado usar uma variável sem ser inicializada.
			System.out.println("ERRO: A váriavel não foi inicializada!" + e.toString());
		}
		
		
		int a = 1;
		int b = 0;
		try {
			int divisao =a / b;
			System.out.println(divisao);
		}catch(ArithmeticException e){ // A exeção de divisão por zero: é quando usuário tenta dividir um número por zero.
			System.out.println("Não é possível dividir por zero " + e.getMessage());
		}
	}

}
