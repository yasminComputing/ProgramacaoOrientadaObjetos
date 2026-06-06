package pkg;

public class Computador {
		protected String marca;
		private String modelo;
		public Computador(String marca) {
			this.marca = marca;
			this.modelo ="Portátil";
		}
		public String exibeModelo() {
			return modelo;
		}
}
