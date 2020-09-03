import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.util.Date;
import java.io.File;
import java.util.Scanner;

class Files
{
static public void main (String...ar)throws Exception
{
FileWriter fw= new FileWriter("C:/Users/ASUS/Desktop/programming/myfiles.txt",true );
fw.write("ashu");
fw.close();
}
}