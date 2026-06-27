package pkg;

public class Gerente extends Funcionario{
		protected double bonus;

		public Gerente(String nome, double salario, double bonus) {
			super(nome, salario);
			this.bonus = bonus;
		}

		public double getBonus() {
			return bonus;
		}

		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
		
		public double aumentarSalario(double porcentagem) {
			return (salario * porcentagem / 100) + bonus;
		}
		public String toString() {
			return "Gerente"
						+ "\nNome: " + nome
						+ "\nSálario: " + salario
						+ "\nBônus anual: " + bonus;
		}
}
