package VSC.SWP_OO.Sam.Shop;

public class Bike implements Product {
    private String style;
    private String name;
    
    public Bike(String style, String name) {
        this.style = style;
        this.name = name;
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
     
}
