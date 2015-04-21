package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.*;

public class Gui  {
	
	JFrame window;
	JPanel panel;
	
	public void createAndShowGUI(){
		//We could do this with margins but that would require fixing the size of the frame , which would 
				//make the window resolution dependent and not resizable . 
				//BorderLayout may be better 
				
				window=new JFrame("Company Name");
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				panel=new JPanel(new GridBagLayout());
				panel.setBackground(Color.decode("#3B5998"));
				GridBagConstraints c=new GridBagConstraints();
				window.getContentPane().add(panel);		
				
				c.fill=GridBagConstraints.BOTH;
				c.anchor=GridBagConstraints.NORTHWEST;
				c.gridx=0;
				c.gridy=0;
				c.weighty=100;
				c.weightx=1.35;
				c.gridheight=3;
				panel.add(new JButton("left"),c);
				

				c.gridx=1;
				c.gridy=0;
				c.weightx=1;
				c.weighty=0.5;
				c.gridheight=1;
				panel.add(new JButton("Top"),c);
				
				//c.fill=GridBagConstraints.HORIZONTAL;
				c.gridx=1;
				c.gridy=1;
				c.weighty=1;
				c.weightx=1;
				c.gridheight=1;
				JPanel menu=new JPanel(new GridLayout(6,1,10,10));
				menu.setOpaque(false);
				JLabel Companyname=new JLabel("Company Name",SwingConstants.CENTER); //COMPANY NAME JLABEL
				menu.add(Companyname);
				
				//Buttons
				final JButton button1=new JButton("ADD new Project");
				button1.setOpaque(false);
				button1.setContentAreaFilled(false);
				button1.setBorderPainted(false);
				button1.setFont(button1.getFont().deriveFont(Font.BOLD,23));
				button1.setForeground(Color.BLACK);
				button1.addMouseListener(new MouseAdapter(){
					public void mouseEntered(MouseEvent e){
						button1.setForeground(Color.CYAN);
					}
					public void mouseClicked(MouseEvent e){
						System.out.println("Clicked-b1");
						addNewProject();
					}
					public void mouseExited(MouseEvent e){
						button1.setForeground(Color.black);
					}
				});
				menu.add(button1);
				
				final JButton button2=new JButton("ADD new Employee");
				button2.setOpaque(false);
				button2.setContentAreaFilled(false);
				button2.setBorderPainted(false);
				button2.setFont(button2.getFont().deriveFont(Font.BOLD,23));
				button2.setForeground(Color.white);
				button2.addMouseListener(new MouseAdapter(){
					public void mouseEntered(MouseEvent e){
						button2.setForeground(Color.CYAN);
					}
					public void mouseExited(MouseEvent e){
						button2.setForeground(UIManager.getColor("control"));
					}
				});
				menu.add(button2);
				
				
				final JButton button3=new JButton("Project Status");
				button3.setOpaque(false);
				button3.setContentAreaFilled(false);
				button3.setBorderPainted(false);
				button3.setFont(button3.getFont().deriveFont(Font.BOLD,23));
				button3.setForeground(Color.white);
				button3.addMouseListener(new MouseAdapter(){
					public void mouseEntered(MouseEvent e){
						button3.setForeground(Color.CYAN);
					}
					public void mouseExited(MouseEvent e){
						button3.setForeground(UIManager.getColor("control"));
					}
				});
				menu.add(button3);
				
				final JButton button4=new JButton("Employee Status");
				button4.setOpaque(false);
				button4.setContentAreaFilled(false);
				button4.setBorderPainted(false);
				button4.setFont(button4.getFont().deriveFont(Font.BOLD,23));
				button4.setForeground(Color.white);
				button4.addMouseListener(new MouseAdapter(){
					public void mouseEntered(MouseEvent e){
						button4.setForeground(Color.CYAN);
					}
					public void mouseExited(MouseEvent e){
						button4.setForeground(UIManager.getColor("control"));
					}
				});
				menu.add(button4);
				
				final JButton button5=new JButton("Company Status");
				button5.setOpaque(false);
				button5.setContentAreaFilled(false);
				button5.setBorderPainted(false);
				button5.setFont(button5.getFont().deriveFont(Font.BOLD ,23));
//				button5.setForeground(Color.green);
				button5.addMouseListener(new MouseAdapter() {
				    public void mouseEntered(MouseEvent evt) {
				        button5.setForeground(Color.CYAN);
				    }

				    public void mouseExited(MouseEvent evt) {
				        button5.setForeground(UIManager.getColor("control"));
				    }
				});
				menu.add(button5);
				panel.add(menu,c);
				
				c.gridx=1;
				c.gridy=2;
				c.weightx=1;
				c.weighty=0.8;
				c.gridheight=1;
				panel.add(new JButton("Bottom"),c);
				
				c.fill=GridBagConstraints.BOTH;
				c.gridx=2;
				c.gridy=0;
				c.weighty=1;
				c.weightx=1.7;
				c.gridheight=3;
				panel.add(new JButton("Right"),c);
				
				window.pack(); 
				window.setVisible(true);		
		
	}
	

	private void addNewProject(){
		
		
		
		
		
		panel.removeAll();
		GridBagConstraints c=new GridBagConstraints();
		
		c.anchor=GridBagConstraints.NORTHWEST;
		c.fill=GridBagConstraints.BOTH;
		
		c.gridx=0;
		c.gridy=0;
		c.weightx=0.1;
		c.weighty=1;
		c.gridheight=3;
		panel.add(new JLabel(),c);
		
		c.gridx=1;
		c.gridy=0;
		c.gridwidth=2;
		c.weightx=1;
		c.gridheight=1;
		c.weighty=0.1;
		JLabel title=new JLabel("Schedule New Project");
		title.setAlignmentX(Component.RIGHT_ALIGNMENT);
		title.setFont(title.getFont().deriveFont(Font.BOLD, 35));
		title.setBorder(BorderFactory.createEmptyBorder(0, 70, 0, 0));
		panel.add(title,c);
		
		c.gridx=1;
		c.gridy=1;
		c.gridwidth=2;
		c.gridheight=1;		
		c.weighty=1.2;
		JPanel content=new JPanel( );
		content.setOpaque(false);
		content.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		content.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel projectname=new JLabel("Project-Name:");
		content.add(projectname);
		final JTextField name=new JTextField("ProjectName",20);
		content.add(name);
		JLabel priority=new JLabel("Priority:");
		content.add(priority);
		final JTextField prior=new JTextField("Proiority Level",20);
		content.add(prior);
		JLabel deadline=new JLabel("Deadline:");
		content.add(deadline);
		final JTextField date=new JTextField("Deadline dd-MM-yyyy",20);
		content.add(date);
		
		//Add steps
		
		
		
		JButton save=new JButton("Save");
		save.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String pname=name.getText();
				String pprior=prior.getText();
				String pdate=date.getText();
			}	
		});
		content.add(save);
		panel.add(content,c);
		
		c.gridx=1;
		c.gridy=2;
		c.gridwidth=2;
		c.gridheight=1;
		c.weighty=0.2;
		panel.add(new JLabel(),c);
		
		c.gridx=3;
		c.gridy=0;
		c.gridwidth=2;
		c.gridheight=3;
		c.weightx=0.2;
		c.weighty=1;
		panel.add(new JButton("Right"),c);
		
		
		
		window.pack();
		//window.add(panel2);		
	}

}

