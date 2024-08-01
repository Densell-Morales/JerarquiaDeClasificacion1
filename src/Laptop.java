public class Laptop extends Computadora{
    double peso; // en kg

    public Laptop(String marca, String modelo, int memoriaRAM, double peso) {
        super(marca, modelo, memoriaRAM);
        this.peso = peso;
    }

    public void mostrarPortabilidad() {
        System.out.println("La laptop " + marca + " " + modelo + " pesa " + peso + " kg.");
    }
}

