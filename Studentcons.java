class Studentcons
{
String name;
Studentcons()
{
System.out.println("unknown");

name="unknown";
}
Studentcons(String a)

{
name=a;
}
public void print()
{
System.out.println(name);
}
public static void main(String[]args)
{
    Studentcons s1=new Studentcons();
    Studentcons s2=new Studentcons("sadaf");
s1.print();
s2.print();
}
}