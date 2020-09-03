import static java.lang.System.out;
import java.util.Scanner;
class Company
{  
int regNum;
String cmpName;
long contactNo;
void set(int rNo, String cNm, long cNo)
{
regNum= rNo;
cmpName= cNm;
contactNo= cNo;
}

public String toString()
{
return regNum+"   "+cmpName+"  "+contactNo;
}
public void finalize()
{
out.println("memory is free");
}
}

class Oops
{
static public void main(String...ar)
{
while(true){
Company cmp= new Company();
cmp.set(12,"aro",111);
out.println(cmp);
System.gc();
}
}}