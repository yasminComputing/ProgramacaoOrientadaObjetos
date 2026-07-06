package pkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> lista;

    public Biblioteca() {
        lista = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        lista.add(livro);
        salvarArquivo("livros", livro);
    }

    
    public void salvarArquivo(String nomeArquivo, Livro livro) {

        try {
            FileWriter arqw = new FileWriter(nomeArquivo + ".txt", true);
            BufferedWriter escritor = new BufferedWriter(arqw);

            escritor.write(livro.getTitulo() + "," +livro.getAutor() + "," +livro.getAnoPublicacao() + "," +livro.getEmprestado());

            escritor.newLine();

            escritor.close();
            arqw.close();

            System.out.println("Livro salvo com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Livro> carregarArquivo(String nomeArquivo) {

        lista.clear();

        try {

            FileReader arquivo = new FileReader(nomeArquivo + ".txt");
            BufferedReader leitor = new BufferedReader(arquivo);

            String linha;

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(",");

                Livro l = new Livro(
                        dados[0],
                        dados[1],
                        Integer.parseInt(dados[2]),
                        Boolean.parseBoolean(dados[3]));

                lista.add(l);
            }

            leitor.close();
            arquivo.close();

            System.out.println("Arquivo carregado!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void listarLivros() {

        if (lista.isEmpty()) {
            System.out.println("Nenhum livro cadastrado!");
            return;
        }

        for (Livro l : lista) {
            System.out.println(l);
            System.out.println("------------------------");
        }
    }

    public Livro consultarLivro(String titulo) {

        for (Livro l : lista) {

            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }

        }

        return null;
    }

    public String emprestarLivro(String titulo) {

        Livro livro = consultarLivro(titulo);

        if (livro == null) {
            return "Livro inexistente.";
        }

        if (livro.getEmprestado()) {
            return "Livro já emprestado.";
        }

        livro.setEmprestado(true);

        return "Empréstimo realizado com sucesso.";
    }
}