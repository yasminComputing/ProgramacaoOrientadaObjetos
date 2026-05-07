package pkg;

public class Carro {
		public String modelo;
		public double velocidadeAtual;
		public double velocidadeMaxima;
		
		public Carro() {
			
		}
		public double acelerar(int valor) {
			if(valor < velocidadeMaxima) {
				return velocidadeAtual + valor;
			}
			return velocidadeAtual;
		}
		public double frear(int valorFrear) {
			if(valorFrear > 0) {
				velocidadeAtual -= valorFrear;
			}
			return velocidadeAtual;
		}
		public boolean atingiuVelocidadeMaxima(int valorFrear) {
			if (valorFrear == velocidadeMaxima)return true;
			return false;
		}
		public double calcularTempoViagem(double distancia) {
			return distancia / velocidadeAtual;
		}
}
