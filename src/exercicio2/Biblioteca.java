package exercicio2;

public class Biblioteca {
    public String genero;
    public String nomeLivro;
    public String isbn;
    public String autora;

    public void registrarLivro(String isbn){
        this.isbn = isbn;
        System.out.println("O livro foi registrado com o isbn "+isbn);
    }
    public void registrarLivro(String isbn,String nomeLivro){
        this.isbn = isbn;
        this.nomeLivro = nomeLivro;
        System.out.println("O livro foi registrado com o isbn "+isbn+" e o nome "+nomeLivro);
    }

    public void registrarLivro(String isbn,String nomeLivro,String genero){
        this.isbn = isbn;
        this.nomeLivro = nomeLivro;
        this.genero = genero;
        System.out.println("O livro foi registrado com o isbn "+isbn+", o nome "+nomeLivro+" e o genero "+genero);
    }
    public void registrarLivro(String isbn,String nomeLivro,String genero,String autora){
        this.isbn = isbn;
        this.nomeLivro = nomeLivro;
        this.genero = genero;
        this.autora = autora;
        System.out.println("O livro foi registrado com todos os atributos");
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutora() {
        return autora;
    }

    public void setAutora(String autora) {
        this.autora = autora;
    }
}
