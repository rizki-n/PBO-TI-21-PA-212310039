package com.ibik.pbo.praktikum;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class latihan2 extends JFrame{
	
	private JTextField isi1, isi2, isi3;
	private JComboBox pilih;
	
	latihan2(){
		setVisible(true);
		setTitle("Latihan 2");
		setLocationRelativeTo(null);
		pack();
		setSize(300, 400);
		setResizable(false);
		GUI(this);
	}
	
	public static void main(String[] args) {
		new latihan2();

	}

	private void GUI(latihan2 frame) {
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		
		JLabel label1 = new JLabel("Fullname");
		label1.setBounds(20,20,150,30);
		panel1.add(label1);
		
	
		isi1 = new JTextField();
		isi1.setBounds(110,20,150,30);
		isi1.setText(null);
		panel1.add(isi1);
		
		JLabel label2 = new JLabel ("Email");
		label2.setBounds(20, 70,150,30);
		panel1.add(label2);
		
		isi2 = new JTextField();
		isi2.setBounds(110, 70,150,30);
		isi2.setText(null);
		panel1.add(isi2);
		
		JLabel label3 = new JLabel ("Phone");
		label3.setBounds(20, 120,150,30);
		panel1.add(label3);
		
		isi3 = new JTextField();
		isi3.setBounds(110, 120,150,30);
		isi3.setText(null);
		panel1.add(isi3);
		
		JLabel label4 = new JLabel("Gender");
		label4.setBounds(20,170,150,30);
		panel1.add(label4);
		
		JRadioButton gender1 = new JRadioButton("Female");
		gender1.setBounds(190, 170, 150, 30);
		panel1.add(gender1);
		
		JRadioButton gender2 = new JRadioButton("male");
		gender2.setBounds(105, 170, 150, 30);
		panel1.add(gender2);
		
		ButtonGroup gender = new ButtonGroup();
		gender.add(gender1); gender.add(gender2);
		
		JLabel cityzen = new JLabel("Cityzen");
		cityzen.setBounds(20, 220, 150, 30);
		panel1.add(cityzen);
		
		String negara [] = {"Indonesia","British","Denmark","Russia"};
		
		pilih = new JComboBox(negara);
		pilih.setBounds(110, 220, 150, 30);
		panel1.add(pilih);
		
		JButton submit = new JButton("SUBMIT");
		submit.setBounds(70, 285, 150, 30);
		panel1.add(submit);
		
		submit.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				showdata();
				
			}
		});
		
		frame.add(panel1);
	}
	
	protected void showdata() {
		String output="";
		if((!isi1.getText().isEmpty()) && (!isi2.getText().isEmpty()) && (!isi3.getText().isEmpty())){
			output+="Fullname : "+isi1.getText()+"\n";
			output+="Email	  : "+isi2.getText()+"\n";
			output+="Phone	  : "+isi3.getText()+"\n";
			output+="Negara   : "+pilih.getSelectedItem().toString();
			JOptionPane.showMessageDialog(null, output);
		}
		else {
			output = "Kolom tidak boleh kosong";
			JOptionPane.showMessageDialog(null, output);
		}
	}
}
	
