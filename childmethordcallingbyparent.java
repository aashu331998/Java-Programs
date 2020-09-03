import static java.lang.System.out;
class A
{
void show()
{
out.println("class a");
}
}
class C extends A
{
void show()
{
out.println ("classc");
}}
class B extends A
{
void show()
{
out.println ("classb");
}
}
class Main1
{
static public void main(String...ar)
{
A ref[]={new B(), new C()};
ref[0].show();
ref[1].show();
}
}