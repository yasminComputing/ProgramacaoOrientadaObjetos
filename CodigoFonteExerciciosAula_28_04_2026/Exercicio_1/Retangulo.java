package pkg;

public class Retangulo extends Figura{
		protected double largura;
		protected double altura;
		
		
		public Retangulo(String cor, String preenchido, double largura, double altura) {
			super(cor, preenchido);
			this.largura = largura;
			this.altura = altura;
		}
		public double calcularArea() {
			return altura * largura;
		}
		@Override
		public void exibirInformacoes() {
			System.out.println("Cor do retângulo: "+ cor);
			System.out.println("Preenchido: " + preenchido);
			System.out.println("Área do retângulo: " + calcularArea());
		}
		
}
