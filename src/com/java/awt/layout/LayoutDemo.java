package com.java.awt.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class LayoutDemo extends Frame{
	
	Button b1,b2,b3,b4,b5,b6;
	
	LayoutDemo(){
		super("FlowLayoutDemo");
		
		b1=new Button("One");
		b2=new Button("Two");
		b3=new Button("Three");
		b4=new Button("Four");
		b5=new Button("Five");
		b6=new Button("Six");
		
		
		//these below lines of code are for FlowLayout
//		FlowLayout fl=new FlowLayout();
//		fl.setAlignment(FlowLayout.CENTER);
//		fl.setHgap(100);
//		setLayout(fl);
		
		
		//these below lines of code are for Borderlayout
		add(b1,BorderLayout.NORTH);
//		add(b2,BorderLayout.EAST);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
		
		
		Panel p=new Panel();
		p.setLayout(new GridLayout(3,1)); //rows,column
		p.add(new Button("Mon"));
		p.add(new Button("Tue"));
		p.add(new Button("Wed"));
		add(p,BorderLayout.EAST);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		LayoutDemo f=new LayoutDemo();
		f.setSize(500,500);
		f.setVisible(true);
		f.addWindowListener(new java.awt.event.WindowAdapter() {
	          public void windowClosing(java.awt.event.WindowEvent windowEvent) {
	              System.exit(0);
	          }
	      });
	}
}
