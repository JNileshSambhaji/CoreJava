package FunctionalInterface;

import java.util.function.Function;

public class Prog5 {
    public static void main(String[] args) {
        Function<Integer,Integer> f=x->x+x;

        Integer i=f.apply(10);
        System.out.println(i);
    }
}
