package pkg;

public class Funcionario {
	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double aumentarSalario(double porcentagem) {
			return salario + (salario * porcentagem /100);
	}
	
	@Override
	public String toString() {
		return "Nome: "+ nome
				+ "\nSalário: R$ " + salario;
	}

}
