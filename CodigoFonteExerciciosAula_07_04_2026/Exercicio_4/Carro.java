package pkg;

public class Carro {
		private String marca;
		private String modelo;
		private int ano;
		
	public Carro(String marca, String modelo, int ano) {
			this.marca = marca;
			this.modelo = modelo;
			this.ano = ano;
	}
	public String getsMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void exibirDetalhes() {
		System.out.println("Detalhes do Carro");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano do "+ marca + " : " + ano);
	}
}
