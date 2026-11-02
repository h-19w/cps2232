package generics;
//lab 8
public class GenericTypeRaw <T>{
    private T t;

    public T get() {
        return this.t;
    }

    public void set(T tl) {
        this.t = tl;
    }
    public static void main(String[]args) {
        GenericTypeRaw <String> type = new GenericTypeRaw<>();
        type.set("Kean");
        System.out.println(type.get());

        GenericTypeRaw type1 = new GenericTypeRaw();
        type1.set("Hadassah");
        System.out.println(type1.get());
        type1.set(10);
        System.out.println(type1.get());


    }
}
