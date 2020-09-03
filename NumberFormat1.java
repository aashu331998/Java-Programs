import java.util.Scanner;
import static java.lang.System.out;
import java.text.NumberFormat;

class Cast
{
static public void main(String...ar)
{
float PI=1.1111f;
NumberFormat nf = NumberFormat.getNumberInstance();
nf.setMaximumFractionDigits(2);
out.println(nf.format(PI));
 }}