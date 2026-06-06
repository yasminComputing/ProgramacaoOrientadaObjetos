package pkg;

public class Pessoa {
		private String nome;
		private int idade;
		private String cpf;
		
		public Pessoa(String nome,int idade,String cpf) {
			this.nome = nome;
			this.idade = idade;
			this.cpf = cpf;
		}
		public String getNome() {
			return nome;
		}
		public int getIdade() {
			return idade;
		}
		public String getCpf() {
			return cpf;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		public void exibirDados() {
			System.out.println("---- Dados ----");
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("CPF: " + cpf);
		}
		
		public boolean verificaMaiorDeIdade() {
			if (idade >= 18) {
				return true;
			}
			return false;
		}
		
}
