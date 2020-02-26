package exercicio02;

public class TecnicoManutencao extends Funcionario {
    private double insalubridade;
    private double bonus;
    //3 - Implementar a classe TecnicoManutencao.
    //
    //Um técnico de manutenção é um funcionário especial pois, além do salário mensal, ele recebe um adicional de insalubridade mensal,
    // que é um percentual calculado sobre seu salario mensal. Além disso, ele também recebe um bônus anual fixo, como o auxiliar de escritório.
    //
    //Sendo assim, o método que calcula o salário anual de um técnico de manutenção deve considerar os salários mensais que ele recebe,
    // mais os adicionais mensais de insalubridade e mais o valor fixo de bônus anual.
    // TODO: implemente o código desta classe

    public TecnicoManutencao(String nome, double salarioMensal, double insalubridade, double bonus) {
        super(nome, salarioMensal);
        this.insalubridade=insalubridade;
        this.bonus=bonus;
    }

    public void salarioMensal(double mensal, double bonus, double insalubridade){
        double anual=((mensal+insalubridade)*13)+bonus;
    }

    public double getInsalubridade() {
        return insalubridade;
    }

    public void setInsalubridade(double insalubridade) {
        this.insalubridade = insalubridade;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
