package ADTs.QueueADT;
//hadassah //lab 8
public class MyQueueException extends Exception{
    String errMag;
    public MyQueueException(String error){
        errMag = error;
    }
    public String toString(){
        return errMag;
    }
}
