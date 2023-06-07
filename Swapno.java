//java program to swap two nos
import java.util.*;

public class Swapno

{
public void swap1(int a, int b)
{



a=a+b;
b=a-b;
a=a-b;
System.out.println("nos after swap  "+a+" and  "+b);
}
public void swap2(int a,int b)
{

int c;
c=a;
a=b;
b=c;
System.out.println("nos after swap  "+a+" sand  "+b);
} 
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int x, y;
System.out.println("enter two no=");
 x=scan.nextInt();
 y=scan.nextInt(); 
Swapno s=new Swapno();
s.swap1(x,y);
s.swap2(x,y);

} 
}
