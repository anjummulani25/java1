//java program to find quotient and remainder
import java.util.*;
class Division1
{
public void operations()
{
int a, b;
float d;
System.out.println("enter two nos:");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();

d=a/b;
System.out.println("Quotient="+d);
d=a%b;
System.out.println("Remainder="+d);
}
public static void main(String[] args)
{
Division1 a1=new Division1();
a1.operations();
}
}