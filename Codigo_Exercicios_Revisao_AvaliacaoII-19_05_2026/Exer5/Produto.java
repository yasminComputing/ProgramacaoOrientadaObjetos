package pkg;

public class Produto {
		public double calcularPrecoFinal(double preco) {
			return preco;
		}
		public double calcularPrecoFinal(double preco,Cliente cliente) {
			return preco - (preco * cliente.getDesconto() /100);
		}
}
