package exercicio1;

public class Fiat extends Carro{
    public Fiat(int ano, double valor, String cor, int numeroDasPortas) {
        super(ano, valor, cor, numeroDasPortas);
        this.marca = "Fiat";
        this.velocidade = 3;
    }

    @Override
    public void freiar() {
        velocidade-=6;
        super.freiar();
    }

    @Override
    public void acelerar() {
        velocidade+=12;
        super.acelerar();
    }
}
