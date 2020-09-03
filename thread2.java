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
out.println(name+"started");
try
{Thread.sleep(400);
}
catch(InterruptedException  e)
{
}
out.println(name+"ended");
}
}
class ThreadConcept1
{
static public void main(String...ar)
{
NewThread th1=new NewThread("first thread");
try
{
th1.join();
}
catch(InterruptedException  ex){};
NewThread th2= new NewThread("second thread");
}
}
 	