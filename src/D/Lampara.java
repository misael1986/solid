package D;

public class Lampara {
    private boolean status;

    public Lampara(){
        this.status = false;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus(){
        return this.status;
    }

    public void encender(){
        this.setStatus(new Boton(this).presionar());
    }

    public void apagar(){
        this.setStatus(new Boton(this).presionar());;
    }

}
