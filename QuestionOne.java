package anupam.java;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class QuestionOne implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
	       JButton yes = new JButton("YES");
	       JButton no = new JButton("NO");
	       JLabel label = new JLabel(" ");
	       label.setFont(new Font("calibri",Font.BOLD,30));

	       f.setSize(600, 700);
	       yes.setBounds(150, 200, 100, 50);
	       no.setBounds(320, 200, 100, 50);
	       label.setBounds(270, 300, 300, 100);

	       yes.addActionListener( new ActionListener(){
	        public void actionPerformed(ActionEvent e){
	            label.setText("yes");
	        }
	       });

	       no.addActionListener( new ActionListener(){
	        public void actionPerformed(ActionEvent e){
	            label.setText("NO");
	        }
	       });


	       f.add(yes);f.add(no);f.add(label);
	       f.setLayout(null);
	       f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
