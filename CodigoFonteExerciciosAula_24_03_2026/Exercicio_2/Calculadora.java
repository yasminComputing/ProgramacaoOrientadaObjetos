package pkg;

public class Calculadora {
	public int numero1;
	public int numero2;
	
	public Calculadora(int n1, int n2) {
		numero1 = n1;
		numero2 = n2;
	}
	public float somar(int n1,int n2) {
		return n1+n2;
	}
	public float subtrair(int n1,int n2) {
		return n1 - n2;
	}
	public float multiplicar (int n1,int n2) {
		return n1 * n2;
	}
	public float divisao(int n1,int n2) {
		float resultadoDivisao = 0;
		try{
			resultadoDivisao = n1 / n2;
		}catch(ArithmeticException e) {
			System.out.println("ERRO: Não é possível dividir por ZERO" + e.getMessage());
		}
		return resultadoDivisao;
		
	}
}
