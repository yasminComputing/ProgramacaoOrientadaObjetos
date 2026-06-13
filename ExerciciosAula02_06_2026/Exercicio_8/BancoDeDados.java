package pkg;

public class BancoDeDados implements AcessarDados{

	@Override
	public void conectar() {
		System.out.println("Conectado ao banco de dados.....");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectado do banco de dados.....");
		
	}

	@Override
	public void inserir() {
		System.out.println("Dado inserido no banco....");
		
	}

	@Override
	public void atualizar() {
		System.out.println("Dado atualizado.....");
		
	}

	@Override
	public void excluir() {
		System.out.println("Dado excluído....");
		
	}

}
