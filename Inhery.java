import static java.lang.System.out;
import java.util.Scanner;
class Company
{
String cmpName;
final int MAX=100;
void set (String cmpName)
{
this.cmpName=cmpName;
}
void show()
{
out.println("parent class show");
out.println(cmpName);
}
}
class Manager extends Company
{

void ex()
{
super.set("ashu");
super.show();       //if we dont use super then then if child have supper it will run

}}
class Main
{
static public void main(String...ar)
{
Manager mn=new Manager();
mn.ex();
}
}