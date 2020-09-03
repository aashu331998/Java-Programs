import static java.lang.System.out;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
class DateLogic
{
static public void main(String...ar)
{
Date date=new Date();
out.println(date);	
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YY");
out.println(sdf.format(date));

//documentation
DateFormat df =new DateFormat(); 
df.getDateInstance(DateFormat.LONG);
out.println(df.format(date));

DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
out.println(f.format(date));


DateFormat d = DateFormat.getDateInstance(DateFormat.MEDIUM);
out.println(d.format(date));
}
}