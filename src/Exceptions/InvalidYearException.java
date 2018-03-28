package Exceptions;

public class InvalidYearException extends Exception {
    private String year;

    public InvalidYearException(String year) {
        this.year = year;
    }

    public InvalidYearException(String year, String message) {
        super(message);
        Integer.parseInt(year);
    }

    @Override
    public String toString() {
        return "ExceptionInvalidYear: year = " + this.year + "\n";
    }
}
