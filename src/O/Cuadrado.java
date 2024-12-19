package O;

public class Cuadrado implements FiguraGeometrica{

    private final double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea(){
        return this.lado * this.lado;
    }
}
