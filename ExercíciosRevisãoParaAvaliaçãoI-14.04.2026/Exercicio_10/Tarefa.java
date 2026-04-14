package pkg;

public class Tarefa {
	public String descricao;
	public boolean concluida = false;
	public Tarefa() {
		
	}
	public void concluirTarefa(String finalizado) {
		if(finalizado.equals("S")) {
			concluida = true;
			System.out.println("Tarafa concluída: " + descricao);
		}else {
			concluida = false;
		}
	}
	public void exibirTarefa() {
		System.out.println("Descrição: " + descricao);
		if(concluida) {
			System.out.println("STATUS: concluída ");
		}else {
			System.out.println("STATUS: não concluída");
		}
		System.out.println("------------------------------");
	}
}
