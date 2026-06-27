package pkg;

public class NotificacaoEmail extends Notificacao{
	
	@Override
	public void enviar() {
		System.out.println("Notificação por e-mail enviada....");
	}
	
	public void enviar(String destinatario1, String destinatario2) {
		System.out.println("Notificação por e-mail enviada para os destinários: " + destinatario1 + " e " + destinatario2);
	}
}
