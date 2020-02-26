package exercicio03;

// TODO: implemente o código-fonte de Produto.java
public abstract class Produto{
    //Todos os produtos possuem: código ID, nome, preço de venda e percentual de desconto aplicado no site
    private int id;
    private String nome;
    private double precoVenda;
    private double descontoSite;

    public Produto(int id, String nome, double precoVenda, double descontoSite) {
        this.id = id;
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.descontoSite = descontoSite;
    }
}

