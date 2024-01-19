package com.java.awt.practice;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//containers where we add components (buttons,label,etc)-located
public class ComponentsExample1 {
	
	public static void main(String[] args) {
		
		Frame f=new Frame();
		Panel p=new Panel();
		Button b=new Button();
		
		
		 b.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.out.println("Button Clicked!");
	            }
	        });

	
	  p.add(b);

      f.add(p);

      f.setSize(300, 200);

      f.setVisible(true);

      f.addWindowListener(new java.awt.event.WindowAdapter() {
          public void windowClosing(java.awt.event.WindowEvent windowEvent) {
              System.exit(0);
          }
      });
	
	 
	}
}
