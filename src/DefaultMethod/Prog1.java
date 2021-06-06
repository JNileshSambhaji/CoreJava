package DefaultMethod;
interface  InterfaceDefault
{
    public void m1();

    public default  void m2()
    {
        System.out.println("Default Method");
    }
}

class  Test1 implements  InterfaceDefault
{
    public void m1()
    {
        System.out.println("Test1 M1 Method");
    }
}
class Test2 implements InterfaceDefault
{
    public void m1()
    {
        System.out.println("Test2 M1 Method");
    }
    public  void m2()
    {
        System.out.println("Test2 Override Default Method");
    }
}
public class Prog1 {
    public static void main(String[] args) {
          Test1 test1=new Test1();
          test1.m1();;
          test1.m2();

          Test2 test2=new Test2();
          test2.m1();
          test2.m2();
    }
}
