import static java.lang.System.out;
import java.util.Scanner;
abstract class A
{
abstract void show();
}
class B extends A
{
void show()
{
out.println("through b calling a");
}
}
class AbstractDemo
{
static public void main(String...ar)
{
A ref= new B();
ref.show();
}
}