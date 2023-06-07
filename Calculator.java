public class Calculator
{
public void sum(int x,int y)
{
System.out.println(x+y);
}
public void sum(double x,double y)
{
System.out.println(x+y);
}
public static void main(String[] args)
{
Calculator c=new Calculator();
c.sum(10,20);
c.sum(11.2,12.3);
}
}