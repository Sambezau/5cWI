package VSC.SWP5.Camera;
public class Main {
    public static void main(String[] args) {
        Camera camera = new Camera(1080, 1.2, "Schwarz", "Canon", "Japan");
        Lens lens = new Lens("Nikon", 50);
        SDCard sdCard = new SDCard(16); // 16 GB SD-Karte

        camera.attachLens(lens);
        camera.insertSDCard(sdCard);
       
        camera.setResolutionSetting("mittel");

        camera.takePicture("Bild1.jpg");
        

        System.out.println("Dateien auf der SD-Karte:");
        for (File file : sdCard.getAllFiles()) {
            System.out.println("Datei: " + file.getName() + ", Größe: " + file.getSize() + " MB, Datum: " + file.getDate());
        }
    }
}
