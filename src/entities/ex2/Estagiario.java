package entities.ex2;

public class Estagiario extends Funcionario {

    private int horasTrabalhadas;
    private double valorHora;

    public Estagiario(String nome, String cpf, double salarioBase, int horasTrabalhadas, double valorHora) {
        super(nome, cpf, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor da hora: R$ " + valorHora);
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}