//working with swing:  for dekstop based app
	import java.awt.Frame;
	import java.awt.Color;
	import javax.media.Player;
	import java.awt.Font;
	import java.awt.FlowLayout;
	import javax.media.Manager;
	import java.io.File;
	import java.awt.event.WindowListener;
	import java.awt.event.WindowEvent;
	import java.awt.Button;
	import java.awt.List;
	import java.awt.Checkbox;
	import java.awt.TextField;
	import java.awt.TextArea;	
	import java.awt.Choice;
	import java.awt.Label;


class  SwgDemo extends Frame implements WindowListener
{
	
	SwgDemo()
	{
                      
	//border layout to flow layout conversion

	setLayout(new FlowLayout());
	Button btn=new Button("Click");
	Label lb=new Label("Name");
	TextField tx=new TextField(10);
	TextArea ta=new TextArea(10,10);//h,w
	Checkbox cb1=new Checkbox("Female");
	Checkbox cb2=new Checkbox("Male");
	List lt=new List(2,true);
	lt.add("hardware");
	lt.add("software");
	lt.add("networking");
	lt.add("database");
	lt.add("testing");
	Choice ch=new Choice();
	ch.add("indore");
                      ch.add("select city");
	ch.add("bhopal");
	ch.add("dewas");
	

	add(cb1);
	add(cb2);
	add(lt);
	add(ch);
	add(tx);
	add(ta);
	add(lb);
	add(btn);//to display on window

	setVisible(true);
	setSize(500,500);//w,h
	setBackground(Color.pink);
	setForeground(Color.white);//font color
	setFont(new Font("arial",Font.BOLD+Font.ITALIC,20));
     // addWindowListener(this);//this:event on current window
	}
	static public void main(String...asdfsf)throws Exception
	{
	//Player play=Manager.createRealizedPlayer(new File("d:/rah/java8/swing/voice.mpg").toURI().toURL());
	//play.start();
	//Thread.sleep(10);
	new SwgDemo();	//anonymous
	//play.stop();
	}
	public void windowClosed(WindowEvent e)
	{
	}
	public void windowClosing(WindowEvent e)
	{
	System.exit(0);//it shut down JVM take o.oo1sec
	//dispose();//used to close only Frame/JFrame take 1 sec
	}
	public void windowActivated(WindowEvent e)
	{
	}
	public void windowDeactivated(WindowEvent e)
	{
	}
	public void windowIconified(WindowEvent e)
	{
	}
	public void windowDeiconified(WindowEvent e)
	{
	}
	public void windowOpened(WindowEvent e)
	{
	}

}