public class Refrigerador extends Electrodomestico{
    int capacidad; // en litros

    public Refrigerador(String marca, String modelo, int potencia, int capacidad) {
        super(marca, modelo, potencia);
        this.capacidad = capacidad;
    }

    public void mostrarCapacidad() {
        System.out.println("El refrigerador " + marca + " " + modelo + " tiene una capacidad de " + capacidad + " litros.");
    }
}
