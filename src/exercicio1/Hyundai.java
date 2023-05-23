package exercicio1;

public class Hyundai extends Carro{
    public Hyundai(int ano, double valor, String cor, int numeroDasPortas) {
        super(ano, valor, cor, numeroDasPortas);
        this.marca = "Hyundai";
        this.velocidade = 5;
    }

    @Override
    public void freiar() {
        velocidade-=2;
        super.freiar();
    }

    @Override
    public void acelerar() {
        velocidade+=15;
        super.acelerar();
    }
}
