package pkg;

public class Carro extends Veiculo{

	public Carro(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}

	@Override
	public void Acelerar() {
		System.out.println("Carro acelerando....");
	}

	@Override
	public void Frear() {
		System.out.println("Carro freando.....");
	}

}
