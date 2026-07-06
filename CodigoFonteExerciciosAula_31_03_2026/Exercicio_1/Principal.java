package pkg;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço: R$ ");
        float preco = sc.nextFloat();

        System.out.print("Quantidade em estoque: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println("Valor total em estoque: R$ " + produto.calcularValorTotalEstoque());

       
        System.out.print("Informe a quantidade que deseja adicionar: ");
        int qtdAdicionar = sc.nextInt();
        if (qtdAdicionar <= 0) {
            System.out.println("Não é possível adicionar essa quantidade");
        } else {
            produto.adicionarEstoque(qtdAdicionar);
            System.out.println("Novo estoque: " + produto.getQuantidade());
        }

       
        sc.nextLine(); 
        System.out.print("Deseja realizar uma venda? (sim/nao): ");
        String escolha = sc.nextLine().toLowerCase();

        if (escolha.equals("sim")) {
            System.out.print("Informe a quantidade que foi vendida: ");
            int quantidadeVenda = sc.nextInt();

            if (produto.vender(quantidadeVenda)) {
                System.out.println("Venda realizada com sucesso!");
            } else {
                System.out.println("Produtos insuficientes no estoque!");
            }

            System.out.println("Quantidade atual no estoque: " + produto.getQuantidade());
        }

        sc.close();
    }
}