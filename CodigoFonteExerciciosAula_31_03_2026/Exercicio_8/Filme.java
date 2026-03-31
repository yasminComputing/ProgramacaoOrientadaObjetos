package pkg;

public class Filme {
		public String titulo;
		public int minutos;
		public int classificacaoEtaria;
	public Filme() {
		
	}
	public double converterDuracaoHoras() {
		return minutos / 60;
	}
	public boolean podeAssistir(int idade) {
		if (idade >= classificacaoEtaria) {
			return true;
		}
		return false;
	}
	public String descricaoFilme() {
		 return 
				 "Titulo: " + titulo + "\nDuração: " + converterDuracaoHoras() + "\nClassificação Etária: " + classificacaoEtaria;
	}
}
