import java.util.Scanner;
import static java.lang.System.out;
class Array2D
{

static public void main(String...as)
{
Scanner sc=new Scanner(System.in);
int row= sc.nextInt();
int coulem=sc.nextInt();
int a[][]= new int[row][coulem];
out.println("enter the elements");
for(int i=0;i<row;i++)
{
for(int j=0;j<coulem;j++)
{
a[i][j]=sc.nextInt();
}
}
for(int i=0;i<row;i++)
{
for(int j=0;j<coulem;j++)
{
out.print(a[i][j]);
}
out.println("  ");
}
}
}