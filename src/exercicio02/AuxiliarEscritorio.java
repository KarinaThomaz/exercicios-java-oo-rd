package exercicio02;

public class AuxiliarEscritorio extends Funcionario{
    private double bonus;

    // 2 - Implementar a classe AuxiliarEscritorio.
    //
    //Um auxiliar de escritório é um funcionário que, além do salário mensal, recebe um bônus anual fixo.
    // Sendo assim, o método que calcula o salário anual de um auxiliar de escritório deve retornar seu salário mensal vezes 13,
    // mais o valor fixo de bônus anual.
    // TODO: implemente o código desta classe

    public AuxiliarEscritorio(String nome, double salarioMensal, double bonus) {
        super(nome, salarioMensal);
        this.bonus=bonus;
    }


    public void salarioAnual(double mensal, double bonus) {

        double anual=(mensal*13)+bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
