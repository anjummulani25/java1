public class Rectangle
{
int l,b;

Rectangle(int a,int z)
{
l=a;
b=z;
}

Rectangle()
{
l=3;
b=5;
}
Rectangle(int m)
{
l=m;
b=m;
}
public void area()
{
int area1=l*b;
System.out.println("area="+area1);
}
public static void main(String[] args)
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle(4,5);
Rectangle r3=new Rectangle(6);
r1.area();
r2.area();
r3.area();
}
}



