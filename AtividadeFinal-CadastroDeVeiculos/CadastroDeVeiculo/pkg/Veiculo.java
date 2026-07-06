package pkg;

import java.io.Serializable;
import java.util.Objects;

public class Veiculo implements Serializable{
		private String placa;
		private String modelo;
		private String marca;
		private int anoFabricacao;
		private double quilometragem;
		public Veiculo(String placa, String modelo, String marca, int anoFabricacao, double quilometragem) {
			super();
			this.placa = placa;
			this.modelo = modelo;
			this.marca = marca;
			this.anoFabricacao = anoFabricacao;
			this.quilometragem = quilometragem;
		}
		public double getQuilometragem() {
			return quilometragem;
		}
		public void setQuilometragem(double quilometragem) {
			if(quilometragem < 0) {
				throw new IllegalArgumentException("A quilometragem não pode ser negativa!");
			}
			this.quilometragem = quilometragem;
		}
		public String getPlaca() {
			return placa;
		}
		public String getModelo() {
			return modelo;
		}
		public String getMarca() {
			return marca;
		}
		public int getAnoFabricacao() {
			return anoFabricacao;
		}
		@Override
		public String toString() {
			return "Placa: " + placa + ", Modelo: " + modelo + ", Marca: " + marca + ", Ano de Fabricação: " + anoFabricacao +  ", Quilometragem: " + quilometragem;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Veiculo other = (Veiculo) obj;
			return Objects.equals(placa, other.placa);
		}
		
		
		
}
