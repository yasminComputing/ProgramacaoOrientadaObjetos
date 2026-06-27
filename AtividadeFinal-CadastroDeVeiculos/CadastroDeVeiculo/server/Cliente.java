package server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

import pkg.Veiculo;

public class Cliente{
		 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			try {
				Socket socket = new Socket("127.0.0.1",1234);
				System.out.println("Conexão estabelecida!");
				
				ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
				ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
				
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
				
				out.writeObject(v);
				
				String resposta = (String) in.readObject();
				
				System.out.println(resposta);
				
			}catch(Exception e ) {
				e.printStackTrace();
			}
		}
}