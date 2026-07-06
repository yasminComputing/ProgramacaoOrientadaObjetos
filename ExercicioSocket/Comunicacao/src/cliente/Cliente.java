package cliente;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

import pkg.Livro;
import servidor.Requisicao;

public class Cliente {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            Socket socket = new Socket("localhost", 5846);

            ObjectOutputStream out= new ObjectOutputStream(socket.getOutputStream());
            out.flush();

            ObjectInputStream in =new ObjectInputStream(socket.getInputStream());

            System.out.println("=== MENU ===");
            System.out.println("1 - Consultar");
            System.out.println("2 - Emprestar");
            System.out.print("Opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            System.out.print("Título do livro: ");
            String titulo = sc.nextLine();

            Requisicao requisicao;

            if (opcao == 1) {

                requisicao = new Requisicao("CONSULTAR", titulo);
                out.writeObject(requisicao);

                Livro livro = (Livro) in.readObject();

                if (livro == null) {
                    System.out.println("Livro não encontrado!");
                } else {
                    System.out.println(livro);
                }

            } else if (opcao == 2) {

                requisicao = new Requisicao("EMPRESTAR", titulo);
                out.writeObject(requisicao);

                String resposta = (String) in.readObject();
                System.out.println(resposta);

            }

            socket.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}