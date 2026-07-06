package pkg;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Arquivo arquivo = new Arquivo();
		List<Veiculo> lista = arquivo.lerArquivo();
		int opcao = 0;
		while(opcao != 5) {
			System.out.println();
			System.out.println("---- Cadastro de Veículos ---- ");
			System.out.println("1- Cadastrar Veículo");
			System.out.println("2- Alterar quilometragem do Veículo");
			System.out.println("3- Excluir veículo");
			System.out.println("4- Listar Veículos");
			System.out.println("5- Sair do Sistema");
			System.out.print("Opção: ");
			opcao = sc.nextInt();
			sc.nextLine();
			System.out.println("------------------------");
		switch(opcao){
			
		case 1:
			try {
				
				System.out.print("Placa do Veículo: ");
				String placa = sc.nextLine().toLowerCase();
				System.out.print("Modelo: ");
				String modelo = sc.nextLine();
				System.out.print("Marca: ");
				String marca = sc.nextLine();
				System.out.print("Ano de Fabricação: ");
				int ano = sc.nextInt();
				System.out.print("Quilometragem: ");
				double km = sc.nextDouble();
				Veiculo v = new Veiculo(placa,modelo,marca,ano,km);
				lista.add(v);
				arquivo.gravarArquivo(lista);
				
				
			}catch(Exception e) {
				System.out.println("Erro ao cadastrar veículo: " + e.getMessage());
			}
			break;
		case 2:
				if(lista.isEmpty()) {
					System.out.println("Não tem nenhum veículo cadastrado!");
					break;
				}
				System.out.println("Informe a placa do veículo que deseja mudar a km: ");
				String procurarP = sc.nextLine().toLowerCase();
				for(Veiculo veic : lista) {
					if(procurarP.equals(veic.getPlaca())) {
						System.out.println("Informe a nova Quilometragem: ");
						double atualizarkm = sc.nextDouble();
						veic.setQuilometragem(atualizarkm);
						arquivo.atualizar(lista);
						System.out.println("Alteração realizada!");
					}
				}
				break;
		case 3:
			if(lista.isEmpty()) {
				System.out.println("Não tem nenhum veículo cadastrado!");
				break;
			}
				System.out.println("Informe a placa do veículo que deseja excluir: ");
				String placaEx = sc.nextLine().toLowerCase();
				
				for(int i = 0; i < lista.size();i++) {
					if(placaEx.equals(lista.get(i).getPlaca())) {
						lista.remove(i);
						arquivo.atualizar(lista);
						System.out.println("Veículo removido!");
						break;
					}
				}
				break;
		
		case 4:
				if(lista.isEmpty()) {
				System.out.println("Não tem nenhum veículo cadastrado!");
				break;
				}
				System.out.println();
				System.out.println("Veículos Cadastrados: ");
				for(Veiculo v : lista) {
					System.out.println(v);
				}
				break;
		case 5:
				System.out.println("Programa Finalizado");
				break;
		default:
				System.out.println("Opção inválida!");
	
			}		
		
		}
		
	}
	
}
