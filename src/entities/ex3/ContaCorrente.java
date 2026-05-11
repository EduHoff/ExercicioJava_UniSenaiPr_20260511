package entities.ex3;

public class ContaCorrente extends ContaBancaria {

    private double taxaManutencao;

    public ContaCorrente(String titular, double saldo, String numeroConta, double taxaManutencao) {
        super(titular, saldo, numeroConta);
        this.taxaManutencao = taxaManutencao;
    }

    public void descontarTaxa() {
        sacar(taxaManutencao);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Taxa de manutenção: R$ " + taxaManutencao);
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }
}