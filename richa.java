import java.util.Scanner;
import static java.lang.System.out;
import java.text.NumberFormat;

class Richa
{
static public void main(String...ar)
{
Scanner sc=new Scanner(System.in);
out.println("enter the element");
int count=0,i,n,a3=0,a1=0,a2=1,j,f,fact;
n=sc.nextInt();
if(n==1)
{
out.println("1");
}
if(n%2 != 0)
{
for(i=1;i<=n/2;i++)
{ a3=a1+a2;
 a1=a2;
a2=a3;
}
out.println(a3);
}
 if(n%2==0)
{
  for(j=1;count !=(n/2);j++)
  {
     fact=0;
    for (f=1;f<=j;f++)
  {
   if(j%f==0)
   {
      fact++;
 }
}
 if(fact==2)
count++;
}

out.println(j-1);
}}}