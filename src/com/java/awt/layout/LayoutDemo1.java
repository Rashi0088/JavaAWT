
package com.java.awt.layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class LayoutDemo1 extends Frame {

	Button b1, b2, b3, b4, b5, b6;

	LayoutDemo1() {

// *****************************FOR GridBagLayout*****************************
		super("GridBagLayout Demo");

		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		setLayout(gb);

		b1 = new Button("One");
		b2 = new Button("Two");
		b3 = new Button("Three");
		b4 = new Button("Four");
		b5 = new Button("Five");
		b6 = new Button("Six");

		gbc.gridx = 1;
		gbc.gridy = 1;

		add(b1, gbc);

		gbc.gridx = 2;
		gbc.gridy = 2;

		add(b2, gbc);

		gbc.gridx = 3;
		gbc.gridy = 3;
		add(b3, gbc);

		gbc.gridx = 4;
		gbc.gridy = 4;
		add(b3, gbc);

		gbc.gridx = 5;
		gbc.gridy = 5;
		add(b4, gbc);

		gbc.gridx = 6;
		gbc.gridy = 6;
		add(b5, gbc);

		gbc.gridx = 7;
		gbc.gridy = 7;
		add(b6, gbc);
// ***************************** FOR GridBagLayout*****************************
		
		
		

//     ******************* FOR GridLayout*****************************
//		super("GridLayout Demo");
//		setLayout(new GridLayout(3,3));
//		
//		b1=new Button("One");
//		b2=new Button("Two");
//		b3=new Button("Three");
//		b4=new Button("Four");
//		b5=new Button("Five");
//		b6=new Button("Six");
//		
//		add(b1);
//		add(b2);
//		add(b3);
//		add(b4);
//		add(b5);
//		add(b6);
//		add(new Button("Seven"));
//		******************* FOR GridLayout*****************************

	}

	public static void main(String[] args) {
		LayoutDemo1 f = new LayoutDemo1();
		f.setSize(500, 500);
		f.setVisible(true);
		f.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}
}
