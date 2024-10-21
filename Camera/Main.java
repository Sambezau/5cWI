public class Main {
    public static void main(String[] args) {
        Camera camera = new Camera(1080);
        SDCard sdCard = new SDCard(64);

        for (int i = 1; i <= 3; i++) {
            File file = new File();
            file.setName("Bild" + i + ".jpg");
            file.setSize(5); // Beispiel: Größe jedes Bildes ist 5 MB
            sdCard.saveFile(file);
        }

        System.out.println("Gespeicherte Dateien auf der SD-Karte:");
        for (File file : sdCard.getAllFiles()) {
            System.out.println("Datei: " + file.getName() + ", Größe: " + file.getSize() + " MB");
        }
    }
}
