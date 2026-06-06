package pkg;

public class Triangulo extends FormaGeometrica{

	@Override
	public void calcularArea() {
		System.out.println("Área do triângulo: " + (base * altura) / 2);
	}
}
