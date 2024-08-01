public class DispositivoElectronico {
    String marca;
    String modelo;
    String color;

    public DispositivoElectronico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = "#000000";
    }

    public void encender() {
        System.out.println("El dispositivo " + marca + " " + modelo + " está encendido.");
    }

    public void apagar() {
        System.out.println("El dispositivo " + marca + " " + modelo + " está apagado.");
    }
}

