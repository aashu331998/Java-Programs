import java.io.*;
import java.net.*;
public class Myclient
{
	public static void main(String[] args) {
		try{
System.out.println("aasshu11");
			Socket s=new Socket("192.168.43.199",6666);
			DataOutputStream dos=new DataOutputStream( s.getOutputStream());
			dos.writeUTF("Hello Servlet");
			dos.flush();
			dos.close();
			s.close();



		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}