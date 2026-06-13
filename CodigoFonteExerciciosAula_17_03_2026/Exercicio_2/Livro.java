package pkg;

public class Livro {
		public String titulo;
		public String autor;
		public int anoPublicacao;
		public String genero;
		public boolean emprestado;
		
	public Livro() {
	}
	
	public String retornarTitulo() {
		return titulo;
	}
	public String retornarAutor() {
		return autor;
	}
	public int retornarAnoPublicacao() {
		return anoPublicacao;
	}
	public String retornarGenero() {
		return genero;
	}
	public boolean emprestar() {
		if (emprestado) {
			System.out.println("O livro já está emprestado!");
		}else {
			emprestado = true;
			System.out.println("Livro emprestado!");
			
		}
		return emprestado;
		
	}
	public boolean devolucao() {
		if(!emprestado) {
			System.out.println("O livro já está disponível!");
		}else {
			emprestado = false;
			System.out.println("Livro devolvido!");
			
		}
		return emprestado;
	}
	public void exibirDados() {
		System.out.println("Título do livro: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano de publicação: " + anoPublicacao);
		System.out.println("Gênero: " + genero);
		System.out.println("Emprestado: " + emprestado);
	}
}
