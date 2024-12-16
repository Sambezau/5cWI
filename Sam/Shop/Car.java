package VSC.SWP_OO.Sam.Shop;
public class Car implements Product {
    private String color = "red";
    private String name = "Sportwagen";

    public Car(String color, String name) {
        this.color = color;
        this.name = name;
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
}