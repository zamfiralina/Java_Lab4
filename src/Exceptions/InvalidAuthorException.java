package Exceptions;

public class InvalidAuthorException extends Exception{
    String author = new String();

    public InvalidAuthorException() {}

    public InvalidAuthorException(String author) {
        this.author = author;
    }

    public InvalidAuthorException(String author, String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "InvalidAuthorException{" +
                "author = '" + author + '\'' +
                '}';
    }
}
