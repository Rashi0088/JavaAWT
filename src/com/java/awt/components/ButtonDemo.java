package com.java.awt.components;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame implements ActionListener{
	int count =0;
	Label l;
	Button b;
	
	public MyFrame(){
		super("button Demo");
		l=new Label("   "+count);
		b=new Button("Click");
		b.addActionListener(this);
		
		
		setLayout(new FlowLayout());
		add(l);
		add(b);
		
		b.getActionCommand();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		l.setText(" "+count);
	}
}

public class ButtonDemo {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new java.awt.event.WindowAdapter() {
	          public void windowClosing(java.awt.event.WindowEvent windowEvent) {
	              System.exit(0);
	          }
	      });
	}
}
