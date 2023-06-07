public class Reverseno
{
public static void main(String[] args)
{
int d, num=1234,rev=0;
while (num!=0)
{
d=num%10;
rev=rev*10+d;
num=num/10;

}
System.out.println(rev);
}
}