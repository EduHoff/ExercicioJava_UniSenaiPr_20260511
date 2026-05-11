package entities.ex2;

public class Desenvolvedor extends Funcionario {

    private String linguagem;

    public Desenvolvedor(String nome, String cpf, double salarioBase, String linguagem) {
        super(nome, cpf, salarioBase);
        this.linguagem = linguagem;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Linguagem principal: " + linguagem);
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}