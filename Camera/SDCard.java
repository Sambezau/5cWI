package VSC.SWP5.Camera;
import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity; 
    private List<File> files;

    public SDCard(int capacity) {
        this.capacity = capacity * 1024; 
        this.files = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getUsedSpace() {
        int usedSpace = 0;
        for (File file : files) {
            usedSpace += file.getSize();
        }
        return usedSpace;
    }

    public boolean saveFile(File file) {
        int usedSpace = getUsedSpace();
        if (usedSpace + file.getSize() <= capacity) {
            files.add(file);
            return true;
        } else {
            return false;
        }
    }

    public List<File> getAllFiles() {
        return files;
    }
}
