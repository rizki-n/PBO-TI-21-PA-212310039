package com.ibik.pbo.praktikum;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class latihan3 extends JFrame{
	
	private JTextField isi1, isi2, isi3;
	private JComboBox pilih;
	
	latihan3(){
		setVisible(true);
		setTitle("Latihan 3");
		setLocationRelativeTo(null);
		pack();
		setSize(300, 250);
		setResizable(false);
		GUI(this);
	}
	
	public static void main(String[] args) {
		new latihan3();

	}

	private void GUI(latihan3 frame) {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel label1 = new JLabel("Email");
		label1.setBounds(20,20,150,30);
		panel.add(label1);
		
		isi1 = new JTextField();
		isi1.setBounds(110,20,150,30);
		isi1.setText(null);
		panel.add(isi1);
		
		JLabel label2 = new JLabel ("Password");
		label2.setBounds(20, 70,150,30);
		panel.add(label2);
		
		isi2 = new JTextField();
		isi2.setBounds(110, 70,150,30);
		isi2.setText(null);
		panel.add(isi2);
		
		JCheckBox remember = new JCheckBox("Remember Password?");
		remember.setBounds(70, 120, 150, 30);
		panel.add(remember);
		
		JButton submit = new JButton("SUBMIT");
		submit.setBounds(70, 160, 150, 30);
		panel.add(submit);
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				checkbox();
				
			}
		});
		
		frame.add(panel);
	}
	
	private void checkbox() {
		
		if(!isi1.getText().isEmpty()&&(!isi2.getText().isEmpty())){
			
			JOptionPane.showMessageDialog(null, "Selamat datang Rizki");
		}
		else if(isi1.getText().isEmpty()&&(isi2.getText().isEmpty())){
			
			JOptionPane.showMessageDialog(null, "Kolom Tidak boleh kosong");;
		}
		else {
			JOptionPane.showMessageDialog(null, "Isi data dengan benar");
		}
	}
}
