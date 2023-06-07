public class Addamount
{
double amount=50*82.12;
float addamo;
Addamount()
{
addamo=0;
}
Addamount(double am)
{

addamo=am;
}
public void fun()
{
if(addamo!=0)
{
amount=(amount+addamo);
System.out.println(amount);
}
else
{
System.out.println("no amount added");
}
}
public static void main(String[] args)

{
Addamount a1=new Addamount();
Addamount a2=new Addamount(50);
a1.fun();
a2.fun();


}


}