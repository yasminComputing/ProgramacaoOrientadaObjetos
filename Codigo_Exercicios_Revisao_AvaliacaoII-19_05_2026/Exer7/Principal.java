package pkg;

public class Principal {
	public static void main(String[] args) {
		NotificacaoEmail email = new NotificacaoEmail();
		
		email.enviar();
		
		email.enviar("luiz@gmail.com","thiago@gmail.com");
		
		NotificacaoApp app = new NotificacaoApp();
		app.enviar();
	}
}
