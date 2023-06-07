public class ChainConst
{
ChainConst()
{
this(100);
System.out.println("default");
}
ChainConst(int x)
{
this(15,"tom");
System.out.println(x);
}
ChainConst(int a,String s)
{
System.out.println(a+""+s);
}
public static void main(String[] args)
{
ChainConst ch1=new ChainConst();
}
}