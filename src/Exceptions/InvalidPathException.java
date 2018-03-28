package Exceptions;

public class InvalidPathException extends Exception {
    String path = new String();

    public InvalidPathException(String path) {
        this.path = path;
    }

    public InvalidPathException(String message, String path) {
        super(message);
        this.path = path;
    }

    @Override
    public String toString() {
        return "InvalidPathException{" +
                "path='" + path + '\'' +
                '}';
    }
}
