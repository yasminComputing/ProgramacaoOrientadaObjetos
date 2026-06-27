package pkg;

public class ReservaDeHotel extends Reserva{

	@Override
	public void adicionar() {
		System.out.println("Reserva no hotel realizada!");
	}
	@Override
	public void cancelar() {
		System.out.println("Rserva no hotel cancelada!");
	}
}
