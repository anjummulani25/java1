//java program to find sum of natural n nos

public class Naturalno
{
public static void main(String[] args)
{
int n=10;
int sum=(n*(n+1))/2;
System.out.println("sum="+sum);
for(int i=1;i<=50;i++)
{
sum=sum+i;
}
System.out.println("sum="+sum);

}
}