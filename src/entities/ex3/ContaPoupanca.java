package entities.ex3;

public class ContaPoupanca extends ContaBancaria {

    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, String numeroConta, double taxaRendimento) {
        super(titular, saldo, numeroConta);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * (taxaRendimento / 100);
        depositar(rendimento);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Taxa de rendimento: " + taxaRendimento + "%");
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}