package pkg;

public class Retangulo {
		public double largura;
		public double altura;

		public Retangulo(double largura,double altura) {
			this.largura = largura;
			this.altura = altura;
		}
		public double calcularArea(double L,double A) {
			return L * A;
		}
		public double calcularPerimetro(double L, double A) {
			return 2 * (L + A);
		}
		public double calcularDiagonal(double L, double A) {
		    return Math.sqrt(Math.pow(L, 2) + Math.pow(A, 2));

		}
}
