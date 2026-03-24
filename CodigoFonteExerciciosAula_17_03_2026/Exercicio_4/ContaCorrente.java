package pkg;

public class ContaCorrente {
    public float saldo;

    public void definirSaldoInicial(float saldo) {
        this.saldo = saldo;
    }

    public boolean contaSacar(float valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public float contaDepositar(float depositar) {
        if (depositar > 0) {
            saldo = saldo + depositar;
        } else {
            System.out.println("Valor de depósito inválido!");
        }
        return saldo;
    }
}