package produto;

public class Livro extends Produtos {
    private String autor;
    private String genero;
    
    public Livro(String nome, double preco, String autor, String genero) {
        super(nome, preco);
        this.autor = autor;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String descrever() {
        return "Autor: " + this.autor + ", Gênero: " + this.genero;
    }

    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", genero=" + genero + "]";
    }

}
