public class Computadora extends DispositivoElectronico{

    int memoriaRAM; // en GB

    public Computadora(String marca, String modelo, int memoriaRAM) {
        super(marca, modelo);
        this.memoriaRAM = memoriaRAM;
    }

    public void ejecutarPrograma(String programa) {
        System.out.println("Ejecutando " + programa + " en la computadora " + marca + " " + modelo + ".");
    }
}

