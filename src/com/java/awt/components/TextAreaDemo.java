package com.java.awt.components;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaDemo extends Frame implements ActionListener {
	
	TextArea ta;
	TextField tf;
	Label l;
	Button b;
	
	public TextAreaDemo() {
		
		super("TextArea Demo");
		
		l=new Label("No Text Entered");
		ta=new TextArea(10,30);
		tf=new TextField(20);
		b=new Button("Click");
		
		setLayout(new FlowLayout());
		add(ta);
		add(l);
		add(tf);
		add(b);
		b.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		TextAreaDemo f=new TextAreaDemo();
		f.setSize(500,500);
		f.setVisible(true);
		f.addWindowListener(new java.awt.event.WindowAdapter() {
	          public void windowClosing(java.awt.event.WindowEvent windowEvent) {
	              System.exit(0);
	          }
	      });
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		l.setText(ta.getSelectedText());
//		ta.append(tf.getText());
		ta.insert(tf.getText(),ta.getCaretPosition());
	}
}
