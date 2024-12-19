package D;

public class Televisor implements ISwitch,IPotenciometro{
    double volumen=0;

    @Override
    public void encender() {
        System.out.println("Televisor encendido en X canal");
    }

    @Override
    public void apagar() {
        System.out.println("Televisor apagado en X canal");
    }

    @Override
    public void subir() {
        System.out.println("Volumen aumentado en el TV");
        volumen++;
    }

    @Override
    public void bajar() {
        System.out.println("Volumen aumentado en el TV");
        volumen--;
    }

    @Override
    public double retornarValor() {
        return this.volumen;
    }
}
