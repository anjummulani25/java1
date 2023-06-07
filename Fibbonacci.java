//java program to generate fibbonacci series
public class Fibbonacci
{
public static void main(String[] args)
{
int n1=0,n2=1,k,n=10,i;
System.out.print(n1+"  "+n2);
for(i=2;i<n;i++)
{
k=n1+n2;
System.out.print(" "+k);
n1=n2;
n2=k;

}

}
}