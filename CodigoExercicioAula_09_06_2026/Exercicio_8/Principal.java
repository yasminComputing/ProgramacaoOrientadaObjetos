package pkg;

public class Principal {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Luiz",3000);
		
		Vendedor vendedor = new Vendedor("Luiza",2500);
		
		gerente.dados();
		System.out.println("Salário com bônus 20%: R$ " + gerente.calcularSalario());

		System.out.println("----------------");
	
		vendedor.dados();
		System.out.println("Salário com bônus 10%: R$ " + vendedor.calcularSalario());
	
	}
}
