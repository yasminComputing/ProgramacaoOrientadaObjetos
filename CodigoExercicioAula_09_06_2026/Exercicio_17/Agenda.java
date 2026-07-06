package pkg;

public class Agenda {
	private String nome;
	private String telefone;
	public Agenda(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void adicionarContato() {
		if(nome == null || nome.isBlank()){
			throw new IllegalArgumentException("O nome informado não pode ser nulo ou vazio!");
		}
		if(telefone == null || telefone.isBlank()) {
			throw new IllegalArgumentException("O telefone informado não pode ser nulo ou vazio!");
		}
		
		System.out.println("Contato adicionado com sucesso...");
	}
}
