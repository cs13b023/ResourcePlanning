package gui;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Main {
	static JFrame window;
	
	public static void main(String[] args){
		
		javax.swing.SwingUtilities.invokeLater( new Runnable() {
			
			@Override
			public void run() {
				Gui g = new Gui(  );
				g.createAndShowGUI();
			}
		});

						
	}

	
}