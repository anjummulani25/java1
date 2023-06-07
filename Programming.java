public class Programming
{
String s1;
Programming()
{
s1="programming language";
}
Programming(String s2)
{
s1=s2;
}
public void print()
{
System.out.println("I love "+s1);
}
public static void main(String[] args)
{


Programming p1=new Programming();
Programming p2=new Programming("java");
p1.print();
p2.print();
}
}
