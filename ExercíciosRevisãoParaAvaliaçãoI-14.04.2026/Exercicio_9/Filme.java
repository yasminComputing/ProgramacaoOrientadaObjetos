package pkg;

public class Filme {
	public String titulo;
	public String diretor;
	public int duracaoEmMinutos;
	public String genero;
	
	public Filme() {
		
	}
	public void exibirDetalhes(){
		System.out.println("Dados do Filme");
		System.out.println("Título: " + titulo);
		System.out.println("Diretor: "+ diretor);
		System.out.println("Duração em minutos: " + duracaoEmMinutos);
		System.out.println("Genêro: "+ genero);
	}
	
	public boolean ehLongo() {
		if(duracaoEmMinutos > 120) {
			return true;
		}
		return false;
	}
	
}
