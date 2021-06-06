package FunctionalInterface;

import java.util.function.Predicate;

public class Prog3 {
    public static void main(String[] args) {
        Predicate<String> p=x->x.length()>4;

        String str="Hello";
        boolean result=p.test(str);
        System.out.println(result);
    }
}
