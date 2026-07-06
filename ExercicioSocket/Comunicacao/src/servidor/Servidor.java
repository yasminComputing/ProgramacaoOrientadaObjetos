package servidor;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import pkg.Biblioteca;
import pkg.Livro;

public class Servidor {

    public static void main(String[] args) {

        try {

            Biblioteca biblioteca = new Biblioteca();
            biblioteca.carregarArquivo("livros");
            

            ServerSocket servidor = new ServerSocket(5846);

            System.out.println("Servidor iniciado...");

            while (true) {

                Socket socket = servidor.accept();

                ObjectOutputStream out= new ObjectOutputStream(socket.getOutputStream());
                out.flush();

                ObjectInputStream in =new ObjectInputStream(socket.getInputStream());

                Requisicao requisicao = (Requisicao) in.readObject();

                String operacao = requisicao.getOperacao();

                if (operacao.equalsIgnoreCase("CONSULTAR")) {

                    Livro livro =biblioteca.consultarLivro(requisicao.getTitulo());

                    out.writeObject(livro);

                } else if (operacao.equalsIgnoreCase("EMPRESTAR")) {

                    String resposta =biblioteca.emprestarLivro(requisicao.getTitulo());

                    out.writeObject(resposta);
                }

                socket.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}