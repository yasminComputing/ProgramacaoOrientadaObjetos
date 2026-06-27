package pkg;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Yasmin");
		
		pessoa.trabalhar();
		
		Funcionario funcionario = new Funcionario("Luiz");
		
		funcionario.trabalhar();

	}

}
