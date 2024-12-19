package O;

public class Circulo implements FiguraGeometrica{

    private final double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return (Math.PI * Math.pow(radio, 2));
    }
}
