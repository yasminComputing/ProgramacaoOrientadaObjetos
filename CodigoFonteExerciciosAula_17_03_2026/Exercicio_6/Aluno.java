package pkg;

public class Aluno {
		public String nome;
		public String matricula;
		public String dataDeNascimento;
		public int anoIngressoFaculdade;
		
		
		public Aluno(String nome,String matricula) {
			this.nome = nome;
			this.matricula = matricula;
		}
		public Aluno(String dataDeNascimento) {
			this.dataDeNascimento = dataDeNascimento;
		}
		public Aluno(String nome,String dataDeNascimento,int anoIngressoFaculdade) {
			this.nome = nome;
			this.dataDeNascimento = dataDeNascimento;
			this.anoIngressoFaculdade = anoIngressoFaculdade;
		}
}
