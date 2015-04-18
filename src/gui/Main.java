package gui;
import java.awt.Color;

import javax.swing.*;

public class Main {
	
	public static void main(String[] args){
		JFrame window=new JFrame("Company Name");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.decode("#3B5998"));
		
		JPanel panel=new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(90, 70, 40, 40));
		panel.setBackground(Color.decode("#3B5998"));
		
		JFrame space=new JFrame();
		JLabel l=new JLabel("Company Name");
		panel.add(l);
		window.getContentPane().add(panel);
		
		
		window.pack();
		window.setVisible(true);
	}
}
