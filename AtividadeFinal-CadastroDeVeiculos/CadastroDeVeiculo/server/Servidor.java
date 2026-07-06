package server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import pkg.Arquivo;
import pkg.Veiculo;

public class Servidor {
	public static void main(String[] args) {
		List<Veiculo> lista = new ArrayList<>();
		Arquivo arquivo = new Arquivo();
		
		lista = arquivo.lerArquivo();

	try {
		ServerSocket servidor = new ServerSocket(1234);
		System.out.println("Socket servidor criado com sucesso!");
		
		while(true) {	
		
			Socket cliente = servidor.accept();
			ObjectInputStream in = new ObjectInputStream(cliente.getInputStream());
			ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream());
			
			
		
			Veiculo v = (Veiculo) in.readObject();
			
			lista.add(v);
			arquivo.gravarArquivo(lista);
			
			out.writeObject("Cadastro de Veículo realizado!");
	
			in.close();
			out.close();
			cliente.close();
		} 	
	} catch(Exception e) {
		e.printStackTrace();
	}
	
	
		
		
		
	}
}
