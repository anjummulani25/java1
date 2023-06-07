import java.util.*;
class Operation
{
public void operations()
{
int a, b,c;
float d;
System.out.println("enter two no to add:");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=a+b;
System.out.println("Addition of two no="+c);
c=a-b;
System.out.println("Subtraction of two no="+c);
c=a*b;
System.out.println("Multiplication of two no="+c);
d=a/b;
System.out.println("Division of two no="+d);
}
public static void main(String[] args)
{
Operation a1=new Operation();
a1.operations();
}
}