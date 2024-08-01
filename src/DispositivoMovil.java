public class DispositivoMovil extends DispositivoElectronico{
    String sistemaOperativo;

    public DispositivoMovil(String marca, String modelo, String sistemaOperativo) {
        super(marca, modelo);
        this.sistemaOperativo = sistemaOperativo;
    }

    public void instalarApp(String app) {
        System.out.println("Instalando " + app + " en el dispositivo móvil " + marca + " " + modelo + " con " + sistemaOperativo + ".");
    }
}


