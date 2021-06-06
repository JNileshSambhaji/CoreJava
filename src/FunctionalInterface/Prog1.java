package FunctionalInterface;
interface Interface1
{
    public void m1();
}
public class Prog1 {
    public static void main(String[] args) {

        Interface1 i=()->System.out.println("Hello");

        i.m1();


    }
}
