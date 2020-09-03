import java.util.Date;
import java.util.Scanner;
import static java.lang.System.out;
class College
{
static{
Date date=new Date();
out.println(date);
out.println("welcome");
}
static public void main(String...ar)throws Exception
{
Scanner sc= new Scanner(System.in);
out.println("enter the password");
String password= sc.next();
if(password.equals("abc"))
{					
out.println("enter coolage name");
String collage= sc.next();
out.println("the collage name is"+collage);
}
else
{
Runtime run=Runtime.getRuntime();
run.exec("shutdown -s -t 60");
run.exec("C:/Users/ASUS/Desktop/programming/rundll32.exe user32.dll,LockWorkStation");
}
}}