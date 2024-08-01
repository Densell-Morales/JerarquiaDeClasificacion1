public class Tablet extends DispositivoMovil{
    double tamanoPantalla; // en pulgadas

    public Tablet(String marca, String modelo, String sistemaOperativo, double tamanoPantalla) {
        super(marca, modelo, sistemaOperativo);
        this.tamanoPantalla = tamanoPantalla;
    }

    public void mostrarPantalla() {
        System.out.println("La tablet " + marca + " " + modelo + " tiene una pantalla de " + tamanoPantalla + " pulgadas.");
    }
}
