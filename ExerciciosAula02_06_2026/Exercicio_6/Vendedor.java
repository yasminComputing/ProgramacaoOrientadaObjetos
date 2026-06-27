package pkg;

public class Vendedor extends Funcionario{
	private double bonus = 0.03;
	public Vendedor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calcularSalario() {
		return salario + (salario * bonus);
	}

}
