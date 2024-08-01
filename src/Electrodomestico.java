public class Electrodomestico extends DispositivoElectronico{
    int potencia; // en vatios

    public Electrodomestico(String marca, String modelo, int potencia) {
        super(marca, modelo);
        this.potencia = potencia;
    }

    public void mostrarConsumo() {
        System.out.println("El electrodoméstico " + marca + " " + modelo + " consume " + potencia + " vatios.");
    }
}
