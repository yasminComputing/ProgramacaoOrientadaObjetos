package pkg;

public class Usuario {
	private String nomeUsuario;
	private String senha;
	private boolean logado;
	
	public Usuario(String usuario,String senha) {
		this.nomeUsuario = usuario;
		this.senha = senha;
		this.logado = false;
	}
	
	public void login(String usuario,String senha) {
		if(usuario.equals(this.nomeUsuario) && senha.equals(this.senha)) {
			this.logado  = true;
			System.out.println("Login efetuado com sucesso!");
		}
		else {
			this.logado = false;
			System.err.println("Errro ao efetuar login");
		}
	}
	public void logout() {
		this.logado  = false;
	}
	
	public void exibirStatus() {
		if(this.logado) {
			System.out.println("STATUS: Usuário " + nomeUsuario + " logado!");
			exit(0);
		}
		else {
			System.err.println("STATUS: Nenhum usuário logado!");
		}
	}

	private void exit(int i) {
		// TODO Auto-generated method stub
		
	}
}
