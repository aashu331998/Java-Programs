import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import static java.lang.System.out;

class IOLogic
{
static public void main(String...ar)throws Exception	
{
out.println("enter data");
InputStreamReader isr= new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String data=br.readLine();

FileWriter fw= new FileWriter("file.txt");
fw.write(data);
fw.close();

FileReader fr= new FileReader("file.txt");
BufferedReader br1= new BufferedReader(fr);
String compdata= br1.readLine();
out.println(compdata);
}
}