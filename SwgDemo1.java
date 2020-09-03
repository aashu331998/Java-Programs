
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
	import java.awt.event.WindowAdapter;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseMotionAdapter;
	import java.awt.TextField;
	import java.awt.TextArea;	
	import java.awt.Choice;
	import java.awt.Label;


class  SwgDemo1 extends Frame  
{
	
	
	
	SwgDemo1()
	{
	//border layout to flow layout conversion

	setLayout(new FlowLayout());
	Button btn=new Button("Click");
	Label lb=new Label("Name");
	TextField tx=new TextField(20);
	TextArea ta=new TextArea(10,10);//h,w
	Checkbox cb1=new Checkbox("Female");
	Checkbox cb2=new Checkbox("Male");
	List lt=new List(3,true);
	lt.add("hardware");
	lt.add("software");
	lt.add("networking");
	lt.add("database");
	lt.add("testing");
	Choice ch=new Choice();
	ch.add("select city");
	ch.add("indore");
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
	setForeground(Color.blue);//font color
	setFont(new Font("arial",Font.BOLD+Font.ITALIC,20));
	
	
	
	addWindowListener(     new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{
		dispose();//used to close only Frame/JFrame
		}	
	}
	);
	addMouseListener(new MouseAdapter()
	{
		public void mouseClicked(MouseEvent e)

		{
		//	setBackground(Color.black);
		float red=(float)Math.random();//0.0 to 1.0
		float green=(float)Math.random();//0.0 to 1.0
		float blue=(float)Math.random();//0.0 to 1.0
		setBackground(new Color(red,green,blue));
		//setBackground(new Color(65,90,112));
		}
	});
	
	addMouseMotionListener(new MouseMotionAdapter()
	{
		public void mouseMoved(MouseEvent e)
		{
		//	setBackground(Color.black);
int  red=(int)(Math.random()*200);//0.0 to 1.0
int  green=(int)(Math.random()*200);//0.0 to 1.0
int  blue=(int)(Math.random()*200);//0.0 to 1.0
setBackground(new Color(red,green,blue));
		//setBackground(new Color(65,90,112));
		System.out.println(red+" "+green+" "+blue);
		}
	});

	
	}
	
	
	static public void main(String...asdfsf)throws Exception
	{
	new SwgDemo1();	//anonymous
	}
	



}