package VSC.SWP_OO.Shop;

public class Main {
    public static void main(String[] args) {
        Gui gui = new Gui();
        
        // Beispiel-Autos erstellen und hinzufügen
        Car c1 = new Car("red", "BMW", 45000.0);
        Car c2 = new Car("Blue", "Mercedes", 55000.0);
        Bike b1 = new Bike("red", "Superbike", 2500.0);

        gui.addProduct(c1);
        gui.addProduct(c2);
        gui.addProduct(b1); 
        
        // GUI starten
        gui.run();
    }
}
