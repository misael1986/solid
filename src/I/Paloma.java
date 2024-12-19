package I;

class Paloma implements IAve,IAveVoladora{

    @Override
    public void volar() {
        System.out.printf("Vuela y le da suerte a alguien en la cabeza");
    }

    @Override
    public void comer() {
        System.out.println("Come para recargar la suerte a alguien o a un carro recien lavado");
    }
}