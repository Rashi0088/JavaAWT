package com.java.awt.practice;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Topic1Components extends Frame {

	public Topic1Components() {
		
		setVisible(true);
		setSize(500,400);
		setLayout(null);
		setTitle("Components");
		setResizable(true);
		
		
		//For Window closing - Start
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		//For Window closing - End
		
		
		
		Button button=new Button("Click Here");
		button.setBounds(100,100,200,30);
		add(button);
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked");
				
			}
		});
		
		
		
		Canvas canvas=new Canvas();
		 canvas = new Canvas();
	     canvas.setBounds(100, 150, 200, 100);
	     canvas.setBackground(Color.pink);
	     add(canvas);
	        
	        
		Checkbox checkBox = new Checkbox();
		Choice choice =new Choice();
		
		Label label=new Label("Name: ");
		label.setSize(300, 200);
		add(label);
		
		TextField textField=new TextField();
		textField.setSize(10, 20);
		add(textField);
		
		List li =new List();
		li.add("Num", 4);		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds (100, 100, 50, 100);  
		
		
		TextArea textArea=new TextArea();
		
		
		
		
		
	}
	


	
	public static void main(String[] args) {
		new Topic1Components();
	}
}
