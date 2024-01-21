package com.java.awt.components;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListBoxDemo extends Frame implements ItemListener,ActionListener {
	
	List l;
	Choice c;
	TextArea ta;
	
	ListBoxDemo(){
		super("ListBox Demo");
		l=new List(4,true);
		c=new Choice ();
		ta=new TextArea(20,30);
		
		l.add("Monday");
		l.add("Tuesday");
		l.add("Wednesday");
		l.add("Thursday");
		l.add("Friday");
		l.add("Saturday");
		l.add("Sunday");
		
		c.add("January");
		c.add("February");
		c.add("March");
		c.add("April");
		c.add("May");
		c.add("June");
		c.add("July");
		c.add("August");
		c.add("September");
		c.add("October");
		c.add("November");
		c.add("December");
		
		//default layout is border layout
		setLayout(new FlowLayout());
		add(l);
		add(c);
		add(ta);
		
		l.addItemListener(this);
		c.addItemListener(this);
		l.addActionListener(this);
		
	}
	
	
	
	public static void main(String[] args) {
		ListBoxDemo f=new ListBoxDemo();
		f.setSize(500,500);
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
		if(e.getSource()==l)
			ta.setText(l.getSelectedItem());
		else
			ta.setText(c.getSelectedItem());
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String list[]=l.getSelectedItems();
		String txt="";
		
		for(String x:list)
			txt+=x+"\n";
		ta.setText(txt);
		
		
		
	}
}
