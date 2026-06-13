package pkg;

public class Pessoa {
		private String mensagem;
		
		public String getMensagem() {
			return mensagem;
		}
		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
		public void falar(String mensagem) {
			System.out.println(mensagem);
		}
		
		public void falar(String mensagem, int repeticao) {
			while (repeticao > 0) {
			System.out.println(mensagem);
			repeticao--;
			}
		}
		
		
}
