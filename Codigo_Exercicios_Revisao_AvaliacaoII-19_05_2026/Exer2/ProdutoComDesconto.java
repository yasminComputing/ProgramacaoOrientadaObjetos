package pkg;

public class ProdutoComDesconto  extends Produto {

	@Override
	public double desconto(double valor,double porcentagem) {
		return valor-  (valor * (porcentagem / 100));
	}
}
