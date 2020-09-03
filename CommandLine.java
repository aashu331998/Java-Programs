 import static java.lang.System.out;
class CommandLine
{
static public void main(String...ar)
{
byte first= Byte.parseByte(ar[0]);
short second= Short.parseShort(ar[1]);
int third= Integer.parseInt(ar[2]);

out.println(first+"   "+second+"   "+third);
}
}