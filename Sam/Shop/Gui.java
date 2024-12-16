package VSC.SWP_OO.SWP_OO.Sam.Shop;

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

    private void showStockValue() {
        System.out.println("show stock value");
    }

    private void addProduct() {
        System.out.println("1 Add Car");
        System.out.println("2 Add Bike");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // Buffer leeren
        
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        
        switch(choice) {
            case 1:
                System.out.println("Enter color:");
                String color = scanner.nextLine();
                addProduct(new Car(color, name));
                break;
            case 2:
                System.out.println("Enter style:");
                String style = scanner.nextLine();
                addProduct(new Bike(style, name));
                break;
        }

        System.out.println("Product added successfully");
    }
}
