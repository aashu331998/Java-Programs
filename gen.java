import static java.lang.System.out;
import java.util.Scanner;
class Gen<kuch,aur>
{
kuch var1;
aur var2;
void set (kuch var1, aur var2)
{
this.var1=var1;
this.var2=var2;
show();
}
void show()
{
out.println(var1+"  "+var2);
}
}
class See
{
static public void main(String...ar)
{
Gen <Integer,Integer>gen=new Gen<Integer,Integer>();
gen.set(3,4);
}
}