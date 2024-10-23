import java.util.Date;

public class File {
    private int size;
    private String name;
    private Date date;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Date getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
