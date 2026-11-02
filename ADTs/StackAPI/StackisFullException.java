package ADTs.StackAPI;
//hadassah
public class StackisFullException extends Exception{
    String fullMag;
    public StackisFullException(String full){
        fullMag = full;
    }
    public String toString(){
        return("Customized Exception Object: " + fullMag);
    }
}
