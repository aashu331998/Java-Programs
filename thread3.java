import static java.lang.System.out;
class NewThread extends Thread
{
String name;
NewThread(String name)
{
this.name=name;
start();
}

public void run()
{
Operationss.set(name);
}
}
class Operationss
{
synchronized static void set(String name)
{
out.println(name+"srtarted");
try 
{
Thread.sleep(100);
}
catch( InterruptedException e )
{
}
out.println(name+"ended");
}
}


class ThreadConcept3
{
static public void main(String...ar)
{
NewThread th1=new NewThread("first thread");

NewThread th2= new NewThread("second thread");
}
}
 	