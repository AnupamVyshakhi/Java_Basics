package exmref;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
public class Counter implements ActionListener{
JFrame f;
JPanel p;
JButton b1,b2,b3;
JTextField t;
JLabel l;
Counter()
{
	f=new JFrame("COUNTER");
	p=new JPanel();
	l=new JLabel("COUNTER");
	l.setBounds(200,100,100,25);
	t=new JTextField(0);
	t.setBounds(100,200,100,25);
	t.setText("0");
	b1=new JButton("COUNT UP");
	b1.setBounds(200,200,150,25);
	b2=new JButton("COUNT DOWN");
	b2.setBounds(350,200,150,25);
	b3=new JButton("RESET");
	b3.setBounds(500,200,150,25);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	p.add(l);
	p.add(t);
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.setLayout(null);
	f.add(p);
	f.setSize(500,500);
	f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
	
	if(e.getSource()==b1)
	{
	
		String s=t.getText();
		int a=Integer.parseInt(s);
		a++;
		String rs=String.valueOf(a);
		t.setText(rs);
	}
	if(e.getSource()==b2)
	{
		
		String s=t.getText();
		int a=Integer.parseInt(s);
		a--;
		if(a<0)
		{
			t.setText("0");
		}
		else
		{
			String rs=String.valueOf(a);
			t.setText(rs);
		}
		
	}
	if(e.getSource()==b3)
	{
		t.setText("0");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Counter();
	}

}
