package pkg;

public class Principal {
	public static void main(String[] args) {
		
		BancoDeDados banco = new BancoDeDados();
		
		banco.conectar();
		banco.desconectar();
		banco.conectar();
		banco.inserir();
		banco.atualizar();
		banco.excluir();
		banco.desconectar();
	}
}
