package entities;

import java.util.Date;

public class ProdutoUsado extends Produto {

    private Date dataDeFabricacao;
    public ProdutoUsado() {
    }

    public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }
    @Override
    public final String etiqueta(){
        return (super.etiqueta() + "\n" + "Data Fabricacao: " + this.dataDeFabricacao);
    }
}
