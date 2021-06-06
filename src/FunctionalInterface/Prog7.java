package FunctionalInterface;

import java.util.function.Consumer;

public class Prog7 {
    public static void main(String[] args) {
        Consumer<String> con=x-> System.out.println(x);

        String str="Hello";
        con.accept(str);
    }
}
