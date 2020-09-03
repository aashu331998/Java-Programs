	import javax.swing.JFrame;
	import java.awt.Color;
	import javax.media.Player;
	import java.awt.Font;
	import java.awt.FlowLayout;
	import javax.swing.ImageIcon;
	import java.awt.Button;
	import javax.swing.JButton;
public class  SwgDemo2 extends JFrame
{

	{
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new FlowLayout());
	Button btn=new Button("awt");
	//JButton btn1=new JButton("swing");
JButton btn1=new JButton("",new ImageIcon("C:\\Users\\ASUS\\Desktop\\programming\\booknow.gif"));
	btn1.setToolTipText("this is swing button");
	setResizable(true);
	add(btn);
	add(btn1);
	setVisible(true);
	setSize(500,500);//w,h
	setBackground(Color.pink);
	}
	static public void main(String...asdfsf)throws Exception
	{
		new SwgDemo2();	//anonymous
	}
}