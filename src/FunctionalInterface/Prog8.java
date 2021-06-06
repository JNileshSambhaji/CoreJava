package FunctionalInterface;

import java.util.function.Supplier;

public class Prog8 {
    public static void main(String[] args) {
        Supplier<Integer> sup= ()-> {return 10; };

        Integer i=sup.get();
        System.out.println(i);
    }
}
