package pkg;

public class Desenvolvedor extends Funcionario{
		protected double horasExtras;
		protected double valorHoraExtra;


		public Desenvolvedor(String nome, double salario, double horasExtras,double valorHoraExtra) {
			super(nome, salario);
			this.horasExtras = horasExtras;
			this.valorHoraExtra = valorHoraExtra;
		}

		public double getHorasExtras() {
			return horasExtras;
		}

		public void setHorasExtras(double horasExtras) {
			this.horasExtras = horasExtras;
		}
		
		
		public double getValorHoraExtra() {
			return valorHoraExtra;
		}

		public void setValorHoraExtra(double valorHoraExtra) {
			this.valorHoraExtra = valorHoraExtra;
		}

		public double calcularHorasExtras() {
			return horasExtras * valorHoraExtra;
		}
		 @Override
		    public String toString() {
		        return "Desenvolvedor"
		        		+"\nNome: " + nome +
		               "\nSalário: " + salario +
		               "\nHoras Extras: " + horasExtras +
		               "\nGanho Extras: " + calcularHorasExtras();
		    }
		
}
