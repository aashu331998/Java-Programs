import static java.lang.System.out;
abstract class A
{
abstract void show();
}
class B extends A
{
void show()
{
out.println("class b");
}
}
class Main3
{
static public void main(String...ar)
{
A ref =new B();
ref.show();
out.println("ashu");
}
}
