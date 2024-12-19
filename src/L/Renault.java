package L;
import S.Carro;

public class Renault extends Carro {
    Renault(String marca)
    {
        this.marca=marca;
        this.nroAsientos=5;
    }

    public Renault(){}

    @Override
    public String getMarcaCarro() {
        return this.marca;
    }

    @Override
    public int getNroAsientos() {
        return this.nroAsientos;
    }
}
