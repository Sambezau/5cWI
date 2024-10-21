import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<File> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void saveFile(File file) {
        files.add(file);
    }

    public List<File> getAllFiles() {
        return files;
    }


        
    
}
