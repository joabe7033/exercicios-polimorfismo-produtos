package venda;

import java.util.ArrayList;
import java.util.List;
import produto.Produtos;

public class Carrinho {
    private List<Produtos> listaDeProdutos;
    private double total;

    public Carrinho() {
        this.listaDeProdutos = new ArrayList<>();
        this.total = 0.0;
    }

    private void calcularVenda() {
        total = 0.0; 
        for (Produtos produto : listaDeProdutos) {
            total += produto.getPreco();
        }
    }

    public void vender(List<Produtos> produtos) {
        this.listaDeProdutos.addAll(produtos); 
        calcularVenda(); 
    }

    public void vender(Produtos produto) {
        this.listaDeProdutos.add(produto); 
        calcularVenda(); 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carrinho de Compras:\n");
        for (Produtos produto : listaDeProdutos) {
            sb.append(produto.toString()).append("\n");
        }
        sb.append("Total: R$ ").append(total);
        return sb.toString();
    }
}
