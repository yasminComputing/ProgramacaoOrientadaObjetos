package pkg;

public class Principal {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		Cliente cliente = new Cliente (15);
		
		double precoProduto = 350;
		
		System.out.println("Preço do produto(sem desconto0: R$ " + produto.calcularPrecoFinal(precoProduto));
		
		System.out.println("Preço final (com desconto): R$ " + produto.calcularPrecoFinal(precoProduto,cliente));

	}

}
