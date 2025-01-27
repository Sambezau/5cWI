package VSC.SWP5.Shop;
public class Car implements Product {
    private String color = "red";
    private String name = "Sportwagen";
    @SuppressWarnings("unused")
    private double price = 10000;


    public Car(String color, String name, double price) {
        this.color = color;
        this.name = name;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}