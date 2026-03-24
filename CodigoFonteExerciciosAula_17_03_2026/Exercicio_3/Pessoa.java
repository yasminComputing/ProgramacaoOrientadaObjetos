package pkg;

public class Pessoa {
		public String nome;
		public String email;
		public String dataDeNascimento;
		public String endereco;
		public boolean admin;
		
		public Pessoa(){
			admin = false;
		}
		public String retornarEmail() {
			return email;
		}
		
		public boolean promoverAdmin() {
			if (admin) {
				System.out.println("O " + nome + " já é adminstrador");
			}else {
				admin = true;
				System.out.println("O " + nome + " é adminstrador");
			}
			
			return admin;
		}
		
}
