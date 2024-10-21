public class Camera {
    private int pixel;

    public Camera(int pixel) {
        this.pixel = pixel;
    }

    public int getPixel() {
        return pixel;
    }

    public String getPicture() {
        return "Das Bild wurde mit einer Kamera von " + pixel + " Pixel aufgenommen.";
    }

    public void printImages(int numberOfImages) {
        for (int i = 0; i < numberOfImages; i++) {
            System.out.println("Bild " + (i + 1) + ": " + getPicture());
        }
    }

    public static void main(String[] args) {
        Camera camera = new Camera(1080);
        camera.printImages(5);
    }
}
