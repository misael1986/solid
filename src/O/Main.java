package O;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    Cuadrado cuadrado= new Cuadrado(4.6);
    Rectangulo rectangulo= new Rectangulo(6.9, 4.0);
    Circulo circulo= new Circulo(5.0);

    List<FiguraGeometrica> lista= new ArrayList<>();
    lista.add(cuadrado);
    lista.add(rectangulo);
    lista.add(circulo);

    for (FiguraGeometrica figura: lista) {
        System.out.println(figura.calcularArea());
    }

    }
}