package venda;

import java.util.ArrayList;
import java.util.List;
import produto.Produtos;

public class Carrinho {
    private List<Produtos> listaDeProdutos;
    private double total;
    
    public Carrinho(List<Produtos> listaDeProdutos, double total) {
        this.listaDeProdutos = listaDeProdutos;
        this.total = total;
    }

    
}