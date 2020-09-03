import javax.media.Player;
import javax.media.Manager;
import java.io.File;
import static java.lang.System.out;
class Var1
{
static void set(int...var)
{
for (int data:var)
{
out.println(data);
}
}
}
class Aaa
{
static public void main(String...ar)throws Exception //supports mpg avi wav
{
Player play=Manager.createRealizedPlayer(new File( " C:\\Users\\ASUS\\Desktop\\programming\\my.wav" ).toURI().toURL());
play.start();
Thread.sleep(5000);
play.stop();
Var1.set(1,2,3,4);
System.exit(0);
}
}