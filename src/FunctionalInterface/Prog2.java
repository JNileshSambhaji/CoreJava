package FunctionalInterface;
interface Interface2
{
    public void m1(int x);
}
public class Prog2 {
    public static void main(String[] args) {

        Interface2 i=(x)->System.out.println(x+x);

        i.m1(10);


    }
}
