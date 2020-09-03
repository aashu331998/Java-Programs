import java.util.Scanner;
import static java.lang.System.out;
class Javamarks extends RuntimeException
{
Javamarks ()
{}
}
class Cmarks extends RuntimeException
{
Cmarks()
{}
}
class Marks
{
static void getMarks()
{
Scanner sc= new Scanner(System.in);
out.println("enter java marks");
float javamarks= sc.nextFloat();
if(javamarks<0||javamarks>100)
{
Javamarks ex=new Javamarks();
throw ex;
}
else
{
out.println("thats good");
}
out.println("enter C marks");
float Cmarks= sc.nextFloat();
if(Cmarks<0||Cmarks>100)
{
Cmarks ex=new Cmarks();
throw ex;
}
else
{
out.println("thats good");
}
}
}

class MainClass
{
static public void main(String...ar)
{
Marks ref=new Marks();
try
{
ref.getMarks();
}
catch(Javamarks | Cmarks ex)
{
ex.printStackTrace();
out.println("marks not in range");
}
finally
{
out.println("ashu");
}
}
}