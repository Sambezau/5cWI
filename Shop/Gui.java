package VSC.SWP_OO.Shop;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Gui {
    private List<Product> products = new ArrayList<Product>();
    private Scanner scanner = new Scanner(System.in);

   public void addProduct(Product product) {
    this.products.add(product);
   }
    
    public void run() {
        while(true) {
            System.out.println("1 Show Products");
            System.out.println("2 Show Stock value");
            System.out.println("3 Add Product");
            System.out.println("4 Exit");
            System.out.println("5 sort by price");
            





            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    showProducts();
                    break;
                case 2:
                    showStockValue();
                    break;
                case 3:
                    addProduct();
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    sortByPrice();
                    break;
                default:
                    break;
            }
        }   
    }
    
    private void showProducts() {
        System.out.println("show products");
        for(Product product : products) {
            System.out.println("Name: " + product.getName());
        }
    }

    

    private void addProduct() {
        System.out.println("1 Add Car");
        System.out.println("2 Add Bike");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // Buffer leeren
        
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter price:");
        double price = scanner.nextDouble();
        
        switch(choice) {
            case 1:
                System.out.println("Enter color:");
                String color = scanner.nextLine();
                addProduct(new Car(color, name, price));
                break;
            case 2:
                System.out.println("Enter style:");
                String style = scanner.nextLine();
                addProduct(new Bike(style, name, price));
                break;
        }
    }

    private void showStockValue() {
        double totalValue = 0;
        for(Product product : products) {
            totalValue += product.getPrice();
        }
        System.out.println("Gesamtwert des Lagers: " + totalValue + " €");
    }

    private void sortByPrice() {
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("Products sorted by price:");
        for(Product product : products) {
            System.out.println(product.getName() + ": " + product.getPrice() + " €");
        }
    }
}
