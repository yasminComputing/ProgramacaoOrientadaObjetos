package pkg;

public class Time {
		public String nome;
		public int golsMarcados;
		public int golsSofridos;
		
	public Time(String nome,int marcados, int sofridos) {
		this.nome = nome;
		this.golsMarcados = marcados;
		this.golsSofridos = sofridos;
	}
	public int marcarGol() {
		return this.golsMarcados++;
	}
	public int sofrerGol() {
		return this.golsSofridos--;
	}
	public int saldoGols() {
		return golsMarcados - golsSofridos;
	}
	
	
	public String dados() {
		return "Nome do Time: " + nome + "\n"
				+ "Gols Marcados: " + golsMarcados + "\n"
				+ "Gols Sofridos: " + golsSofridos + "\n";
	}
	public String resultadoPartido() {
		if (saldoGols() >= 0) {
			return "Resultado da partida: Vitória!";
		}
		else if (saldoGols() == 0) {
				return "Resultado da partida: Empate!";
		}
			return "Resultado da partida: Derrota!";
	}
	
	
}
