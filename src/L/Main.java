package L;

import java.util.ArrayList;
import java.util.List;
import S.Carro;

public class Main {
    public static void main(String[] args) {


        Renault r = new Renault("Renault Corsa");
        BMW bmw = new BMW();
        BYD byd = new BYD();
        List<Carro> carros = new ArrayList<>();


        carros.add(r);
        carros.add(bmw);
        carros.add(byd);
        carros.add(new Carro() {
            @Override
           public String getMarcaCarro() {
                return "Toyota";
            }

            @Override
           public int getNroAsientos() {
                return 3;
            }
        });

        imprimirCarros(carros);

    }

    public static void imprimirCarros(List<Carro> carros) {
        for (Carro carro : carros) {
            System.out.println(carro.getMarcaCarro() + " nro de sillas: " + carro.getNroAsientos());
        }
    }
}
