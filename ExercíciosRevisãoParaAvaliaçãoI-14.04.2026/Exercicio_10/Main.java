package pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		List<Tarefa> lista = new ArrayList <>();
	
		System.out.println("Adionando tarefas.....");
		for(int i = 1; i<= 3;i++) {	
			Tarefa tarefa = new Tarefa();
			System.out.println("Dados da tarefa " + i);
			System.out.print("Descrição: ");
			tarefa.descricao = sc.nextLine();
			lista.add(tarefa);
		}
		System.out.println("Tarefas adicionadas......");
			
		System.out.println("Você concluiu alguma tarefa (s/n): ");
		String finalizado = sc.nextLine().toUpperCase();
		System.out.println("Quais tarefas? ");
		
		for(int i = 1; i<=3;i++) {
			System.out.println("Tarefa " + i + tarefa.descricao);
		}
		int qualTarefa = sc.nextInt();
		tarefa.concluirTarefa(finalizado);
		
		tarefa.exibirTarefa();
	
		
		
		sc.close();

	}

}
