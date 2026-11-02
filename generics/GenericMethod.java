package generics;
//lab9
public class GenericMethod {

    public static <T> boolean isEqual(GenericTypeRaw <T> a,
                                      GenericTypeRaw <T> b) {
        return a.get().equals(b.get());
    }

    public static void main(String[] args) {

        GenericTypeRaw <String> a = new GenericTypeRaw<String>();
        a.set("Kean");

        GenericTypeRaw <String> b = new GenericTypeRaw<String>();
        b.set("Hadassah");

        boolean isEqual = GenericMethod.<String>isEqual(a, b);
        System.out.println(isEqual);

        System.out.println(isEqual = GenericMethod.isEqual(a, b));
    }
}
