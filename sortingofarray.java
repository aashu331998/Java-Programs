import static java.lang.System.out;
import java.util.Scanner;
class Sortting1
{
static public void main(String...arc)
{
int ar[] = new int[5];
Scanner sc=new Scanner(System.in);
out.println("enter the elements");
for( int i=0; i<ar.length;i++)
{
ar[i]=sc.nextInt();
}
java.util.Arrays.sort(ar);
for(int data:ar)
{
out.println(data);
}
}
}