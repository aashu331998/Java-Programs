import static java.lang.System.out;
import java.util.Scanner;
class VarArg
{
static void set(int...ar)
{
java.util.Arrays.sort(ar);
for(int data:ar)
{
out.println(data);
}
}}
class Var
{
static public void main(String...arc)
{
Scanner sc=new Scanner(System.in);
VarArg.set( 2,3,6,8,1);
}
}