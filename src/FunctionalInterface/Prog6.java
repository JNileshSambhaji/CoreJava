package FunctionalInterface;

import java.util.function.Function;

public class Prog6 {
    public static void main(String[] args) {
        Function<Integer,Double> f= x->x+10.4;

        Double i=f.apply(10);
        System.out.println(i);
    }

}
