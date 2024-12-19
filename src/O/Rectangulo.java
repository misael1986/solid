package O;

public class Rectangulo implements FiguraGeometrica {

    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return this.base * this.altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}

