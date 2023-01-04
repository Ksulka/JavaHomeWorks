package homeWork_3_Exception.Model;

public class ParsingDataStringException extends Exception {
    String message;

    public ParsingDataStringException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
