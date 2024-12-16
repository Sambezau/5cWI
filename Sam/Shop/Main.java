package VSC.SWP_OO.Sam.Shop;

public class Main {
    public static void main(String[] args) {
        Gui gui = new Gui();
        
        // Beispiel-Autos erstellen und hinzufügen
        Car c1 = new Car("red", "BMW");
        Car c2 = new Car("Blue", "Mercedes");
        Bike b1 = new Bike("red", "Superbike");

        gui.addProduct(c1);
        gui.addProduct(c2);
        gui.addProduct(b1); 
        
        // GUI starten
        gui.run();
    }
}
