import Exceptions.InvalidAuthorException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException, NoSuchFieldException, InvalidAuthorException {
        Book b1 = new Book("Algoritmi-Genetici", "C:\\Users\\alina\\Desktop\\Facultate\\AnII\\Algoritmi-genetici-ID.pdf", "2000","H. Luchian");

        //add book Algoritmi-Genetici C:\\Users\\alina\\Desktop\\Facultate\\AnII\\Algoritmi-genetici-ID.pdf 2000 H. Luchian

        Catalog catalog = new Catalog();
        catalog.add(b1);
        //catalog.add (new Book("The Art of Computer Programming", "d:\\books\\programming\\tacp.ps", "1997", "Donald E. Knuth"));
        //catalog.add (new Article("Mastering the Game of Go without Human Knowledge", "d:\\articles\\AlphaGo.pdf", "2017", "David Silver"));
        //catalog.add (new Manual("Cookbook", "d:\\stuff\\cookbook.doc"));

        //catalog.openDocument(b1);

        //catalog.saveCatalog();

        //catalog.loadCatalog();

        catalog.list();

        String [] commandLine;
        StringBuilder authorName = new StringBuilder();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            //System.out.print("\nshell>\n\t\t");
            commandLine = console.readLine().split("\\s");

            switch (commandLine[0]) {
                case "add":
                    switch (commandLine[1]) {
                        case "book":
                            Book book = new Book(commandLine[2], commandLine[3], commandLine[4]);
                            System.out.println("Titlu: " + commandLine[2] + "\nPath: " + commandLine[3] + "\nYear: " + commandLine[4]);
                            for (int i = 5; i < commandLine.length; i++)
                                authorName.append(commandLine[i]).append(" ");
                            System.out.println("Author: " + authorName);
                            book.setAuthor(authorName.toString().trim());
                            AddCommand addBook = new AddCommand(book);
                            break;

                        case "article":
                            Article article = new Article(commandLine[2], commandLine[3], commandLine[4]);
                            System.out.println("Titlu: " + commandLine[2] + "\nPath: " + commandLine[3] + "\nYear: " + commandLine[4]);
                            for (int i = 5; i < commandLine.length; i++)
                                authorName.append(commandLine[i]).append(" ");
                            System.out.println("Author: " + authorName);
                            AddCommand addArticle = new AddCommand(article);
                            break;

                        case "manual":
                            Manual manual = new Manual(commandLine[2], commandLine[3]);
                            AddCommand addManual = new AddCommand(manual);
                            break;
                    }
                    break;

                case "list":
                    ListCommand listCommand = new ListCommand();
                    break;

                case "save":
                    SaveCommand saveCommand = new SaveCommand();
                    break;

                case "load":
                    LoadCommand loadCommand = new LoadCommand();
                    break;

                case "play":
                    PlayCommand playCommand = new PlayCommand("C:\\Users\\alina\\Desktop\\Facultate\\AnII\\Algoritmi-genetici-ID.pdf");
                    break;

                case "report":
                    if (!Boolean.valueOf(String.valueOf(commandLine[1].compareTo("html")))) {
                        ReportHtml reportHtml = new ReportHtml();
                    }
            }


        }


}

}
