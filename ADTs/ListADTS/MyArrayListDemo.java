package ADTs.ListADTS;
//hadassah //lab 4
public class MyArrayListDemo {
    public static void main(String[]args){
        MyList<String> list = new MyArrayList<>();

        list.add("america");
        System.out.println("(1) " + list);

        list.add(0, "canada");
        System.out.println("(2) " + list);

        list.add("russia");
        System.out.println("(3) " + list);

        list.add("france");
        System.out.println("(4) " + list);

        list.add(2, "germany");
        System.out.println("(5) " + list);

        list.add(5, "norway");
        System.out.println("(6) " + list);

        list.remove("canada");
        System.out.println("(7) " + list);

        list.remove(2);
        System.out.println("(8) " + list);

        list.remove(list.size()-1);
        System.out.println("(9) " + list);

        for(String s: list){
            System.out.println(s.toUpperCase() + " ");
        }

    }

}
