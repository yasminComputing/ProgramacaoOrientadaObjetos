package pkg;

public class Livro {
		protected String titulo;
		protected String autor;
		protected int anoLancamento;
		public Livro(String titulo, String autor, int anoLancamento) {
			this.titulo = titulo;
			this.autor = autor;
			this.anoLancamento = anoLancamento;
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
		public int getAnoLancamento() {
			return anoLancamento;
		}
		public void setAnoLancamento(int anoLancamento) {
			this.anoLancamento = anoLancamento;
		}
		
		public String dados() {
			return "Título: " + titulo
					+"\nAutor: " + autor
					+ "\nAno de Lançamento: " + anoLancamento;
		}
}
