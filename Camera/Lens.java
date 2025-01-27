package VSC.SWP5.Camera;
public class Lens {
    private String manufacturer;
    private int length; 

    public Lens(String manufacturer, int focalLength) {
        this.manufacturer = manufacturer;
        this.length = focalLength;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getlength() {
        return length;
    }
}
