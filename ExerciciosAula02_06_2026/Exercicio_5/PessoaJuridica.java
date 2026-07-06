package pkg;

public class PessoaJuridica extends Pessoa{

	private String cnpj;
	public PessoaJuridica(String nome, String cidade,String cnpj) {
		super(nome, cidade);
		this.cnpj = cnpj;
	}
	

	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	@Override
	public void efetuarCompra() {
		System.out.println("Compra efetuada pessoa juridica....");
	}

}
