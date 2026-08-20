public class Carro extends Veiculo {

    public int numPortas;

    public Carro(String modelo, int ano, int numPortas) {
        super(modelo, ano);
        this.numPortas = numPortas;
    }



    @Override
    public String ImprimirDetalhes() {
        return super.ImprimirDetalhes() + "\nNúmero de Portas: " + this.numPortas;
    }
}