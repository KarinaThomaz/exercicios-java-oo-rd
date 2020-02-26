package exercicio02;

public class Gerente extends Funcionario{

    private double bonus;
    //4 - Implementar a classe Gerente.
    //
    //Um gerente é um funcionário que, além do salário mensal, recebe um bônus anual variável,
    // que é calculado com base num percentual de bônus anual sobre seu salário mensal.
    //
    //Sendo assim, o método que calcula o salário anual de um gerente deve retornar seu salário mensal vezes 13,
    // mais o bônus anual que é o percentual de bonus vezes seu salário mensal.
    // TODO: implemente o código desta classe


    public Gerente(String nome, double salarioMensal, double bonus) {
        super(nome, salarioMensal);
        this.bonus=bonus;
    }

    public void salarioAnual(double mensal, double bonus){
        double anual=(mensal*13)+bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
