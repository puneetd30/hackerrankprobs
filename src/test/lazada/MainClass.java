package test.lazada;

class X
{
    int m = 1111;
 
    {
        m = m++;
 
        System.out.println(m);
    }
}
 
class Y extends X
{
    {
        System.out.println(methodOfY());
    }
 
    int methodOfY()
    {
        return m-- + --m;
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        Y y = new Y();
        int  m=12;
        m=m-- + --m;
        System.out.println(m);
    }
}