import java.io.Serializable;

public class Manual extends ClassDocument implements Serializable{

    public Manual() {}

    public Manual(String title, String path) {
        this.title = title;
        this.path = path;
    }

    public Manual(String title, String path, String author, String year) {
        super(title, path, author, year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "\nManual{" +
                "\ntitle='" + title + '\'' +
                "\npath='" + path + '\'' +
                "\nauthor='" + author + '\'' +
                "\nyear=" + year +
                "}\n";
    }
}
