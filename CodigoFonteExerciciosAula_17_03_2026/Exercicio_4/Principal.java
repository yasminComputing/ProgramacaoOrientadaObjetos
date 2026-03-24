package pkg;

public class Principal {

    public static void main(String[] args) {

        ContaCorrente novaConta = new ContaCorrente();

        novaConta.definirSaldoInicial(1000);

        System.out.println("Conta corrente: ");
        System.out.println("Saldo na conta: R$ " + novaConta.saldo);

        float sacar = 500;

        if (novaConta.contaSacar(sacar) == true) {
            System.out.println("Saque de R$ " + sacar + " realizado com sucesso!");
        }

        float depositar = 50;

        if (depositar > 0) {
            novaConta.contaDepositar(depositar);
            System.out.println("Depósito de R$ " + depositar + " realizado!");
        }
        
        sacar = 600;
        if (novaConta.contaSacar(sacar) == true) {
            System.out.println("Saque de R$ " + sacar + " realizado com sucesso!");
        }else {
        	System.out.println("Não é possível realizar saque!");
        }


        System.out.println("Você tem de saldo R$ " + novaConta.saldo);
    }
}