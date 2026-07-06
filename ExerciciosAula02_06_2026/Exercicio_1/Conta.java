package pkg;

public abstract class Conta {
		protected double saldo;
		protected double limite;
		public Conta(double saldo, double limite) {
			setSaldo(saldo);
			setLimite(limite);
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			if(saldo > 0) {
				this.saldo = saldo;
			}else {
				System.out.println("Não é permitido saldo baixo de zero!");
			}
		}
		public double getLimite() {
			return limite;
		}
		public void setLimite(double limite) {
			if(limite > 0) {
				this.limite = limite;

			}else {
				System.out.println("Não é permitido limite baixo de zero!");
			}
		}
		
		public abstract double Depositar(double valor);
		
		public abstract double Sacar(double sacar);
		
		public void informacoes() {
			System.out.println("==== Conta ====");
			System.out.println("Saldo inicial: R$ " + saldo);
			System.out.println("Limite da conta: R$ " + limite);
		}
		
}
