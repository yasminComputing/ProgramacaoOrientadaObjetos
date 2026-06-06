package pkg;

public class ContaCorrente extends Conta{

	public ContaCorrente(double saldo, double limite) {
		super(saldo, limite);
	}

	@Override
	public double Depositar(double valor) {
		if(valor <= limite) {
			 return this.saldo += valor;
		}
		return this.saldo;
	}

	@Override
	public double Sacar(double sacar) {
		if(this.saldo >= sacar) {
			return this.saldo -= sacar;
		}
		return this.saldo;
	}

}
