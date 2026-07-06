package pkg;

public class Casa {
	private double precoMetro;

	public double getPrecoMetro() {
		return precoMetro;
	}

	public void setPrecoMetro(double precoMetro) {
		this.precoMetro = precoMetro;
	}

	public double calcularPreco(int tamanho) {
		return tamanho * precoMetro;
	}
	
	public double calcularPreco(int tamanho, int quartos,double adicionalQuarto) {
		return calcularPreco(tamanho) + (quartos * adicionalQuarto); 
	}
	
}
