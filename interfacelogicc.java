import static java.lang.System.out;
import java.util.Scanner;
class A
{
void show()
{
out.println("classA");
}
}
interface B
{
void show();
}
interface B1 extends B
{
void show1();
}
class C extends A implements B1         //B,B1
{
public void show1()
{
out.println("interface bi");
}
public void show()
{
super.show();
out.println("interface B");
}
}
class Main3
{
static public void main(String...ar)
{
C ref= new C();
ref.show();
ref.show1();
}
}