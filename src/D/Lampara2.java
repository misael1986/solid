package D;

public class Lampara2 implements ISwitch{

    private boolean status;

    public Lampara2(){
        this.status = false;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus(){
        return this.status;
    }


    @Override
    public void encender() {
        if (!this.getStatus()) {//Valida que está en False, osea Apagada
            this.setStatus(true);
        }
    }
        @Override
        public void apagar () {
            if (this.getStatus()) {//Valida que está en true, osea Encendida
                this.setStatus(false);
            }
        }
}