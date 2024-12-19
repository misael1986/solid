package I;

class Pinguino implements IAve,IAveNadadora {

    @Override
    public void comer() {
        System.out.println("Come peces");
    }

    @Override
    public void nadar() {
        System.out.println("Nada en agua Sub-zero");
    }
}
