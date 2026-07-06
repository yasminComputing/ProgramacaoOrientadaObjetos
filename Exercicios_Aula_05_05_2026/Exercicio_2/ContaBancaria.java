package pkg;

public class ContaBancaria {
		protected double saldo;
		
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public void calcularSaldo() {
			System.out.println("Conta Bancaria....");
		}
}
