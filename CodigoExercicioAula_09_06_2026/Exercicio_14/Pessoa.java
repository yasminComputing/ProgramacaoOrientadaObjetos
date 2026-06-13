package pkg;
public class Pessoa {
		private String nome;
		private int idade;
		public Pessoa(String nome, int idade) {
			super();
			this.nome = nome;
			this.idade = idade;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public void validarIdade(){
			if(idade <= 0 || idade > 120) {
				throw new IllegalArgumentException("Idade informada inválida!");
			}else {
				System.out.println("Idade válida!");
			}
		}
}
