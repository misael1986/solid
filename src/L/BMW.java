package L;

import S.Carro;

public class BMW extends Carro {

    public BMW(){

        this.marca="BMW";
    }
    @Override
    public String getMarcaCarro() {
        return this.marca;
    }

    @Override
    public int getNroAsientos() {
        return 4;
    }
}
