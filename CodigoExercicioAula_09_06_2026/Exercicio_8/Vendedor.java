package pkg;

public class Vendedor  extends Funcionario{

	public Vendedor(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		return salario += (salario * 0.10);
	}

}
