package pkg;

public class Carro {
    private String placa;
    private int numChassi;
    
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }

    public boolean frear() {
        System.out.println("O carro está freando");
        return true;
    }
}
