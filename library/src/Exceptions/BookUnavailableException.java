package Exceptions;

public class BookUnavailableException extends Exception {
    public BookUnavailableException (String msg){
        super(msg);
    }
}