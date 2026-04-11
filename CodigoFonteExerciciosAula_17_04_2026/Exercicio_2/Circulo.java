package pkg;

public class Circulo {
	private double PI= 3.14;
	private double raio;
	
	public Circulo (double raio) {
		this.raio = raio;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double calculaArea() {
		return Math.pow(this.raio,2) * PI;
	}
}
