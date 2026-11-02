package generics;

import java.util.ArrayList;
import java.util.Date;
//lab 2
public class DateClass {

    public static void main(String[] args) {
        ArrayList date = new ArrayList();// any object
        date.add(new Date());
        date.add(new String());

//        ArrayList<Date> dates = new ArrayList<>();
//        dates.add(new Date());
//        dates.add(new String());


//        ArrayList dates = new ArrayList();
//        dates.add(new Date());
//        Date date = dates.get(0);

        ArrayList <Date> dates = new ArrayList<>();
        dates.add(new Date());
        Date dateS = dates.get(0);
        System.out.println("First date in the list: " + dateS);


    }

}
