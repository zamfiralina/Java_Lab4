import Exceptions.InvalidYearException;

import java.io.Serializable;

public class Article extends ClassDocument implements Serializable{
    String journal = new String();

    public Article() {}

    public Article(String title, String path, String year) {
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

    public Article(String title, String path, String year, String author) {
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

    public Article(String title, String author, String year,String journal,String path) {
        this.title = title;
        this.journal = journal;
        this.path = path;

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

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "\nArticle{" +
                "\ntitle='" + title + '\'' +
                "\npath='" + path + '\'' +
                "\nauthor='" + author + '\'' +
                "\nyear=" + year +
                "\njournal='" + journal + '\'' +
                "}\n";
    }
}
