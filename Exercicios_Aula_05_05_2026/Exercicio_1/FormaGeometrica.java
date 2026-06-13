package pkg;

public class FormaGeometrica {
	protected double base;
	protected double altura;
		
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void calcularArea() {
		System.out.println("Cálcular área...");
	}
}
