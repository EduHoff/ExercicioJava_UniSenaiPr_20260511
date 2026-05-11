package entities.ex1;

public class Moto extends Veiculo {

    private boolean temPartidaEletrica;

    public Moto(String marca, String modelo, int ano, boolean temPartidaEletrica) {
        super(marca, modelo, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Partida elétrica: " + temPartidaEletrica);
    }

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }
}
