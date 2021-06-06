package FunctionalInterface;

import java.util.function.Predicate;

public class Prog4 {
    public static void main(String[] args) {
        Predicate<Integer> p= x->x>4;

        int a=10;
        boolean result=p.test(a);
        System.out.println(result);
    }
}
