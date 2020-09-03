import static java.lang.System.out;
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
VarArg.set(1,3,2,4,7,5,6);
}
}