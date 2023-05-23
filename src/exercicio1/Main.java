package exercicio1;

public class Main {
    public static void main(String[] args) {
        Renault carroRenault = new Renault(2020,50000,"Azul",4);
        Fiat carroFiat = new Fiat(2022,90000,"Preto",4);
        Hyundai carroHyndai = new Hyundai(2015,20000,"Branco",2);

        System.out.println(carroRenault.toString());
        carroRenault.partidaMotor();
        carroRenault.acelerar();
        carroRenault.freiar();
        System.out.println(" ");

        System.out.println(carroFiat.toString());
        carroFiat.partidaMotor();
        carroFiat.acelerar();
        carroFiat.freiar();
        System.out.println(" ");

        System.out.println(carroHyndai.toString());
        carroHyndai.partidaMotor();
        carroHyndai.acelerar();
        carroHyndai.freiar();
        System.out.println(" ");




    }
}