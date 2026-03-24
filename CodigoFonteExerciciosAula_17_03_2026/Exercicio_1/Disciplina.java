package pkg;

public class Disciplina {
	public String nome;
	public int cargaHoraria;
	public String nomeProfessor;
	
	public Disciplina(){
		this.nome = "Sem nome";
		this.cargaHoraria = 0;
		this.nomeProfessor = "Sem nome de professor";
	}
	public void atribuindoValores(String nome,int cargaHoraria,String nomeProfessor) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.nomeProfessor = nomeProfessor;
	}
	
	public String retornarNome() {
		return nome;
	}
	public int retornarCargaHorario() {
		return cargaHoraria;
	}
	public String retornarNomeProfessor() {
		return nomeProfessor;
	}
	public void exibirDadosOriginal() {
		System.out.println("Nome da disciplina: " + nome + "\nCarga horária: " + cargaHoraria + "\nNome do professor: " + nomeProfessor);
	}
}
