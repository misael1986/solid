package S;

public class Peugeot extends Carro{

    public void setMarca(String marca){
        this.marca=marca;
    }

    public void setNroAsientos(int nro){
        this.nroAsientos=nro;
    }


    @Override
   public String getMarcaCarro() {
        return this.marca;
    }

    @Override
   public int getNroAsientos() {
        return this.nroAsientos;
    }
}
