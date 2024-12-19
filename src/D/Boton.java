package D;

public class Boton {

    private Lampara lampara;

    public Boton(Lampara lampara) {
        this.lampara = lampara;
    }

    public boolean presionar(){
        if (this.lampara.getStatus()){//Valida que está en True, osea encendida

            System.out.println("La lampara fue apagada");
            
            return false;
        } else {
            System.out.println("La lampara fue encendida");
            return true;
        }
    }

}
