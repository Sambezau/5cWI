package VSC.SWP_OO.Shop;

public class Bike implements Product {
    private String style;
    private String name;
    private double price;
    
    public Bike(String style, String name, double price) {
        this.style = style;
        this.name = name;
        this.price = price;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setName(String name) {
    }

    @Override
    public String getName() {
            return name;
    }

    public double getPrice() {
        return price;
    }
     
}
