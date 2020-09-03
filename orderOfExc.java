import static java.lang.System.out;
class Con1
{
Con1()
{
out.println("constructor is called");
}
static
{
out.println("static");
}
{
out.println("in");
}
}
class Main
{
static public void main(String...ar)
{
new Con1();
}
}