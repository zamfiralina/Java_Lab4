import java.awt.*;
import java.io.*;
import java.util.Vector;

public class Catalog implements Serializable{
    Vector<ClassDocument> documents = new Vector<>();

    public Catalog() {}

    public void add(ClassDocument document) {
        documents.add(document);
    }

    /*public StringBuilder listReturn() {
        StringBuilder str = new StringBuilder();
        for(ClassDocument document : documents) {
            str.append(document.toString());
        }

        return str;
    }*/

    /*public Vector<String> listReturn(ClassDocument document) {
        return null;
    }*/

    public void list() {
        StringBuilder str = new StringBuilder();
        for(ClassDocument document : documents) {
            str.append(document.toString());
        }

        System.out.println(str);
    }

    public void openDocument(ClassDocument document) {
        File file = new File(document.path);
        try {
            Desktop desktop = null;
            if (Desktop.isDesktopSupported()) {
                desktop = Desktop.getDesktop();
            }

            desktop.open(file);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void saveCatalog() {
        try{
            ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("catalog.txt"));

            objOut.writeObject(this);

            objOut.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadCatalog() {
        try{
            ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("catalog.txt"));

            //objIn.readObject();

            System.out.println(objIn);
            objIn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Vector<ClassDocument> getDocuments() {
        return documents;
    }

    public void setDocuments(Vector<ClassDocument> documents) {
        this.documents = documents;
    }
}
