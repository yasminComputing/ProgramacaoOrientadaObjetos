package pkg;

public class PessoaFisica extends Pessoa {

	private String cpf;
	public PessoaFisica(String nome, String cidade,String cpf) {
		super(nome, cidade);
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public void efetuarCompra() {
		System.out.println("Compra efetuada por pessoa fisíca.....");
	}
	
	

}
