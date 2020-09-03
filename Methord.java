import java.util.Scanner;
import java.util.Date;
import static java.lang.System.out;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
class Methord
{
public static void main(String...ar)throws Exception
{
Scanner sc= new Scanner(System.in);
String str= sc.next();
char ch= str.charAt(0);
char ch1= sc.next().charAt(0);
out.println(ch+"   "+ch1);
str.toUpperCase();   //inmutABLE
out.println(str);
out.println(str.toUpperCase());
out.println(str.replace('h','H'));
out.println(str.length());
JOptionPane.showMessageDialog(null,"hello");
}}