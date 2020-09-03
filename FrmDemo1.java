import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/*
<Applet code = "FrmDemo1.class"width="400"height="400">
</Applet>
*/
public class FrmDemo1 extends Applet
{
public void inti()
{
setBackground(Color.pink); 
}
public void paint(Graphics g)
{
g.drawString("welcome",200,200);
}
}