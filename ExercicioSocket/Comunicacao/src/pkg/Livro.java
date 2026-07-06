package pkg;

import java.io.Serializable;

public class Livro implements Serializable{
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private boolean emprestado;
	
	public Livro(String titulo, String autor, int anoPublicacao, boolean emprestado) {

		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.emprestado = emprestado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public boolean getEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	@Override
	public String toString() {
		return "Título: " + titulo + "| Autor: " + autor + "| Ano de publicação: " + anoPublicacao + "| Situação emprestado: " + emprestado;
	}
	
	
	
	

}
