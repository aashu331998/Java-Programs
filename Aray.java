import static java.lang.System.out;
import java.util.Scanner;
class Array
{

static public void main(String...ara)
{
 int ar[]=new int[3];
Scanner sc=new Scanner(System.in);
out.println("enter the elements");
for( int i=0; i<ar.length;i++)
{
ar[i]=sc.nextInt();
}
out.println("the elements are");
for(int i=0;i<ar.length;i++)
{
out.println(ar[i]);
}
}
}