package pkg;

public class Figura {
		protected String cor;
		protected String preenchido;
		
		public Figura(String cor, String preenchido) {
			this.cor = cor;
			this.preenchido = preenchido;
		}

		public void exibirInformacoes() {
			System.out.println("Cor: " + cor);
			System.out.println("Preenchido: " + preenchido);
		}
}
