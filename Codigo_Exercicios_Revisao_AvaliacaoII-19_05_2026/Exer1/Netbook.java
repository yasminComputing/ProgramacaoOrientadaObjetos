package pkg;

public class Netbook extends Computador{
	
		public Netbook(String marca) {
			super(marca);
		}
		public String exibeMarca() {
			return "Marcar: "+ marca;
		}
}
