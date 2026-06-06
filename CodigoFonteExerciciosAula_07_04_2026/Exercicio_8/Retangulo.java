package pkg;

public class Retangulo {
	private int x;
	private int y;
	
	public Retangulo(int a, int b) {
		x = a;
		y = b;
	}s

	public void inserir_lados(int a, int b) {
		this.x = a;
		this.y = b;
	}
	public void calcular_area() {
		int area = x * y;
		System.out.println("Área " + area);
	}
}
