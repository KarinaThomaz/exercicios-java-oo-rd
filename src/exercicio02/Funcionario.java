package exercicio02;

public abstract class Funcionario {
    //1 - Implementar a classe abstrata Funcionario.
    //
    //Um funcionário deve conter, pelo menos, os dados nome e salário mensal.
    // Também deve implementar um método para retornar o salário anual do funcionário.
    // A fórmula do salário anual é o valor do salário mensal vezes 13.
    // TODO: implemente o código desta classe
    private String nome;
    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public void salarioAnual(double mensal){
        this.salarioMensal=mensal;
        double anual=salarioMensal*13;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
