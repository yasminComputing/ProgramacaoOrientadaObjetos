package pkg;

public class Pedido {
		public int numero;
		public String produto;
		public double preco ;
		public int quantidade;
	public Pedido() {
		
	}
	public double  calcularSubTotal() {
		return  preco * quantidade;
	}
	public double calcularDesconto(double percentual) {
		return calcularSubTotal()  * (percentual / 100);
	}
	public double calcularTotal(double percentualDesconto) {
		return calcularSubTotal() - calcularDesconto(percentualDesconto);
	}
	public String resumoPedido(double percentual,double percentualDesconto) {

		return "Número do pedido" + numero + "\n"
				+ "Preço: R$ " + preco + "\n"
				+ "Sub-total: R$ " + calcularSubTotal() + "\n"
				+ "Quantidade: " + quantidade + "\n"
				+ "Desconto " + percentual + "\n"
				+ "Preço final: R$  " + calcularTotal(percentualDesconto);
	}
	
}
