package com.java.awt.components;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TextFieldDemo extends Frame {

	Label l1, l2;
	TextField tf;
	
//	addWindowListener(new WindowAdapter() {
//		public void windowClosing(WindowEvent we) {
//			System.exit(0);
//		}
//	});

	public TextFieldDemo() {
		
		

		super("TextField Demo");

		l1 = new Label("No Text is Entered Yet");
		l2 = new Label("Enter key is not yet hit");
		tf = new TextField(20);
		tf.setEchoChar('*');

		Handler h = new Handler();

		tf.addTextListener(h);
		tf.addActionListener(h);

		setLayout(new FlowLayout());
		add(l1);
		add(tf);
		add(l2);

	}
	

	class Handler implements TextListener, ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			l2.setText(tf.getText());

		}

		@Override
		public void textValueChanged(TextEvent e) {
			// TODO Auto-generated method stub
			l1.setText(tf.getText());

		}

	}
	



	public static void main(String[] args) {
		TextFieldDemo f = new TextFieldDemo();
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new java.awt.event.WindowAdapter() {
	          public void windowClosing(java.awt.event.WindowEvent windowEvent) {
	              System.exit(0);
	          }
	      });
	}
}
