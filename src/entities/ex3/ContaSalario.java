package entities.ex3;

public class ContaSalario extends ContaBancaria {

    private String empresa;

    public ContaSalario(String titular, double saldo, String numeroConta, String empresa) {
        super(titular, saldo, numeroConta);
        this.empresa = empresa;
    }

    public void receberSalario(double valor) {
        depositar(valor);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Empresa: " + empresa);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}