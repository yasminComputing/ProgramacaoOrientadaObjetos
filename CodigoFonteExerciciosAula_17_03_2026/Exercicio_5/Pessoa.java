package pkg;

public class Pessoa {
	public String nome;
	public int idade;
	
	public  Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
	
	
	
	public Pessoa(int idade) {
		this.idade = idade;
		System.out.println("Idade: " + idade);
	}
	
}
