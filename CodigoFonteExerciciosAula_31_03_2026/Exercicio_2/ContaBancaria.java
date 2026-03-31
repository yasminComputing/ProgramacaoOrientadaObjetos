package pkg;

public class ContaBancaria {
	public String titular;
	public double saldo;
	
	public ContaBancaria(String titular,double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public double depositar(double valor) {
		return saldo + valor;
	}
	public  boolean sacar(double saque) {
		if(saque > this.saldo) {
			return false;
		}
		this.saldo -= saque;
		return true;
		
	}
	
	public double transferir(double valor,ContaBancaria destino) {
			return this.saldo -= valor;
	}
	
	public double consultarSaldo(double valor) {
		return saldo; 
	}
	
	
}
