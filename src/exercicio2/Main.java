package exercicio2;

public class Main {
    public static void main(String[] args) {
        Biblioteca registroLivro1 = new Biblioteca();
        Biblioteca registroLivro2 = new Biblioteca();
        Biblioteca registroLivro3 = new Biblioteca();
        Biblioteca registroLivro4 = new Biblioteca();

        registroLivro1.registrarLivro("978-65-89999-01-3");
        registroLivro2.registrarLivro("978-65-89999-01-3","Os 7 maridos de Evelyn Hugo");
        registroLivro3.registrarLivro("978-65-89999-01-3","É Assim que Acaba","Romance");
        registroLivro4.registrarLivro("978-65-89999-01-3","O poder do habito","Autoajuda"," Charles Duhigg ");


    }
}
