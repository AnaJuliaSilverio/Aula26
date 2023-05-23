package exercicio1;

public class Renault extends Carro{
    public Renault(int ano, double valor, String cor, int numeroDasPortas) {
        super(ano, valor, cor, numeroDasPortas);
        this.marca = "Renault";
        this.velocidade = 0;
    }

    @Override
    public void freiar() {
        velocidade-=5;
        super.freiar();
    }

    @Override
    public void acelerar() {
        velocidade+=10;
        super.acelerar();
    }
}
