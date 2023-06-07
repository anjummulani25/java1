//java program to calculate power of a no

public class Power
{
public static void main(String[] args)
{
int base=3,exp=5;
int pow=1;
while(exp!=0)
{
pow=base*pow;
--exp;
}
System.out.println(pow);
}
}