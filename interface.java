import static java.lang.System.out;
class A
{
void show()
{
out.println("class a");
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
class C extends A implements B1
{
public void show1()
{
out.println("interface b1");
}
public void show()
{
super.show();
out.println("interface b");
}
void get()
{
out.println("class c");
}
}
class Main4
{
static public void main(String...ar)
{
C ref =new C();
ref.show();
ref.show1();
ref.get();
}
}