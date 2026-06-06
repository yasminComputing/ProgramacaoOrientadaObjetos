package pkg;

public class Gerente extends Funcionario{

	private double bonus = 0.05;
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calcularSalario() {
		return salario + (bonus * salario);
	}

}
