import static java.lang.System.out;
import java.util.Scanner;
class Shuffle1
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
int temp,random;
for( int i=0; i<ar.length;i++)
{
random = (int)(Math.random()*(ar.length-1));
temp= ar[i];
ar[i]=ar[random];
ar[random]=temp;
}
for(int data:ar)
{
out.println(data);
}
}} 