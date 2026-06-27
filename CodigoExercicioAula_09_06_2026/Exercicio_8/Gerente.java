package pkg;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		return salario += (salario * 0.20);
	}

}
