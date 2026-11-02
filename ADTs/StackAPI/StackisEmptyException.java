package ADTs.StackAPI;

//hadassah  //lab 2
public class StackisEmptyException extends Exception {
    String errorMag;
    public StackisEmptyException(String error){
        errorMag = error;
    }
    public String toString(){
        return("Customized Exception Object: " + errorMag);
    }
}
