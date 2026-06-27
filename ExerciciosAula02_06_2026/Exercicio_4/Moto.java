package pkg;

public class Moto extends Veiculo{

	public Moto(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}

	@Override
	public void Acelerar() {
		System.out.println("Moto acelerando.....");
	}

	@Override
	public void Frear() {
		System.out.println("Moto freando....");
	}

}
