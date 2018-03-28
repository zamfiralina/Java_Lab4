
import java.io.Serializable;

public class Book extends ClassDocument implements Serializable {
    String publisher = new String();

    public Book() {}

    public Book(String title, String path, String year) {
        this.title = title;

        try {
            this.setYear(year);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        try {
            this.setPath(path);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

    }

    public Book(String title, String path, String year, String author) {
        this.title = title;

        try {
            this.setYear(year);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        try {
            this.setAuthor(author);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        try {
            this.setPath(path);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public Book(String title, String author, String year,String publisher,String path) {
        this.title = title;
        this.publisher = publisher;

        try {
            this.setAuthor(author);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        try {
            this.setPath(path);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "\nBook{" +
                "\ntitle='" + title + '\'' +
                "\npath='" + path + '\'' +
                "\nauthor='" + author + '\'' +
                "\nyear=" + year +
                "\npublisher='" + publisher + '\'' +
                "}\n";
    }
}
