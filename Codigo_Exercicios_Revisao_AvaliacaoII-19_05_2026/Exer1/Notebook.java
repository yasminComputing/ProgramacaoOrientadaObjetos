package pkg;

public class Notebook  extends Computador{
			public Notebook(String marca) {
				super(marca);
			}
			public String exibeMarca() {
				return "Marcar: "+ marca;
			}
}
