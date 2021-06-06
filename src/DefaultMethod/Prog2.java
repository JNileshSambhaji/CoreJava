package DefaultMethod;
interface  InterfaceDefault1
{
    public default  void m1()
    {
        System.out.println("InterfaceDefault1 Default Method");
    }
}
interface  InterfaceDefault2
{
    public default  void m1()
    {
        System.out.println("InterfaceDefault2 Default Method");
    }
}
class Test implements InterfaceDefault1,InterfaceDefault2{

    @Override
    public void m1() {
        InterfaceDefault1.super.m1();
    }
}
public class Prog2 {
    public static void main(String[] args) {
        Test t1=new Test();
        t1.m1();
    }
}
