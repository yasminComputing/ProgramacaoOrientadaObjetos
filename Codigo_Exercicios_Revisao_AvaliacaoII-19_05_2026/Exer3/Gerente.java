package pkg;

public class Gerente  extends Funcionario{
		private double bonus;

		public Gerente(double salario, double bonus) {
			super(salario);
			this.bonus = bonus;
		}

		public double getBonus() {
			return bonus;
		}

		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
		
		@Override 
		public double calcularSalario() {
			return salario + (salario * bonus / 100);
		}
		
}
