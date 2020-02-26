package exercicio03;

// TODO: implemente o código-fonte de OTC.java
public class OTC extends Produto{
    //Os produtos do tipo OTC possuem um preço promocional definido no cadastro
    private double precoPromocional;

    public OTC(int id, String nome, double precoVenda, double descontoSite, double precoPromocional) {
        super(id, nome, precoVenda, descontoSite);
        this.precoPromocional = precoPromocional;
    }
}
