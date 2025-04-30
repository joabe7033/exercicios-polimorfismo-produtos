package produto;

public class Mouse extends Produtos {
    private String tipo;
    private String descricao;
    
    public Mouse(String nome, double preco, String tipo, String descricao) {
        super(nome, preco);
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String descrever() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return "Mouse [tipo=" + tipo + ", descricao=" + descricao + "]";
    }
}
