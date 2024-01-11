package studyguide1;

public class InvalidNumberException extends Exception{
    public String s;
    public InvalidNumberException(String s) throws InvalidNumberException {
        this.s=s;
    }

    public String getMessage(){
        return s;
    }
}

