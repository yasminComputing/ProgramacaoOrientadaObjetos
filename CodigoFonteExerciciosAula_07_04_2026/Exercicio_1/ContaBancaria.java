package pkg;

public class ContaBancaria {
	private double saldo;
	private double limite;
	
	public ContaBancaria() {
		
	}
	public double getLimite() {
		return limite;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void setSaldo(double saldo) {
		if(saldo < 0 || saldo > limite) {
			System.err.println("Saldo informado inválido!");
		}else {
			this.saldo = saldo;

		}
	}
	
	
	public double sacar(double saque) {
		if(saque < saldo) {
			return saldo - saque;
		}
		System.err.println("Valor de saque maior que o saldo!");
		return saldo;
	}
	public double depositar(double deposito) {
		if(deposito < 0 || deposito < limite) {
			return saldo + deposito;
		}
		System.err.println("Valor de depósito inválido!");
		return saldo;
		
	}
	
	
	
	
	
	
}
