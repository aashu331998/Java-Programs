import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;     //markerinterface
import static java.lang.System.out;
class Company implements Serializable
{
int regNo;
String cmpName;
long contactNo;

void set (int  regNo, String cmpName, long contactNo)
{
this.contactNo= contactNo;
this.cmpName= cmpName;
 this.regNo= regNo;
}

void show()
{
out.println(regNo+"  "+cmpName+"  "+contactNo);
}

}
class Ashu
{
static public void main(String...ar)throws Exception
{
Company cmp= new Company();
cmp.set(11,"asefsdfg",34534556);
FileOutputStream fos=new FileOutputStream("binary.txt");     ///creat binar typeof file
ObjectOutputStream os = new ObjectOutputStream(fos);
os.writeObject(cmp);
os.close();

FileInputStream fis =new FileInputStream("binary.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
Company cmp1= new Company();
cmp1=(Company)ois.readObject(); //down casting: chid class type casting
cmp1.show();
} 
}