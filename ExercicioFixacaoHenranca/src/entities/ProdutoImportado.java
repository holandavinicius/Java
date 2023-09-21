package entities;

public class ProdutoImportado extends Produto{

    private Double taxaCustomizada;
    public ProdutoImportado() {
    }

    public ProdutoImportado(String nome, Double preco, Double taxaCustomizada) {
        super(nome, preco);
        this.taxaCustomizada = taxaCustomizada;
    }

    @Override
    public final String etiqueta(){
        return (super.etiqueta() + "\n" + "Taxa Alfandega: " + this.taxaCustomizada +
                "\n" + "Preco Total: " + this.precoTotal());
    }
    public double precoTotal(){
        return(this.getPreco() + this.taxaCustomizada);
    }
}
