package com.java.awt.components;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class CheckboxDemo extends Frame implements ItemListener {
	
	Label l;
	Checkbox c1,c2,c3;
	
	public CheckboxDemo(){
		super("Check Box Demo");
		
		l=new Label("Enter ");
		c1=new Checkbox("Java");
		c2=new Checkbox("Python");
		c2=new Checkbox("Cpp");
		
		setLayout(new FlowLayout());
		add(l);
		add(c1);
		add(c2);
		add(c3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckboxDemo f=new CheckboxDemo();
		f.setSize(500,400);
		f.setVisible(true);
		f.addWindowListener(new java.awt.event.WindowAdapter() {
	          public void windowClosing(java.awt.event.WindowEvent windowEvent) {
	              System.exit(0);
	          }
	      });
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String str="";
		if(c1.getState())
			str=str+" "+c1.getLabel();
		if(c2.getState())
			str=str+" "+c2.getLabel();
		if(c3.getState())
			str=str+" "+c3.getLabel();
		if(str.isEmpty())
			str="Nothing is Selected";
		l.setText(str);
		
	}

}
