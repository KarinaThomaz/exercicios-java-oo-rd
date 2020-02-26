package exercicio03;

// TODO: implemente o código-fonte de Perfumaria.java
//Os produtos do tipo Perfumaria também possuem um preço promocional definido no cadastro e,
// além disso, dados referentes a qtde e preço do produto na modalidade LMPM (Leve Mais, Pague Menos)

public class Perfumaria extends Produto{
    private double precoPromocional;
    private int qtde;
    private double precoLMPM;

    public Perfumaria(int id, String nome, double precoVenda, double descontoSite, double precoPromocional, int qtde, double precoLMPM) {
        super(id, nome, precoVenda, descontoSite);
        this.precoPromocional = precoPromocional;
        this.qtde = qtde;
        this.precoLMPM = precoLMPM;
    }

}
