package Framesprograms;

import java.awt.*;
import java.awt.event.*;
class MouseHandlingDemo extends Frame implements MouseListener
{
	Label l;
	String msg;
	public MouseHandlingDemo()
	{
		setLayout(new FlowLayout());
		l=new Label("Mouse Operations           ");
        add(l);

		this.addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
       msg="Mouse Cliked "+me.getX()+" "+me.getY();
	   l.setText(msg);
	   setBackground(Color.red);
	}
	public void mousePressed(MouseEvent me)
	{
		msg="Mouse Pressed "+me.getX()+" "+me.getY();
	    l.setText(msg);
		setBackground(Color.blue);
	}
	public void mouseReleased(MouseEvent me)
	{
		msg="Mouse Released "+me.getX()+" "+me.getY();
	    l.setText(msg);
		setBackground(Color.green);
	}
	public void mouseEntered(MouseEvent me)
	{
		msg="Mouse Entered "+me.getX()+" "+me.getY();
	    l.setText(msg);
		setBackground(Color.cyan);
	}
	public void mouseExited(MouseEvent me)
	{
		msg="Mouse Exited";
	    l.setText(msg);
		setBackground(Color.gray);
	}
	public static void main(String args[])
	{
		MouseHandlingDemo m1=new MouseHandlingDemo();
		m1.setSize(500,500);
		m1.setVisible(true);
		m1.setTitle("Mouse Handling Demo");
		m1.setBackground(Color.black);
	}
}

/* Write a java applet program to display the piechart using AWT Components.

import java.awt.*;
import java.awt.event.*;
class PieChartDemo extends Frame
{
  
   int start=0;
   int values[];
   Color colors[]={Color.red, Color.green, Color.blue, Color.orange,Color.cyan,Color.pink};
   public PieChartDemo(int arr[])
   {
       values=arr;
       this.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we)
        {
          System.exit(0);
        }});
   }
   public void paint(Graphics g)
   {
     for(int i = 0; i<values.length; i++) 
      {
            g.setColor(colors[i%colors.length]);
            g.fillArc(150, 150, 200, 200, start, values[i]);
            start = start + values[i];
       }
    }
   public static void main(String args[])
   {
      PieChartDemo f=new PieChartDemo(new int[]{90,90,60,60,60});
       f.setSize(500,500);
       f.setVisible(true);
       f.setTitle("Pie Chart");
   }
}
*/