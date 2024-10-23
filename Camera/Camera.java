import java.util.Date;

public class Camera {
    private int pixel;
    private double weight;
    private String color;
    private String manufacturerName;
    private String manufacturerCountry;
    private Lens lens;
    private SDCard sdCard;
    private String resolutionSetting; 

    public Camera(int pixel, double weight, String color, String manufacturerName, String manufacturerCountry) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.manufacturerName = manufacturerName;
        this.manufacturerCountry = manufacturerCountry;
    }

    public void attachLens(Lens lens) {
        this.lens = lens;
    }

    public void insertSDCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public void setResolutionSetting(String resolutionSetting) {
        this.resolutionSetting = resolutionSetting;
    }

    public void takePicture(String fileName) {
        if (sdCard == null) {
            System.out.println("Keine SD-Karte eingelegt.");
            return;
        }

        int fileSize = 0;
        switch (resolutionSetting) {
            case "klein":
                fileSize = 2048; 
                break;
            case "mittel":
                fileSize = 4096; 
                break;
            case "groß":
                fileSize = 6144; 
                break;
            default:
                System.out.println("Unbekannte Auflösungseinstellung.");
                return;
        }

        File file = new File();
        file.setName(fileName);
        file.setSize(fileSize);
        file.setDate(new Date());

        if (sdCard.getUsedSpace() + fileSize <= sdCard.getCapacity()) {
            if (sdCard.saveFile(file)) {
                System.out.println("Bild " + fileName + " wurde gespeichert.");
            } else {
                System.out.println("Fehler beim Speichern des Bildes.");
            }
        } else if (sdCard.getUsedSpace() < sdCard.getCapacity()) {
            System.out.println("Warnung: Speicherplatz wird knapp. Bild " + fileName + " wurde gespeichert.");
            sdCard.saveFile(file);
        } else {
            System.out.println("Kein Speicherplatz mehr vorhanden. Bild konnte nicht gespeichert werden.");
        }
    }
}
