package S;

public class Main {
    public static void main(String[] args) {

        Carro McQueen = new Carro() {
            @Override
           public String getMarcaCarro() {
                return "McLaren";
            }

            @Override
           public int getNroAsientos() {
                return 2;
            }
        };

        Peugeot P206= new Peugeot();
        P206.setMarca("Peugeot");
        P206.setNroAsientos(4);

        System.out.println(McQueen.getMarcaCarro() +" " + McQueen.getNroAsientos());
        System.out.println(P206.getMarcaCarro() +" " + P206.getNroAsientos());

        CarroDB saveCarro= new CarroDB();
        saveCarro.guardarCarroDB(P206);
        saveCarro.guardarCarroDB(McQueen);


    }
}