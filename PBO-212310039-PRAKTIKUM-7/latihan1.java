package com.ibik.pbo.praktikum;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class latihan1 extends JFrame implements ActionListener{
	
	latihan1(){
	setVisible(true);
	pack();
	setLocationRelativeTo(null);
	setSize(350,150);
	setTitle("Latihan1");
	
	GenerateUI(this);
	}
	public static void main( String[] args )
    {
        new latihan1();
}
	
	private void GenerateUI(final latihan1 frame) {
		
		JButton button1 = new JButton("English");
		JButton button2 = new JButton("Spanish");
		JButton button3 = new JButton("IBIK");
		
		
		
		frame.add(button1);frame.add(button2);frame.add(button3); 
		frame.setLayout(new FlowLayout());
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hallo");
				
			}
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola");
				
			}
		});
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Institut Bisnis Informatika Kesatuan");
				
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
