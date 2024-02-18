package Programs;

/* Write a Java Program that works as a simple calculator. 
 *Use a grid layout to arrange buttons for the digits and for the +-*?% operations.
 * Add a text field to display the result
 */

import java.awt.*; 
import java.awt.event.*;
import java.applet.*;
/* <applet code="Experiment11.class" width=300 height=300></applet> */
public class Experiment11 extends Applet implements ActionListener
{
	String msg=" "; 
	int v1, v2, result; 
	TextField t1;
	Button b[] = new Button[10];
	Button add,sub,mul,div,clear,mod,EQ,BS,dot; 
	char OP;

	public void init()
	{
		Color k=new Color(120,89,90); 
		setBackground(k);
		t1 = new TextField(50);
		GridLayout gl = new GridLayout(4,5); 
		setLayout(gl);
		for(int i=0 ; i<10 ; i++)
		{
			b[i]=new Button("" + i);
		}
		add=new Button("+"); 
		sub=new Button("-"); 
		mul=new Button("X"); 
		div=new Button("/"); 
		mod=new Button("%"); 
		clear=new Button("clear"); 
		EQ=new Button("="); 
		BS=new Button("Back Space");
		dot=new Button(".");
		t1.addActionListener(this);
		add(t1);
		add(BS);
		for(int i=0;i<10;i++)
		{
			add(b[i]);
		}
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod); 
		add(clear);
		add(dot);
		add(EQ);
		for(int i=0;i<10;i++)
		{
			b[i].addActionListener(this);
		}
		add.addActionListener(this); 
		sub.addActionListener(this); 
		mul.addActionListener(this); 
		div.addActionListener(this); 
		mod.addActionListener(this); 
		clear.addActionListener(this); 
		EQ.addActionListener(this);
		BS.addActionListener(this);
	}

	private void setLayout(GridLayout gl) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand(); 
		char ch = str.charAt(0);
		if ( Character.isDigit(ch)) 
			t1.setText(t1.getText()+str);
		else if(str.equals("+"))
		{
			v1=Integer.parseInt(t1.getText()); OP='+';
			t1.setText("");
		}
		else if(str.equals("-"))
		{
			v1=Integer.parseInt(t1.getText()); OP='-';
			t1.setText("");
		}
		else if(str.equals("X"))
		{
			v1=Integer.parseInt(t1.getText()); OP='*';
			t1.setText("");
		}
		else if(str.equals("/"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='/';
			t1.setText("");
		}
		else if(str.equals("%"))
		{
			v1=Integer.parseInt(t1.getText()); 
			OP='%';
			t1.setText("");
		}
		else if(str.equals("Back Space"))
		{
			String s=t1.getText();
			s=s.substring(0,s.length()-1);
			t1.setText(s);
		}
		if(str.equals("="))
		{
			v2=Integer.parseInt(t1.getText()); 
			if(OP=='+')
				result=v1+v2; 
			else if(OP=='-')
				result=v1-v2; 
			else if(OP=='*') 
				result=v1*v2;
			else if(OP=='/') 
				result=v1/v2;
			else if(OP=='%') 
				result=v1%v2;
			t1.setText(""+result);
		}
		if(str.equals("clear"))
		{
			t1.setText("");
		}
		
	}
}
