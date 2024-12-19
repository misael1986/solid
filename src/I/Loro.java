package I;

class Loro implements IAve,IAveVoladora{

    @Override
    public void volar() {
        System.out.println("Quiere cacao");
    }

    @Override
    public void comer() {
        System.out.println("Come cacao y galleta saltina");
    }

}
