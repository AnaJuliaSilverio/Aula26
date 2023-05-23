package exercicio1;

public abstract class Carro {
    protected String marca;
    protected int ano;
    protected double valor;
    protected String cor;
    protected int numeroDasPortas;
    protected double velocidade;

    public Carro(int ano, double valor, String cor, int numeroDasPortas) {
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.numeroDasPortas = numeroDasPortas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDasPortas() {
        return numeroDasPortas;
    }

    public void setNumeroDasPortas(int numeroDasPortas) {
        this.numeroDasPortas = numeroDasPortas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public void partidaMotor() {
        System.out.println("Iniciando o motor minha velocidade está em "+velocidade);
    }
    public void freiar() {
            System.out.println("Freando... minha velocidade está em "+velocidade);
    }
    public void acelerar() {
        System.out.println("Acelerando... minha velocidade está em "+velocidade);
    }

    @Override
    public String toString() {
        return "Marca: " + marca+
                "\nAno:" + ano +
                "\nValor: " + valor +
                "\nCor: " + cor +
                "\nNumero De Portas: " + numeroDasPortas +
                "\nVelocidade Atual: " + velocidade +
                '\n';
    }
}
