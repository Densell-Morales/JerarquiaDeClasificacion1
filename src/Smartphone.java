public class Smartphone extends DispositivoMovil {
    boolean tiene5G;

    public Smartphone(String marca, String modelo, String sistemaOperativo, boolean tiene5G) {
        super(marca, modelo, sistemaOperativo);
        this.tiene5G = tiene5G;
    }

    public void mostrarConectividad() {
        String conectividad = tiene5G ? "con 5G" : "sin 5G";
        System.out.println("El smartphone " + marca + " " + modelo + " está " + conectividad + ".");
    }
}
