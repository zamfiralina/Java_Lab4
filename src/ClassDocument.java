import Exceptions.InvalidAuthorException;
import Exceptions.InvalidPathException;
import Exceptions.InvalidYearException;

import java.io.File;
import java.io.Serializable;
import java.util.Calendar;


public abstract class ClassDocument implements Serializable{
    String title = new String();
    String path = new String();
    String author = new String();
    String year = new String();

    public ClassDocument() {}

    public ClassDocument(String title, String path, String author, String year) {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) throws InvalidPathException {
        this.path = path;
        File f = new File(path);
        if(!f.exists())
            throw new InvalidPathException(path);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws InvalidAuthorException {
        if (!author.matches("([A-Z][a-z]+\\s)?([A-Z].)?\\s[A-Z][a-z]+"))
            throw new InvalidAuthorException(author);

        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) throws InvalidYearException {
        try {
            Integer.parseInt(year);
            this.year = year;
        }
        catch (Exception e) {
            throw new InvalidYearException(year);
        }

        if (Integer.parseInt(year) < 0)
            throw new InvalidYearException(year);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (Integer.parseInt(year) > currentYear)
            throw new InvalidYearException(year);
    }

    public String getValue(String name) {
        switch (name) {
            case "title":
                return this.title;
            case "year":
                return this.year;
            case "author":
                return this.author;
            case "path":
                return this.path;
        }

        //if (!Boolean.valueOf(String.valueOf(name.compareTo("title"))))

        return "Invalid field name: " + name;
    }

    @Override
    public String toString() {
        return "\nDocument{" +
                "\ntitle = '" + title + '\'' +
                "\npath = '" + path + '\'' +
                "\nauthor = '" + author + '\'' +
                "\nyear = " + year +
                "}\n";
    }
}
