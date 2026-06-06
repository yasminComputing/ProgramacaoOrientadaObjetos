package pkg;

public class ReservaDeVoo extends Reserva{

	public void adicionar(String tipo) {
		System.out.println("Reserva de voo realizada na classe: " + tipo);
	}
	@Override
	public void cancelar() {
		System.out.println("Reserva de voo cancelada!");
	}
}
	


