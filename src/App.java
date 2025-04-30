import produto.Livro;
import produto.Mouse;
import venda.Carrinho;
import produto.Produtos;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Produtos mouse1 = new Mouse("Mouse Gamer", 150.0, "Gamer", "Mouse com DPI ajustável");
        Produtos mouse2 = new Mouse("Mouse Sem Fio", 80.0, "Sem Fio", "Mouse compacto");
        
        Produtos livro1 = new Livro("O Senhor dos Anéis", 59.90, "J.R.R. Tolkien", "Fantasia");
        Produtos livro2 = new Livro("Harry Potter", 39.90, "J.K. Rowling", "Fantasia");

        Carrinho carrinho = new Carrinho();

        carrinho.vender(Arrays.asList(mouse1, mouse2, livro1, livro2));

        System.out.println("Carrinho após a primeira venda (lista de produtos):");
        System.out.println(carrinho.toString());

        Produtos livro3 = new Livro("A Origem", 49.90, "Dan Brown", "Suspense");
        carrinho.vender(livro3);  

        System.out.println("\nCarrinho após a segunda venda (produto único):");
        System.out.println(carrinho.toString());
    }
}
