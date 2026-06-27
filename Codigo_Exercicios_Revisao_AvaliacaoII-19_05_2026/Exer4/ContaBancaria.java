package pkg;

public class ContaBancaria {
		protected double saldo;
		
		public ContaBancaria(double saldo) {
			super();
			this.saldo = saldo;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			if(saldo >= 0) {
				this.saldo = saldo;
			}
			System.out.println("O saldo não pode ser menor que zero!");
		}

		public double depositar(double valor) {
			return saldo + valor;
		}
		public double depositar(double valor,Cheque cheque) {
			return saldo + valor + cheque.valor;
		}
}
