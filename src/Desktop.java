public class Desktop extends Computadora{
    boolean tieneMonitor;

    public Desktop(String marca, String modelo, int memoriaRAM, boolean tieneMonitor) {
        super(marca, modelo, memoriaRAM);
        this.tieneMonitor = tieneMonitor;
    }

    public void mostrarConfiguracion() {
        String monitor = tieneMonitor ? "con monitor" : "sin monitor";
        System.out.println("La desktop " + marca + " " + modelo + " está configurada " + monitor + ".");
    }
}
