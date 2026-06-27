package projeto;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(double saldo, double limite) {
		super(saldo, limite);
	}

	@Override
	public void depositar(double valor) throws SaldoInsuficienteException {
		if(valor <= 0) {
			throw new SaldoInsuficienteException("Impossível depositar zero ou valor negativo!");
		}
		saldo+= valor;
}
		

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		if(valor > saldo+limite) {
			throw new SaldoInsuficienteException("Saldo Insuficiente");
		}else if(valor <= 0) {
			throw new SaldoInsuficienteException("Impossível sacar zero ou valor negativo");
		}
		saldo -= valor;		
	}
	
	public double atualizarJuros() {
		return saldo+= (saldo * 0.03);		

	}

}
