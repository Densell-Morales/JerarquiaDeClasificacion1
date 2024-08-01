
public class Main {
    public static void main(String[] args) {
        Computadora comp = new Computadora("Dell", "XPS 15", 16);
        DispositivoMovil movil = new DispositivoMovil("Samsung", "Galaxy S21", "Android");
        Electrodomestico electro = new Electrodomestico("LG", "Refrigerador", 150);
        Laptop laptop = new Laptop("HP", "Pavilion", 8, 1.5);
        Desktop desktop = new Desktop("Lenovo", "ThinkCentre", 16, true);
        Smartphone smartphone = new Smartphone("Apple", "iPhone 13", "iOS", true);
        Tablet tablet = new Tablet("Samsung", "Galaxy Tab S7", "Android", 11.0);
        Refrigerador refrigerador = new Refrigerador("LG", "InstaView", 150, 500);


        comp.encender();
        comp.ejecutarPrograma("Microsoft Word");
        comp.apagar();

        movil.encender();
        movil.instalarApp("WhatsApp");
        movil.apagar();

        electro.encender();
        electro.mostrarConsumo();
        electro.apagar();

        laptop.encender();
        laptop.ejecutarPrograma("Google Chrome");
        laptop.mostrarPortabilidad();
        laptop.apagar();

        desktop.encender();
        desktop.ejecutarPrograma("Adobe Photoshop");
        desktop.mostrarConfiguracion();
        desktop.apagar();

        smartphone.encender();
        smartphone.instalarApp("Instagram");
        smartphone.mostrarConectividad();
        smartphone.apagar();

        tablet.encender();
        tablet.instalarApp("Netflix");
        tablet.mostrarPantalla();
        tablet.apagar();

        refrigerador.encender();
        refrigerador.mostrarConsumo();
        refrigerador.mostrarCapacidad();
        refrigerador.apagar();

    }

}