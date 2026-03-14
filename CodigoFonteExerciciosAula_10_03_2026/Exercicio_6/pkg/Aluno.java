package pkg;

public class Aluno {
	
	public String nome;
	public String matricula;
	public double nota1;
	public double nota2;
	public double nota3;
	
public double notaFinal() {
	return (nota1 + nota2 + nota3) / 3;
}
}
