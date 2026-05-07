package pkg;

public class ContaCorrente extends ContaBancaria{
	
	@Override
	public void calcularSaldo() {
		if (saldo > 0) {
			System.out.println("Saldo conta corrente: R$ " + saldo);
		}
	}
}
