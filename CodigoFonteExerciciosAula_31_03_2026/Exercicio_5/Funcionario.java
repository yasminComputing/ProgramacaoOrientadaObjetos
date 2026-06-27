package pkg;

public class Funcionario {
		public String nome;
		public double salario;
		public int horaExtra;
		
		public Funcionario() {
	
		}
		public double calcularValorHoraExtra() {
			return horaExtra * 50;
		}
		public double calcularPagamentoTotal() {
			return salario + calcularValorHoraExtra();
		}
		public double adicionarHorasExtras(int horas) {
			return horaExtra + horas;
		}
		public double salarioAnual() {
			return salario * 12;
		}
		public String toString() {
			return "Nome: " + nome + "\n"
					+ "Salário base: R$ " + salario  + "\n"
					+ "Hora extra: " + calcularValorHoraExtra() +"\n"
					+ "Salario total com hora extra: R$ " + calcularPagamentoTotal() + "\n"
					+ "Salário Anual: " + salarioAnual();
		}
}
