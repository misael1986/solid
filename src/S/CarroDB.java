package S;

public class CarroDB {
    void guardarCarroDB(Carro carro){
        System.out.println("Guardando carro en BD "+ carro.getMarcaCarro() );

    }

    void leerCarroDB(Carro carro){
        System.out.println("Leyendo carro en BD"+ carro.getMarcaCarro());
    }
}
